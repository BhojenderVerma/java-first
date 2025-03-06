import java.util.*;


public class abstraction {
    public static void main(String[] args) {
         Horse h = new Horse();
         h.eat();
         h.walk();
        
        // Animal  a = new Animal(); you can create an object of abstract class

        System.err.println(h.color);
        h.changeColor();
        System.err.println(h.color);
         
    }
}

abstract class Animal{
     // Abstract class can have constructors also :
    String color;
    int teeth = 32;
    Animal(){
        color = "brown";
    }

    //abstract class can contain both abstract and non abstract functoin like: 
    //non abstract method
    void eat(){
        System.out.println("animals eat");
    }
    
    // abstract method
    abstract void walk();

   
}

class Horse extends Animal
{
    Horse(){
        super.teeth = 55;
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color = "dark brown";
    }
}