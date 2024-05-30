import java.util.*;
public class fizzbuzz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num = sc.nextInt();
        // switch (number) {
        //     case (number % 3) == 0: System.out.println("fizz");
        //                 break;
        //     case a % 5 == 0: System.out.println("buzz");
        //                 break;
        //
        if (num % 3 == 0 && num % 5 != 0){
            System.out.println("fizz");
        }else if (num % 5 == 0 && num % 3 != 0){
            System.out.println("buzz");
        }else if(num % 5 == 0 && num % 3 == 0){
            System.out.println("fizzbuzz");
        }else{
            System.out.println(num);
        }
    }
}