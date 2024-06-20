import java.util.*;
public class biggestinarray{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; // for -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }System.out.println("your smallest number is : " + smallest);
        return largest;

    }
    public static void main(String args[]){
        int number[] = {5,6,8,2,7,9};
        System.out.println("your largest number is : "+ getLargest(number));

    }
}