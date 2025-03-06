public class methodOverriding {
    public static void main (String [] args){
        Deer d = new Deer();
        d.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything ");
    }
}
class Deer extends Animal{
    void eats(){
        System.err.println("eats grass");
    }
}
