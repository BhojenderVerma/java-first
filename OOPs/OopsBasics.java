public class oopsBasics {
    
    public static void main(String[] args) {
    Pen p1= new Pen(); // we have create a pen object called p1
    p1.setColor("Blue");
    System.err.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    //p1.setColor("Yellow");
    p1.setColor("Yellow"); //see the above line. 
    System.out.println(p1.getColor());
        
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Rohan Gulaguli";
    // cannot access the password like this:
    //myAcc.password = "abcdefgh";
    
    // so you can  set the password: , but you can never acces the password.
    myAcc.setPassword("abcdefgh");
    }
}
class Pen{
        private String color;
        private int tip;

        String getColor(){//getter
            return this.color;
        }

        int getTip(){
            return this.tip;
        }
    
        void setColor(String color){ //setter
            this.color = color; //see the "this" keyword.
        }
    
        void setTip (int newTip){
            tip = newTip;
        }
}
    
class Student {
        String name ;
        int age;
        float percentage;
    
        void calcPercentage (int phy , int chem , int math){
            percentage = (phy+chem+math)/3;
        }
}

//Access Modifiers
class BankAccount{
    public String username;
    private String password;
    

    public void setPassword(String pwd){
        password = pwd;
    }


}

