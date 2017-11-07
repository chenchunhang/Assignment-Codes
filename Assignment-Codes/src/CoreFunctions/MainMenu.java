/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;



import entity.Restaurant;
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
public class MainMenu {
    
    
    Scanner scan = new Scanner(System.in);
    private String LoggedInID = "";
    private List<Restaurant> restaurantList = new ArrayList<>();
    private List<Customer> customer = new ArrayList<Customer>();
    private Customer CustomerLoggedIn = new Customer();
    public void MainMenuFunctions(){
        ///Defining Entity Objects

        
        
        
        System.out.println("Main Menu");
        System.out.println("==========================");
        System.out.println("1.Login to Customer Area");
        System.out.println("2.Login to Restaurant Onwer Area");
        System.out.println("3.Login to Staff Area");
        System.out.println("4.Register an Account");
        System.out.println("5.Exit");
        System.out.println("==========================");
        System.out.print("Enter Your Choice : ");
        int answer = scan.nextInt();
        if(answer == 1 | answer == 2 | answer == 3 | answer == 4 | answer == 5){
            switch(answer){
                case 1:
                    Login login = new Login();
                    CustomerLoggedIn = login.MainLogin(/*Here should put in the ArrayList Customer to refer*/); // This method should allow logged in customer to create an object. 
                    // parse it to Customer choose restaurant.
                    CustomerMenu cmenu = new CustomerMenu();
                    System.out.print("Test Restaurant return : " + restaurantList.get(0).getOwnerName());
                    cmenu.CustomerMenu(CustomerLoggedIn, restaurantList);
                    break;
                case 2:
                    System.out.println("Login to Restaurant Owner Area");
                    //incomplete login function....bypass to RestaurantRegister
                    RestaurantRegister RR = new RestaurantRegister();
                    restaurantList = RR.mainRegister(); //probably bugged. Wont return List1
                    break;
                case 3:
                    System.out.println("Login to Staff Area");
                    //incomplete
                    break;
                case 4:
                    System.out.println();
                    System.out.println();
                    System.out.println("Registration Area");
                    System.out.println("========================");
                    System.out.println("1.Customer Registration");
                    System.out.println("2.Restaurant Owner Registration");
                    System.out.println("Enter Your Choice :");
                    int answer2 = scan.nextInt();
                    if(answer2 == 1){
                        System.out.println("Customer Registration Area");
                        //Customer Registration
                        //1. Call Registration Method
                        //2. Ask Information
                        //3. Return Data back here.(ADD ArrayList)
                    }else if(answer2 == 2){
                        System.out.println("Restaurant Registration Area");
                        //Restaurant Owner Registration Additional Information.
                        //1. Call Registration Method
                        //2. Ask Information
                        //3. Return Data back here.(ADD ArrayList)
                    }else{
                        break;
                    }
                    // Incomplete method. incomplete AccountRegistration methods.
                case 5:
                    GoodBye();
                    break;
            }
           
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Sorry, Input Incorrect. Please try again.");
            this.MainMenuFunctions();
        }
        
        
        
        
    }
    public void GoodBye(){
            System.out.println("Thank you for using the System. Goodbye.");
            System.exit(0);
    }
    
    
    
    public static void main(String args[]){
       MainMenu mainmenu = new MainMenu();
       int loop =1 ;
       while(loop == 1){
        mainmenu.MainMenuFunctions();
       }
    }
}
