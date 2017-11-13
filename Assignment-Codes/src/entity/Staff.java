/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.*;

public class Staff {
     int staffID;
     String staffName;
     int staffPhone;
     String staffAddress;
     int staffAge;
    
    public int getStaffID(){
   return staffID;
}
    public void setStaffID( int staffID){
   this.staffID=staffID;
}
    public String getStaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    public int getStaffPhone(){
        return staffPhone;
    }
    public void setStaffPhone(int staffPhone){
        this.staffPhone=staffPhone;
    }
    public String getStaffAddress(){
        return staffAddress;
    }
    public void setStaffAddress(String Address){
        this.staffAddress=Address;
        
    }
    public int getStaffAge(){
        return staffAge;
    }
    public void setStaffAge(int staffAge){
        this.staffAge=staffAge;
    }
}