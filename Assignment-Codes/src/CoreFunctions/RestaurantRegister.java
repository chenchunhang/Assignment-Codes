package CoreFunctions;

import entity.Restaurant;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

public class RestaurantRegister {

    private List<Restaurant> restaurantList = new ArrayList<>();
    
    public List<Restaurant> RegistrationMenu(){
        
        System.out.println("1. Register Restaurant Details");
        System.out.println("2. Display Restaurant Details Entered");
        System.out.println("3. Store Your Details Into A File");
        System.out.println("4. Return to Menu");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Choice : ");
        int answer = scan.nextInt();
        
        if( answer == 1 || answer == 2 || answer == 3 || answer == 4){
            switch(answer){
            case 1:
                InputDetails();
                break;
            case 2:
                DisplayDetails();
                break;
            case 3:
                StoreDetails();
                break;
            case 4:
                MainMenu main = new MainMenu();
                main.MainMenuFunctions();
                break;
            } 
        }else{
            System.out.println("Please Enter Choices in Menu");
            RegistrationMenu();
        }
        return restaurantList;
    }
    
    public void InputDetails(){
        
        Scanner scan = new Scanner(System.in);
        String answer;
        
        do{
            System.out.println("Your Restaurant Name : ");
            String restaurantName = scan.nextLine();
            
            System.out.println("Your Restaurant Location : ");
            String restaurantLocation = scan.nextLine();
            
            System.out.println("The Owner Name : ");
            String OwnerName = scan.nextLine();
            
            System.out.println("You Restaurant Phone Number : ");
            String restaurantPhone = scan.nextLine();
            
            Restaurant restaurant  = new Restaurant(restaurantName , restaurantLocation, OwnerName, restaurantPhone);
            restaurantList.add(restaurant);
            
            System.out.println("Any details more ? (Y/N)");
            answer = scan.nextLine();
            
        }while( answer.equals("y") || answer.equals("Y")); 
        RegistrationMenu();
    }
    
    public void DisplayDetails(){
        String details = "";
        for (int i = 0; i < restaurantList.size(); ++i) {
            details += (i + 1) + ". " + restaurantList.get(i) + "\n";
        }
        System.out.println(details);
        System.out.println("Your Details have been Stored");
        RegistrationMenu();
    }
    
    public void StoreDetails(){
        try {
            ObjectOutputStream recordfile = new ObjectOutputStream(new FileOutputStream("restaurant.dat"));
            recordfile.writeObject(restaurantList);
            //ooStream.close();
        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Your Details have been Stored");
        RegistrationMenu();
    }
    
    public List<Restaurant> mainRegister() {
        
        RestaurantRegister registration = new RestaurantRegister();   
        
        List<Restaurant> listReturn = new ArrayList<Restaurant>();
        listReturn = registration.RegistrationMenu();
        
        System.out.println(listReturn.get(0).getOwnerName());
        
        
        System.out.println("Thank You");
        return listReturn; //bugged, does not return List
    }
    
}
