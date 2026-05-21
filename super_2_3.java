class Hotels{
    Hotels(){
        System.out.println("Limited discount at all hotels");
        System.out.println("Rooms at just 1800 for one night");
    }
    void details(){
        System.out.println("The cities where hotels are available:");
    }
    void H_name(){
        System.out.println("Ratna");
        System.out.println("gange");
        System.out.println("Ram");
    }
    public int price = 1800;
}

class Holiday extends Hotels{
    public int price = 2400;
    Holiday(){           //You need to write the child constructor name here not parent constructor name to use the parent constructor
        super();
        System.out.println("Price will be updated tommorrow onwards");
    }
    void Update(){
        System.out.println("Early bird price was: " + super.price);
        System.out.println("Updated price is " + price);
    }

    public static void main(String[] args){
        Holiday Day1 = new Holiday();
        Day1.Update();
    }
}