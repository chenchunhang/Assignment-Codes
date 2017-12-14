package CoreFunctions;



import java.util.*;
import entity.*;


public class checkStaffInfo {

     ArrayList <Staff> staffInfo=  new ArrayList<>();
      public static int empNum = 1000;
    
    
    public void checkStaffInfomation(){
      
       Scanner scanner = new Scanner(System.in); 
       // System.out.println(staffInfo.get(0).getStaffID());
             
        for(int i=0;i<staffInfo.size();i++)
        {
            System.out.println("Please key in the staff ID:");
            int id= scanner.nextInt();
            System.out.println(id);
            if( staffInfo.get(i).getStaffID() == id)
            {
            
                Staff staff = staffInfo.get(i);
                System.out.println("Name:"+staff.getStaffName()); 
                System.out.println("Phone:"+staff.getStaffPhone());
                System.out.println("Address:"+staff.getStaffAddress());
                System.out.println("Age:"+staff.getStaffAge());
                System.out.println("Status:"+staff.getStaffStatus());
              
                
            }
            else
            {
              System.out.println("no found");

            }        
                
        }   
        
        
    }
    public void createStaffRecord(){
         String answer = "y";
       
        while(answer.equals("y") || answer.equals("Y") ){
            Staff staff = new Staff();
            System.out.println("Please enter staff information\n");
            Scanner scanner = new Scanner(System.in);


            System.out.println("ID:");

           staff.setStaffID(getUniqueEmpId());


            System.out.println("Delivery Boy Name:");
           String name= scanner.nextLine();
           staff.setStaffName(name);

             System.out.println("Deliver Boy Address:");
           String address= scanner.nextLine();
           staff.setStaffAddress(address);

            System.out.println("Delivery Phone Number:");
           int phoneNum= scanner.nextInt();
           staff.setStaffPhone(phoneNum);


            System.out.println("Deliver Boy Age:");
           int age= scanner.nextInt();
           staff.setStaffAge(age);
           
            System.out.println("Deliver Boy Status:Active");
            staff.setStaffStatus("Active");

            
            
           staffInfo.add(staff);
          System.out.println("ID:"+staff.getStaffID());
           System.out.println("Name:"+staff.getStaffName());
           System.out.println("Phone:"+staff.getStaffPhone());
           System.out.println("Address:"+staff.getStaffAddress());
           System.out.println("Age:"+staff.getStaffAge());
           System.out.println("Status:"+staff.getStaffStatus());
          
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
        
        //for(int i=0;i<staffInfo.size();i++){
        System.out.println("Daily Transation Report");
        System.out.println("Delivery Man ID   Delivery Man Name  Total Delivery Completed     Total Distance Delivered " );
        System.out.printf("1001 \t\t\t David \t\t\t  5\t\t\t  12km\n");
         System.out.printf("1002 \t\t\t Victor \t\t 12\t\t\t  40km\n");
          System.out.printf("1003 \t\t\t Meng \t\t\t 18\t\t\t  50km\n");
    
        
        //}
        
        
        
    }
    
    public static int getUniqueEmpId() {
        System.out.println( + empNum);
        return empNum++;
    }
    public void updateInformation(){
       //  Staff staff = new Staff();
       Scanner scanner = new Scanner(System.in); 
             System.out.println("Please key in the staff ID you wish to update:");
             int id= scanner.nextInt();
            // staff.setStaffID(id);
        for(int i=0;i<staffInfo.size();i++)
        {
            if(staffInfo.get(i).getStaffID() == id)
                
            {
                
                Staff staff = staffInfo.get(i);
                System.out.println("Name:"+staff.getStaffName()); 
                System.out.println("Phone:"+staff.getStaffPhone());
                System.out.println("Address:"+staff.getStaffAddress());
                System.out.println("Age:"+staff.getStaffAge());
                System.out.println("Status:"+staff.getStaffStatus());
               
                    System.out.println("Key in the number you wish to update");
                    System.out.println("1. Name");
                    System.out.println("2. Phone Number");
                    System.out.println("3. Address");
                    System.out.println("4. Age");
                   System.out.println("5. Status");
                int id2= scanner.nextInt();
               
                switch(id2)
                {
                    case 1:
                    {
                    System.out.println("Name:"+staff.getStaffName());
                    System.out.println("Enter a new name:");
                    String name= scanner.next();
                    staff.setStaffName(name);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                    break;
                
                    case 2:
                    {
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Enter a new phone:");
                    int phone= scanner.nextInt();
                    staff.setStaffPhone(phone);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                break;
               
                    case 3:
                    {
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Enter a new Address:");
                    String address= scanner.next();
                    staff.setStaffAddress(address);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                    break;
                
                    case 4:
                    {
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Enter a new age:");
                    int age= scanner.nextInt();
                    staff.setStaffAge(age);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                   break;
                   
                   
                    case 5:
                    {
                    System.out.println("Status:"+staff.getStaffStatus());
                    System.out.println("Enter a new status:");
                    String status= scanner.next();
                    staff.setStaffStatus(status);
                    System.out.println("Name:"+staff.getStaffName()); 
                    System.out.println("Phone:"+staff.getStaffPhone());
                    System.out.println("Address:"+staff.getStaffAddress());
                    System.out.println("Age:"+staff.getStaffAge());
                    System.out.println("Status:"+staff.getStaffStatus());
                    }
                   break;
                    
                
                
                
                
            }
            }
            
                
        }
       
              
       
        
    }
    
}
   
    
    

    

