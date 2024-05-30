import java.util.*;
public class day6q5{
    public static void main(String args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your year");
       int year = sc.nextInt();

       boolean x = (year%4) == 0;
       boolean y = (year%100) == 0;
       boolean z = (year%400) == 0;
       
    }
}