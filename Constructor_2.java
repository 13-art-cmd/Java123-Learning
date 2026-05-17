class Grounds{
    String name;
    String Sports;
    Grounds(){
        System.out.println("Welcome to our ground support platform");
    }
    Grounds(String name){
        this.name = name;
        System.out.println("The ground name is: " + name);
    }
    Grounds(Grounds g){
        this.name = g.name;
        this.Sports = g.Sports;
        System.out.println("Ground name is: " + name);
        System.out.println("Sport that can be played is: " + Sports);
    }

    void capacity(int n){
        System.out.println("The Capacity of Stadium is :" + n);
    }
    public static void main(String[] args){
        Grounds g1 = new Grounds();
        Grounds g2 = new Grounds("Dyanchand Stadium");
        g2.Sports = "Hockey";   //g2 value copied from a variable Sports.
        //Advantage of using a declaring a variable outside if you have incomplete copy of a parameter that is not present in other constructor you can use the variable to copy the value of other object.
        Grounds g3 = new Grounds(g2);
        g3.capacity(30000);

    }
}
