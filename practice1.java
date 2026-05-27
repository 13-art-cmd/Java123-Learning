class AutoMobile{
    void move(){
        System.out.println("The Vehicle is moving");
    }
}

class Car extends AutoMobile{
    @Override void move(){
        System.out.println("The car is driving");
    }
}

class Bike extends AutoMobile{
    @Override void move(){
        System.out.println("The Bike is pedaling");
    }
}

public class practice1{
    public static void main(String[] args) {
        AutoMobile Audi = new Car();
        Audi.move();
        AutoMobile Hero = new Bike();
        Hero.move();
    }
}
