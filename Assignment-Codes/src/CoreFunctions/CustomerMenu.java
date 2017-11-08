/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;
import CoreFunctions.*;
import entity.*;

/**
 *
 * @author leang
 */
public class CustomerMenu {
    
    

    
    Scanner scan = new Scanner(System.in);
    public void CustomerMenu(Customer customer, List<Restaurant> restaurantList){
        String details = "";
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Welcome back,"+ customer.getCustomerName() );
        System.out.println();
        System.out.println("Here is a list of our current restaurant");
        for(int i = 0; i < restaurantList.size(); i ++){
            details += (i + 1) + ". " + restaurantList.get(i) + "\n";
        }
        System.out.println(details);
        System.out.print("Please choose your desired restaurant:");
        int answer = scan.nextInt();
        if(answer <= restaurantList.size()+ 1 && answer>=0 ){
            int choice = answer-1;
            System.out.println(restaurantList.get(choice) + "\n");
        }else{
            System.out.println("Sorry, incorrect input.");
        }
        
        // incomplete method, should have print all the registered restaurant and return back to main menu
    }
}
