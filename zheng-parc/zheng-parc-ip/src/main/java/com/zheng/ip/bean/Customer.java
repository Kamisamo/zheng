package com.zheng.ip.bean;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/29.
 * @modifier
 * @modifier-data
 */
public class Customer {
    String name;
    Rental rental;

    public Customer(){

    }
    public Customer(Rental rental){
        this.rental = rental;
    }
    public void setRental(Rental rental) {
        this.rental = rental;
    }

    double getTotalCharge(){
        return rental.getCharge();
    }

    public static void main(String[] args) {
        Customer customer = new Customer(new Rental(new Movie(new NewReleasePrice()),10));
        double totalCharge = customer.getTotalCharge();
        System.out.println(totalCharge);
    }
}
