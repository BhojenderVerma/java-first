import java.util.*;
public class day8q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.print("enter your number : ");
            number = sc.nextInt();
            if(number%2==0){
                evensum += number;

            }else{
                oddsum +=number;
            }System.out.print("if you want to continue press 1 ,oterwise press 0 :");
            choice = sc.nextInt();
            

        }while(choice==1);
        System.out.println("sum of your even number is : "+ evensum);
        System.out.println("sum of odd number is : "+oddsum);
        

    }
}