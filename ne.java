abstract class Stationary {

    // Constructor in abstract class (allowed ✅)
    Stationary() {
        System.out.println("Welcome to the Store");
    }

    int price = 1200;   // Instance variable

    abstract void Pencil();   // Abstract methods
    abstract void Pen();
}

class Requirements extends Stationary {

    // Must override all abstract methods
    void Pencil() {
        System.out.println("Pencil required is 3");
    }

    void Pen() {
        System.out.println("Pen required is 2");
    }
}

public class ne {
    public static void main(String[] args) {

        Requirements Raj = new Requirements();  // Constructor called

        Raj.Pencil();
        Raj.Pen();

        System.out.println(Raj.price);

        Raj.price = 1500;   // Allowed in abstract class ✅
        System.out.println(Raj.price);
    }
}