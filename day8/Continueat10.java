import java.util.*;
public class Continueat10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("enter your digit : ");
            int i = scn.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println("your number is : "+i);
        }while(true);
    }
}
