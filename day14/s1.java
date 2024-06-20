//this code is about pattern 2 (advance )where we make various type of pattern in this 
public class s1{
    public static void hollow_rectangle(int totalRows, int totalcol){

        //outer loop
        for(int i= 1;i<=totalRows;i++){

            //inner -column
            for(int j=1;j<=totalcol;j++){
                //cell (i,j)
                if(i == 1 || i == totalRows || j==1 || j==totalcol ) {
                    //bountery cells
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
}                            