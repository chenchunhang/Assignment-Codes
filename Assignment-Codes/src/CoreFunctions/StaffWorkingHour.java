/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;
/**
 *
 * @author Daniel
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;
import CoreFunctions.*;
import entity.*;
import java.util.stream.IntStream;

public class StaffWorkingHour {
     Scanner scan = new Scanner(System.in);
    public void StaffWorkingHourFunction(){
       //int[] intArray = { 7, 9, 5, 1, 3 };
   
//System.out.println(Arrays.toString(intArray));
//Arrays.stream(intArray).forEach(System.out::println);
       // System.out.println("Hekko");
        System.out.println("Please select month: ");
        System.out.println("1.September");
        System.out.println("2.Octorber");
       System.out.print("Enter Your Choice: ");
        int answer = scan.nextInt();
       
          if(answer == 1 | answer == 2 ){
            switch(answer){
                case 1:
              int Sep[] = {9, 9, 9, 9, 8, 0,  9, 9, 9, 9, 9, 8, 9,0, 9, 9, 8,9 , 9, 9, 0, 9, 8, 8, 9, 9, 9, 9, 9, 0};
                   // int Sep[] = {10,20,30}; just for testing
        int a = 0;
        System.out.println("September working hour detail: ");
        System.out.println(String.format("%-10s %-12s\n", "Date", "Working Hour"));
        for (int i = 0; i < Sep.length; i++){
            
            
            a++;
          
            System.out.println(a +"\t\t"+ Sep[i]);
            System.out.println("------------------");
        
        }
        
      int sum = IntStream.of(Sep).sum();
System.out.println("The total working hour = " + sum);

            System.out.println("Enter 1 to back to Main menu: ");
            int answer2 = scan.nextInt();
            while(answer2 == 1){
                MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
            }
                      
                    break;
                case 2:
           int Oct[] = {8, 8, 0, 9, 8, 0,  9, 9, 9, 9, 9, 8, 9,0, 9, 9, 8,7 , 9, 9, 0, 9, 8, 8, 9, 9, 9, 4, 9, 0, 9};
        int b = 0;
        System.out.println("October working hour detail: ");
        System.out.println(String.format("%-10s %-12s\n", "Date", "Working Hour"));
        for (int i = 0; i < Oct.length; i++){
            
            
            b++;
          
            System.out.println(b +"\t\t"+ Oct[i]);
            System.out.println("------------------");
        
        }
                        int sum2 = IntStream.of(Oct).sum();
               System.out.println("The total working hour = " + sum2);
                   System.out.println("Enter 1 to back to Main menu: ");
            int answer3 = scan.nextInt();
            while(answer3 == 1){
                MainMenu menu = new MainMenu();
                       menu.MainMenuFunctions();
            }
                    break;
            }
            
            
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Sorry, Input Incorrect. Please try again.");
            this.StaffWorkingHourFunction();
            
        }
       
       
        
        

}
    
}

