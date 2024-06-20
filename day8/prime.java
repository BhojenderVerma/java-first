import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime= true;
        if(n==2){
            System.out.print("n is prime.");
        }else {
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime = false;
                }
            }
                if(isprime==true){
                   System.out.print("n is prime. ");
                }else{
                   System.out.print("n is not prime. ");            
                }
        }
        
    }
}