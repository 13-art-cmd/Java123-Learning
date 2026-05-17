abstract class Stationary{
    Stationary(){      //Constructor used in abstract method
        System.out.println("Welcome to the Store");
    }
    int price  = 1200;
    abstract void Pencil();
    abstract void Pen();
    abstract void Notebook();
    abstract void Books();
}

class Requirements extends Stationary{    //We can use only abstract no others are allowed
    void Pencil(){
        System.out.println("Pencil required is 3");
    }
    void Pen(){
        System.out.println("Pen required is 2");
    }
    void Notebook(){
        System.out.println("Notebook required is 5");
    }
    void Books(){
        System.out.println("Book rquired are:");
        System.out.println("'Galvin'");
        System.out.println("Navathe");
        System.out.println("Rosen");
    }
}

public class Day2{
    public  static void main(String[] args){
        Requirements Raj = new Requirements();
        Raj.Pencil();
        Raj.Pen();
        Raj.Notebook();
        Raj.Books();
        System.out.println(Raj.price);
        Raj.price = 1500;      //We can update the values in abstract classes but this is not allowed in interface
        System.out.println(Raj.price);
    }
}
