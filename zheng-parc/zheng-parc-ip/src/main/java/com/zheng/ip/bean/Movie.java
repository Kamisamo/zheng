package com.zheng.ip.bean;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/29.
 * @modifier
 * @modifier-data
 */
public class Movie {
    String title;
    Price price;

    public Movie(){

    }
    public Movie(Price price){
        this.price = price;
    }
    public void setPrice(Price price) {
        this.price = price;
    }

    double getCharge(){
        return price.getCharge();
    }
}
