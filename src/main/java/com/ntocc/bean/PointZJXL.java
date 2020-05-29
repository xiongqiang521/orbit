package com.ntocc.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 中交兴路返回接受的bean
 * @author XQ
 * @version v1.0
 * 2020/5/28 14:25
 */
@Data
public class PointZJXL {
    private String agl;
    private String gtm;
    private String hgt;
    private String lat;
    private String lon;
    private String mlg;
    private String spd;
}
