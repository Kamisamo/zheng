package com.zheng.ip.bean;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/29.
 * @modifier
 * @modifier-data
 */
public class Rental {
    int daysRented;
    Movie movie;
    public Rental(){}
    public Rental(Movie movie,int daysRented){
        this.movie = movie;
        this.daysRented = daysRented;
    }
    double getCharge(){
        return daysRented * movie.getCharge();
    }
}
