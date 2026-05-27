class Centre{
    String name;
    int seat;
    Centre(){
        this.name = "Not Known";
    }
    Centre(String name){
        this.name = name;
    }
    Centre(String name,int seat){
        this.seat = seat;
        this.name = name;
    }

    void display(){
        System.out.println(name + seat);
    }
    public static void main(String[] args){
        Centre NewDelhi = new Centre("New Delhi");
        NewDelhi.display();
        Centre Mumbai = new Centre(NewDelhi.name);
        Mumbai.display();
    }
}

class Floor extends Centre{
    Floor(){
        System.out.println("There is only one floor and that is ground floor");
    }
}

class Room extends Floor{
    Room(){
        super();
        System.out.println("Room also not known");
    }

    public static void main(String[] args){
        Room neu = new Room();
    }
}