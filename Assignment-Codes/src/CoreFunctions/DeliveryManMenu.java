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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        boolean validation = true;
        String workStatus = "";

        DeliveryManLogin login = new DeliveryManLogin();
        DeliveryManLoggedIn = login.DeliveryManLogin();
       
         DeliveryMan.add(DeliveryManLoggedIn);
          do{ 
         //System.out.println("My Size:>>>"+DeliveryMan.size());
         System.out.println("|****************************************************|");
         System.out.println("");
         System.out.println("    Welcome       "+DeliveryMan.get(0).getDeliveryManName()+ "! ");
         System.out.println("    Shift       : "+DeliveryMan.get(0).getDeliveryManShift());
         System.out.println("    Clock in at : "+ dateFormat.format(date));
         System.out.println("    Status      : "+ workStatus);
         System.out.println("");
         System.out.println("|****************************************************|");
         
       
         
        System.out.println("Food Delivery Menu Function List: ");
        System.out.println("1.View Current Food Order");
        System.out.println("Delivery Man Function List: ");
        System.out.println("2.View Working hour");
        System.out.println("3.Change Working Status");
        System.out.println("4.Clock out");
        System.out.println("5.Return to main menu");
        
        System.out.print("Enter Your Choice: ");
        int answer = scan.nextInt();
        if(answer == 1 | answer == 2 | answer == 3 | answer == 4 | answer == 5){
            switch(answer){
                case 1:
                      System.out.println("");
                      System.out.println("");
                      System.out.println("List of ordered food detail: \n");
                    
                    System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
                  for (int i = 0; i < orderlist.size(); i++){
                          System.out.println(orderlist.get(i));

                  }
                  System.out.println("1.Back to Food Delivery Menu");
                  System.out.print("Enter Your Choice: ");
                  int answer1 = scan.nextInt();
                  if(answer1 == 1){
               
                      validation = false;
                      System.out.println("\n\n");
                      break;
                  }else
                      
                    break;
                case 2:
                    StaffWorkingHour hour = new StaffWorkingHour();
                    hour.StaffWorkingHourFunction();
                    break;
                case 3:
                    int counter1 = 0;
                    while(counter1 == 0){                                        
                    System.out.println("Change current work status");
                    System.out.println("1.Available");
                    System.out.println("2.Delivery");
                    System.out.println("3.Break");
                    System.out.println("Enter Your Choice: ");
                    int answer3 = scan.nextInt();
                    if(answer3 == 1 ){                   
                    workStatus = "Avalilable";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                    }else if(answer3 == 2){
                        
                    workStatus = "Delivery";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                    }else if(answer3 == 3){

                    workStatus = "Break";
                    System.out.println("\n\nWork status change successful!");
                    counter1 = 1;
                    validation = false;
                                                              
                    }else{
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Sorry, Input Incorrect. Please try again.");
                    
                    
                }       
                    }
                    break;
                case 4:
                    DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date1 = new Date();
                    int couter = 0;
                    
                    while(couter == 0){
                    System.out.println("Clocking out the system. Are you sure?");
                    System.out.println("1.Yes");
                    System.out.println("2.Undo");
                    System.out.print("Enter Your Choice: ");
                    int answer2 = scan.nextInt();
                    if(answer2 == 1){
                        System.out.println("|****************************************************|");
                        System.out.println("");
                        System.out.println("    Good Bye "+DeliveryMan.get(0).getDeliveryManName()+ "! ");
                        System.out.println("    Shift : "+DeliveryMan.get(0).getDeliveryManShift());
                        System.out.println("    Clock out at : " + dateFormat1.format(date1));
                        System.out.println("");
                        System.out.println("|****************************************************|\n\n");
                        
                        couter = 1;
                    
                    
                     MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
                    
                    }else if(answer2 == 2){
                        validation = false;
                        System.out.println("\n\n");
                        couter = 1;
                    }
                    }
                    
                    break;
                    case 5:
                       MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
                        
                    break;
            }
            
            
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Sorry, Input Incorrect. Please try again.");
            validation = false;
        }
        }while(!validation);

    }
  /* public static void main(String args[]){
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
*/
    
}
