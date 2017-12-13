package CoreFunctions;



import java.util.*;
import entity.*;


public class checkStaffInfo {

     ArrayList <Staff> staffInfo=  new ArrayList<>();
     Staff staff = new Staff();
      
      private static int empNum = 1000;
    
    
    public void checkStaffInfomation(){
        
       Scanner scanner = new Scanner(System.in); 
             System.out.println("Please key in the staff ID:");
             int id= scanner.nextInt();
            // staff.setStaffID(id);
        for(int i=1;i<staffInfo.size();i++)
        {
            if(!staffInfo.get(i).equals(id))
            {
                System.out.println(staff.getStaffName());
                System.out.println(staff.getStaffPhone());
                System.out.println(staff.getStaffAddress());
                System.out.println(staff.getStaffAge());
            }
            else
            {
             System.out.println("no record found");
                
            }
                
        }
        
        
    }
    public void createStaffRecord(){
         String answer = "y";
       
        while(answer.equals("y") || answer.equals("Y") ){
        System.out.println("Please enter staff information\n");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("ID:\n");
       
       staff.setStaffID(getUniqueEmpId());
      
       
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
       
       System.out.println("Do u want to add record again?(y or Y)");
       answer= scanner.next();
       
     }
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
        System.out.println(staffInfo.size());
        System.out.println("Delivery Man ID:\n"+ staffInfo.get(i).getStaffID());
        System.out.println("Delivery Man Name:\n"+staffInfo.get(i).getStaffName());
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
    public static int getUniqueEmpId() {
        empNum = empNum + 1;
        return empNum;
    }
    public static void main(String args[]){
        checkStaffInfo kk= new checkStaffInfo();
       kk.createStaffRecord();
      // kk.checkStaffInfomation();
       kk.DailyTrasactionReport();
    }
}
   
    
    

    

