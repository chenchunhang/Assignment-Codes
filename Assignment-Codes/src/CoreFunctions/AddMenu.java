package CoreFunctions;

import java.util.*;
import entity.*;

/**
 *
 * @author User
 */
public class AddMenu {
    
    private List<Menu> menuList = new ArrayList<>();
    private List<Menu> beverageList = new ArrayList<>();
    private Menu getmenu;
    
    public void ProcessMenu(){
        
        System.out.println("1. Register Menu : ");
        System.out.println("2. Update Menu : ");
        System.out.println("3. Cancel");
        
        Scanner scan = new Scanner(System.in);
        
        int option = scan.nextInt();
        
        if(option <= 0 && option >= 4){
            System.out.println("Please Select the options in the Menu");
            ProcessMenu();
        }else{
            switch(option){
                case 1:
                    InputDetails();
                    break;
                case 2:
                    UpdateDetails();
                    break;
                case 3:
                    break;
            }
        }
        
    }
    
    public void InputDetails(){
        
        Scanner scan = new Scanner(System.in);
        Scanner scandouble = new Scanner(System.in);
        
        String answer;
        
        do{
            System.out.println("Menu ID : ");
            String menuId = scan.nextLine();
            
            char checkFirstId = menuId.charAt(0);
            
            if(checkFirstId != 'F' && checkFirstId != 'D'){
                System.out.println("Please Enter Valid ID");
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
        
        DisplayDetails();
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
        
        String str = "";
        if(option == 1){
            for (int i = 0; i < menuList.size(); ++i) {
            str += (i + 1) + ". " + menuList.get(i) + "\n";
            }
            System.out.println(str);
        }else if(option == 2){
            for (int i = 0; i < beverageList.size(); ++i){
            str += (i + 1) + "." + beverageList.get(i) + "\n";
            }
            System.out.println(str);
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
        DisplayDetails();
        ProcessMenu();
    }
    
    public void DisplayDetails(){
        String menudetails = "";
        String beveragedetails = "";
        
        int i;
        
        for (i = 0; i < menuList.size(); ++i) {
            menudetails += (i + 1) + ". " + menuList.get(i) + "\n";
        }
        
        for (i = 0; i < beverageList.size(); ++i){
            beveragedetails += (i + 1) + "." + beverageList.get(i) + "\n";
        }
        
        System.out.println("Food Menu");
        System.out.println(menudetails);
        System.out.println("Beverages Menu");
        System.out.println(beveragedetails);       
    }
    
    public static void main(String args[]){
        
        AddMenu addmenu = new AddMenu();
        
        addmenu.ProcessMenu();
    }
}
