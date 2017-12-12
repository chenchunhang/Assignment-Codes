package CoreFunctions;



import java.util.*;
import entity.*;


public class checkStaffInfo {

     ArrayList staffInfo=  new ArrayList();
   
     
     
      Staff staff = new Staff();
      
      
    
    
    public void checkStaffInfo(){
       Scanner scanner = new Scanner(System.in); 
             System.out.println("Please key in the staff ID:");
             int id= scanner.nextInt();
             staff.setStaffID(id);
        for(int i=0;i<staffInfo.size();i++)
        {
            if(staffInfo.get(i).equals(id))
            {
               //System.out.println(staffInfo.toString());
                System.out.println(staff.getStaffName());
               System.out.println(staff.getStaffPhone());
                System.out.println(staff.getStaffAddress());
                System.out.println(staff.getStaffAge());
              //  System.out.println("no record found");
                
            }
            else
            {
                System.out.println("no staff record found");
            }
                
        }
        
        
    }
    public void createStaffRecord(){
         
        
        
        System.out.println("Please enter staff information\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ID:\n");
       int i=1000;
       staff.setStaffID(++i);
      
       
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
       
      
       staffInfo.add(staff);
      System.out.println(staff.getStaffID());
       System.out.println(staff.getStaffName());
       System.out.println(staff.getStaffPhone());
       System.out.println(staff.getStaffAddress());
       System.out.println(staff.getStaffAge());
    
        }
       
    
    public void RetrievePendingOrder(List<Orders> orderlist ){
        
        System.out.println("The pending order list:");
        System.out.println("List of food order\n");
        System.out.println(String.format("%-10s %-12s %-12s %-12s %-12s %-12s\n", "Order ID", "Customer ID", "Order Name", "Order Product ID", "Product Quantity", "Payment Status"));
         for (int i = 0; i < orderlist.size(); i++){
             
             if(orderlist.get(i).getPaymentStatus().equals("Pending")){
                
                System.out.println(orderlist.get(i).toString());
             }
         }
    }
    
    public void DailyTrasactionReport(){
        
        for(int i=0;i<staffInfo.size();i++){
        System.out.println("Daily Transation Report");
        System.out.println("Delivery Man ID:\n"+ staff.getStaffID());
        System.out.println("Delivery Man Name:\n"+staff.getStaffName());
        System.out.println("Total Delivery Completed:\n"); 
        System.out.println("12\n");
        System.out.println("14\n");
        System.out.println("20\n");
        System.out.println("Total Distance Delivered:\n"); 
        System.out.println("40km\n");
        System.out.println("50km\n");
        System.out.println("85km\n");
        System.out.println("");
        }
        
        
        
    }
    public static void main(String args[]){
        checkStaffInfo kk= new checkStaffInfo();
        kk.createStaffRecord();
        kk.checkStaffInfo();
        kk.DailyTrasactionReport();
    }
}
   
    
    

    

