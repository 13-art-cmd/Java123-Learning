class Vehicle{
    //data members of the class
    int price;
    String name;

    //Default Constructor with no parameters
    Vehicle(){
        System.out.println("Welcome to our Vehicle Agency!");
    }
    
    //Parameterized Constructor 
    Vehicle(int price){
        this.price = price;
    }

    void Bike(){
        System.out.println("You purchased a Motorcycle");
        System.out.println("Price of the bike is: " + price);
    }

    //Copy Constructor
    Vehicle(Vehicle v){
        //We assign object because so that it can copy value from refernced object.
        this.price = v.price;
        this.name = v.name;
        System.out.println("The name of the bike owner is: " + name);
        System.out.println("The price of the bike is: " + price);
    }

    Vehicle(String name,int price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Raj",10000);
        Vehicle v2 = new Vehicle(8000);
        v2.Bike();
        v1.Bike();
        Vehicle v3 = new Vehicle(v1);
    }
}