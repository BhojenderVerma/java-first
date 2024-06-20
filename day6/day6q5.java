import java.util.*;
public class day6q5{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your year :");
       int year = sc.nextInt();
       if(year%4==0){
           if(year%100==0){
               if(year%400==0){
                
               }
            }System.out.print("given year is leap year.");
       }else {
        System.out.print("given year is not a leap year.");
       }
       
    }
}