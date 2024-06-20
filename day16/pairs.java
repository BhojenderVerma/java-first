public class pairs{
    public static void printpairs(int numbers[]){
        int tp = 0;
        for(int i = 0;i<numbers.length;i++){
            
            int curr = numbers[i];
            // use nasted loop for second digit or pair
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("("+curr+ ","+numbers[j]+")");
                tp++;
            }
            System.out.println();
            
        }System.out.print("numbers of pairs"+ tp);

    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printpairs(numbers);
    }
}