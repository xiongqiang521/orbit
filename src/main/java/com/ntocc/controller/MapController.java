package com.ntocc.controller;



import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.ntocc.bean.Point;
import com.ntocc.bean.PointZJXL;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.IOUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XQ
 * @version v1.0
 * 2020/5/28 10:09
 */
@Controller
@RequestMapping("/map")
public class MapController {

    @Value("classpath:map.json")
    Resource addTaskJson;


//    @RequestMapping("/")
//    public String index(){
//        return null;
//    }

    @RequestMapping("/getData")
    @ResponseBody
    public String getData() throws Exception {
        String jsonStr = new String(IOUtils.readFully(addTaskJson.getInputStream(), -1,true));
        JSONObject json = JSONObject.parseObject(jsonStr);
        Object result = json.get("result");
        List<PointZJXL> pointList = JSONArray.parseArray(result.toString(), PointZJXL.class);

        List<Point> list=new ArrayList<>(pointList.size());
        for (PointZJXL point : pointList) {
            list.add(new Point(point));
        }

        return JSONArray.toJSONString(list);

    }
}


