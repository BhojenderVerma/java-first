//find the index of element in given array
public class linerSearch{
    public static int LinerSearch(int number[],int keys){
        for(int i=0;i<number.length;i++){
            if (number[i]==keys){
                return i;

            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14};
        int keys= 10;
        int index = LinerSearch(number,keys);
        if(index == -1){
            System.out.print("not found");

        }else{
            System.out.print("your index number is : "+ index);
        }
    }
}