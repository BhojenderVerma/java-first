import java.util.*;
public class ternery{
    public static void main(String args[]){
        int number = 44;
        String type = ((number%2) == 0) ? "even":"odd";
        System.out.print(type);
    }
}