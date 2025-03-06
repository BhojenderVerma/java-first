public class SuperKeyword {
    public static void main (String  args[]){
        Horse h = new Horse();
        System.err.println(h.color);

    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse (){
        super();
        super.color = "brown";      
        System.out.println("horse consturctor is called");
    }
}