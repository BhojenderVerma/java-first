import java.util.*;
public class q3{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float pencil = scn.nextFloat();
        float pen = scn.nextFloat();
        float eraser = scn.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("bill is : " + total);

        float newTotal = total + (0.18f*total);
        System.out.println("bill with 18% tax :"+ newTotal);

    }
}