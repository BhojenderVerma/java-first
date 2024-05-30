// weekday and weekend using switch case
import java.util.*;
public class WeekdayWeekend{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your day num : ");
        int num = sc.nextInt();
        switch(num){
            case 1,2,3,4: 
            // case 2: ; case 3: ; case 4: ; mai ye ase bhi leekh skta hu
                //  ager mai case 1: {} ye leekho toh bhi code shi hoga
            case 5:System.out.println("weekday");break; 
            // case 5: {System.out.println("weekday")} ye code ager ase leekho  toh bhi shi hoga
            case 6:
            case 7:System.out.println("weekend");break;
            default :System.out.println("invalid");
        }
    }
}