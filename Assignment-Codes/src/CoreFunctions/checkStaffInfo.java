package CoreFunctions;



import java.util.*;
import entity.Staff;

public class checkStaffInfo {

     ArrayList<Staff> staffInfo=  new ArrayList<Staff>();
      Staff staff = new Staff();
      
      
    
    
    public void checkStaffInfo(){
      
        for(int i=0;i<staffInfo.size();i++)
        {
             Scanner scanner = new Scanner(System.in); 
             System.out.println("Please key in the staff ID:");
             String id= scanner.nextLine();
            //staff.getStaffID();
              
           
            if(staffInfo.get(i).getStaffID().equals(id))
            {
                System.out.println(staff.getStaffName());
                System.out.println(staff.getStaffPhone());
                System.out.println(staff.getStaffAddress());
                System.out.println(staff.getStaffAge());
            }
            else
            {
                System.out.println("gg");
            }
                
        }
        
        
    }
    public void createStaffRecord(){
        
        
        System.out.println("Please enter staff information\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ID:\n");
       String id="S001";
       staff.setStaffID(id);
      
       
        System.out.println("Delivery Boy Name:\n");
       String name= scanner.nextLine();
       staff.setStaffName(name);
       
         System.out.println("Deliver Boy Address:\n");
       String address= scanner.nextLine();
       staff.setStaffAddress(address);
       
        System.out.println("Delivery Phone Number:\n");
       int phoneNum= scanner.nextInt();
       staff.setStaffPhone(phoneNum);
       
      
       
        System.out.println("Deliver Boy Age:\n");
       int age= scanner.nextInt();
       staff.setStaffAge(age);
        
       staffInfo.add(staff);
       System.out.println(staff.getStaffID());
       System.out.println(staff.getStaffName());
       System.out.println(staff.getStaffPhone());
       System.out.println(staff.getStaffAddress());
       System.out.println(staff.getStaffAge());
        
    }
    
   
    public static void main(String[] args) {
        checkStaffInfo xd = new checkStaffInfo();
        xd.createStaffRecord();
        xd.checkStaffInfo();
       
    }
    
}
