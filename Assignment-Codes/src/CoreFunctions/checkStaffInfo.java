package CoreFunctions;



import java.util.*;
import entity.*;


public class checkStaffInfo {

     List <Staff> staffInfo=  new ArrayList<Staff>();
     
      
      public static int empNum = 1000;
    
    
    public void checkStaffInfomation(){
       Staff staff = new Staff();
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
            Staff staff = new Staff();
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

            List <Staff> staffInfo2=  new ArrayList<Staff>();
            //int staffID, String staffName, int staffPhone, String address,int staffAge, String staffStatu
/*            Staff testStaff1 = new Staff(1,"1",1,"1",1,"1");
            Staff testStaff2 = new Staff(2,"2",2,"2",2,"2");
            staffInfo2.add(testStaff1);
            staffInfo2.add(testStaff2);
            System.out.println(staffInfo2.get(0).getStaffID());
           System.out.println(staffInfo2.get(1).getStaffID());*/
           staffInfo.add(staff);
          System.out.println(staff.getStaffID());
           System.out.println(staff.getStaffName());
           System.out.println(staff.getStaffPhone());
           System.out.println(staff.getStaffAddress());
           System.out.println(staff.getStaffAge());
           System.out.println(staffInfo.get(0).getStaffID());
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
        System.out.println(staffInfo.get(0).getStaffID());
        System.out.println(staffInfo.get(1).getStaffID());
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
        System.out.println("Here" + empNum);
        return empNum++;
    }
    public static void main(String args[]){
        checkStaffInfo kk= new checkStaffInfo();
       kk.createStaffRecord();
      // kk.checkStaffInfomation();
       kk.DailyTrasactionReport();
    }
}
   
    
    

    

