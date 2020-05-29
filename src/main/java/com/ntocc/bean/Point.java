package com.ntocc.bean;

import com.ntocc.util.ProintUtil;
import lombok.Data;

/**
 * 百度地图坐标系 bd09
 *
 * @author XQ
 * @version v1.0
 * 2020/5/28 14:24
 */
@Data
public class Point {
    private double lat;
    private double lon;

    public Point() {
    }

    public Point(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Point(PointZJXL pointZJXL) {
        Point point = ProintUtil.Point84_to_bd09(
                Double.parseDouble(pointZJXL.getLat()) / 600000.0,
                Double.parseDouble(pointZJXL.getLon()) / 600000.0
        );
        this.lat = point.getLat();
        this.lon = point.getLon();
    }

}
