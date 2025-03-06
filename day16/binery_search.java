import java.util.*;
public class binery_search{
    public static int BinerySerch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2 ;
            // compersion
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }return-1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6}; //{2,4,6,8,12,5,7};
        int key = 4;
        System.out.println("your index number is : " +BinerySerch(numbers,key));
    }
}