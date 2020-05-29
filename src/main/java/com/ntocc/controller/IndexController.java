package com.ntocc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XQ
 * @version v1.0
 * 2020/5/29 14:39
 */
@Controller
public class IndexController {
    @RequestMapping({"/**.html","/**/**.html","/**/**/**.html"})
    public void index(){

    }
}
