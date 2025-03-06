import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        System.out.println("enter your radius value : ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}