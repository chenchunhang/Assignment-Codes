package CoreFunctions;

import java.util.*;
import entity.*;

/**
 *
 * @author User
 */
public class MaintainMenu {
    
    private List<Menu> menuList = new ArrayList<>();
    private List<Menu> beverageList = new ArrayList<>();
    private Menu getmenu;
    
    public void ProcessMenu(){
        
        System.out.println("Maintain Menu");
        System.out.println("1. Register Menu : ");
        System.out.println("2. Display Menu : ");
        System.out.println("3. Update Menu : ");
        System.out.println("4. Delete Menu : ");
        System.out.println("5. Cancel");
        
        Scanner scan = new Scanner(System.in);
        
        int option = scan.nextInt();
        
        if(option <= 0 && option >= 6){
            System.out.println("Please Select the options in the Menu");
            ProcessMenu();
        }else{
            switch(option){
                case 1:
                    InputDetails();
                    break;
                case 2:
                    DisplayDetails();
                    break;
                case 3:
                    UpdateDetails();
                    break;
                case 4:
                    DeleteDetails();
                    break;
                case 5:
                    MainMenu main = new MainMenu();
                    main.MainMenuFunctions();
                    break;
            }
        }
        
    }
    
    public void InputDetails(){
        
        Scanner scan = new Scanner(System.in);
        Scanner scandouble = new Scanner(System.in);
        
        String answer;
        
        do{
            System.out.println("Menu ID (\"F\" as Food , \"D\" as Drink): ");
            String menuId = scan.nextLine();
            
            char checkFirstId = menuId.charAt(0);
            
            if(checkFirstId != 'F' && checkFirstId != 'D'){
                System.out.println("Please Enter Valid ID (\"F\" as Food , \"D\" as Drink)");
                InputDetails();
            }
            
            System.out.println("Menu Name : ");
            String menuName = scan.nextLine();
            
            System.out.println("Menu Price : ");
            double menuPrice = scandouble.nextDouble();
            
            Menu menu = new Menu(menuId,menuName,menuPrice);
            
            switch(checkFirstId){
                case'F':
                    menuList.add(menu);
                    break;
                case'D':
                    beverageList.add(menu);
                    break;
            }
            
            System.out.println("Any details more ? (Y/N)");
            answer = scan.nextLine();
            
        }while(answer.equals("y") || answer.equals("Y")); 
        
        ProcessMenu();
    }
    
    public void UpdateDetails(){
        
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        Scanner scanDouble = new Scanner(System.in);
        
        System.out.println("Which Menu That You Wanted to Update : ");
        System.out.println("1. Food List");
        System.out.println("2. Beverage List");
        int option = scanInt.nextInt();
        
        if(option == 1){
            DisplayFoodMenu();
        }else if(option == 2){
            DisplayBeverageMenu();
        }else{
            System.out.println("Please Select Exist Menu");
            UpdateDetails();
        }
        
        System.out.println("Please Select The Menu That You Wanted to Update : ");
        int selectmenu = scanInt.nextInt();
        int number = selectmenu - 1;
        
        switch(option){
            case 1:
                getmenu = menuList.get(number);
                break;
            case 2:
                getmenu = beverageList.get(number);
                break;
        }
        
        System.out.println(getmenu);
        
        String id = getmenu.getMenuId();
        
        System.out.printf("Menu Name : ");
        String updatename = scanString.nextLine();
        
        System.out.printf("Menu Price : ");
        double updateprice = scanDouble.nextDouble();
        
        Menu updatemenu = new Menu(id,updatename,updateprice);
        
        switch(option){
            case 1:
                menuList.set(number,updatemenu);
                break;
            case 2:
                beverageList.set(number,updatemenu);
                break;
        }
        ProcessMenu();
    }
    
    public void DeleteDetails(){
        Scanner scanInt = new Scanner(System.in);
        
        System.out.println("Which Menu That You Wanted to Delete : ");
        System.out.println("1. Food List");
        System.out.println("2. Beverage List");
        int option = scanInt.nextInt(); 
        
        if(option == 1){
            DisplayFoodMenu();
        }else if(option == 2){
            DisplayBeverageMenu();
        }else{
            System.out.println("Please Select Exist Menu");
            DeleteDetails();
        }
        
        System.out.println("Please Select The Menu That You Wanted to Delete : ");
        int selectmenu = scanInt.nextInt();
        int number = selectmenu - 1;
        
        switch(option){
            case 1:
                getmenu = menuList.remove(number);
                break;
            case 2:
                getmenu = beverageList.remove(number);
                break;
        }
        
        ProcessMenu();
    }
    
    public void DisplayDetails(){
        
        DisplayFoodMenu();
        DisplayBeverageMenu();
        
        ProcessMenu();
    }
    
    public void DisplayFoodMenu(){
        
        String menudetails = "";  
        
        int i;
        
        for (i = 0; i < menuList.size(); ++i) {
            menudetails += (i + 1) + ". " + menuList.get(i) + "\n";
        }
        
        System.out.println("Food Menu");
        System.out.println(menudetails);
    }
    
    public void DisplayBeverageMenu(){
        
        String beveragedetails = "";
        
        int i;
        
        for (i = 0; i < beverageList.size(); ++i){
            beveragedetails += (i + 1) + "." + beverageList.get(i) + "\n";
        }
        
        System.out.println("Beverages Menu");
        System.out.println(beveragedetails);  
    }
    
    public void mainMaintainMenu(){
        
        MaintainMenu addmenu = new MaintainMenu();
        
        addmenu.ProcessMenu();
    }
}
