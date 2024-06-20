import java.util.*;
public class InputOutput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0]= sc.nextInt(); //chy marks
        marks[1]= sc.nextInt(); //phy marks
        marks[2]= sc.nextInt(); //math marks
        System.out.println("chemistry : " + marks[0]);
        System.out.println("chemistry : " + marks[1]);
        System.out.println("chemistry : " + marks[2]);
        int percentge = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentge : "+percentge+" %");
        System.out.println("length of your array is : "+marks.length); //for find out array length simply just write arrayName.length 

    }

}