public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
        Bear b = new Bear();
        b.eatsGrass();


    }
    
}

// Interfaces with total abstraction
interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down left, right, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves (){
        System.out.println("up down , right , left");
    }
}
class King implements  ChessPlayer{
    public void moves(){
        System.out.println("one unit in any direction");
    }
}

//Interfaces for Multiple Inheritance 

interface  Herbivore{
    void jaw();

}
interface  Carnivore{
    void eatsGrass();
        
    

}

class Bear implements Herbivore , Carnivore{ // multiple inheritance
      public void jaw(){
        System.out.println("Strong jaw");
      }

      public void eatsGrass(){
        System.out.println("Does not eat grass");
      }
}