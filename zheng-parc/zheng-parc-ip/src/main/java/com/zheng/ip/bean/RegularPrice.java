package com.zheng.ip.bean;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/29.
 * @modifier
 * @modifier-data
 */
public class RegularPrice implements Price {
    @Override
    public double getCharge() {
        return 1d;
    }
}
