// in a class we can make multiple function.
import java.util.*;
public class Sumfunction{
    public static void javahelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = (a+b);
        System.out.println("sum of a+b is : "+sum);

    }
    public static void main (String args[]){
        calculatesum();
        javahelloworld();
    }
}