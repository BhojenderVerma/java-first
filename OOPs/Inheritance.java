public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        //multilevel inheritence
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 8;
        System.err.println(dobby.legs);

    }
}
//Base class
class Animal {
    String color ;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.err.println("breathes");
    }
}
//Derived class / subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

class Mammals extends Animal{
    int legs ;
}

class Dog extends Mammals{ // multilevel inheritance
    //this class also derives from animal class
    // has all properties of animal and mammals.  
    String breed;
}