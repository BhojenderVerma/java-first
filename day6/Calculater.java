import java.util.*;
public class Calculater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first digit : ");
        int a = sc.nextInt();
        System.out.println("enter your second digit : ");
        int b = sc.nextInt();
        System.out.println("enter your operator");
        char operator  = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                         break;
            case '-' : System.out.println(a-b);
                         break;
            case '*' : System.out.println(a*b);
                         break;
            case '/' : System.out.println(a/b);
                         break;
            case '%' : System.out.println(a%b);
                         break;
            default : System.out.println("wrong statment");
        }

    }
}