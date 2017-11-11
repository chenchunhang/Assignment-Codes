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
 * @author Daniel
 */
public class DeliveryManMenu {
    // fake Order object(ArrayList)
    // fake deliveryman object
    // Main menu
    // Show Current Order(Main Menu)
   // Display fake Order object (Array List)
    Scanner scan = new Scanner(System.in);
  //  private List<Orders> OrdersList = new ArrayList<>();
    private List<DeliveryMan> DeliveryMan = new ArrayList<DeliveryMan>();
    private DeliveryMan DeliveryManLoggedIn = new DeliveryMan();
    
    

    
    
    
    public void showDeliveryMenu(DeliveryMan deliveryman,  List<Orders> orderlist){
        DeliveryManLogin login = new DeliveryManLogin();
         DeliveryManLoggedIn = login.DeliveryManLogin();
       
         DeliveryMan.add(DeliveryManLoggedIn);
         //System.out.println("My Size:>>>"+DeliveryMan.size());
         System.out.println("Welcome "+DeliveryMan.get(0).getDeliveryManName());
        
        System.out.println("Food Delivery Menu");
        System.out.println("1.View Current Food Order");
        System.out.println("2.Return to main menu");
        System.out.print("Enter Your Choice: ");
        int answer = scan.nextInt();
        if(answer == 1 | answer == 2){
            switch(answer){
                case 1:
                    System.out.println("List of food order\n");
                    System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
                  for (int i = 0; i < orderlist.size(); i++){
                          System.out.println(orderlist.get(i));

                  }
                  System.out.println("1.Back to Food Delivery Menu");
                  System.out.print("Enter Your Choice: ");
                  int answer1 = scan.nextInt();
                  if(answer1 == 1){
                      this.showDeliveryMenu(deliveryman, orderlist); //Eating up CPU and Memory resources?
                  }
                    break;
                    case 2:
                    break;
            }
            
            
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Sorry, Input Incorrect. Please try again.");
            this.showDeliveryMenu(deliveryman, orderlist);
            
        }
        

    }
     public static void main(String args[]){
         DeliveryManMenu DeliveryManMenu = new DeliveryManMenu();
         Orders order = new Orders(8001, 5001 , "Fodd" , "aedasd" , 5 , "Paid");
         Orders order2 = new Orders(8002, 5001 , "Fodd" , "aedasd" , 5 , "Paid");
         DeliveryMan logged_DeliveryMan = new DeliveryMan(5001,"Lee", "PUCHONG" , "NIGHT", 3, 0143333333, 24);
         List<Orders> orderlist = new ArrayList<Orders>();
         orderlist.add(order);
         orderlist.add(order2);
         DeliveryManMenu.showDeliveryMenu(logged_DeliveryMan, orderlist );
         //int OrderID, int OrderCustomerID, String OrderName, String OrderProductID, int ProductQuantity, String PaymentStatus
         
     }
    
}
