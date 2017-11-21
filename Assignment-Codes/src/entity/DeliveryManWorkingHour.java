/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Daniel
 */
public class DeliveryManWorkingHour {
    private int hour;
    private int month;
    private int day;
    
    public DeliveryManWorkingHour(){
    
}

    public DeliveryManWorkingHour(int hour, int month, int day) {
        this.hour = hour;
        this.month = month;
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
   
    
}
