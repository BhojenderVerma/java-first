import java.util.*;
public class Dowhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            
            if (n%10==0){
                break; 
                // '''for break any statment to somewhere.we use break'''
                
            }
            System.out.println(n);
        }while(true);
    }
}