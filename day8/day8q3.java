import java.util.*;
public class day8q3{
    public static void main(String args[]){
        scanner sc =  new scanner(System.in);
        int n;  
        int fact = 1;
        System.out.print("enter your number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }System.out.println(fact);

    }
}