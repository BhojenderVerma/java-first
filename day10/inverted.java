public class inverted{
    public static void main(String args[]){
        int line;
        int star;
        int n =7;
        for(line=1;line<=n;line++){
            for(star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }System.out.println();
        }
    }
}