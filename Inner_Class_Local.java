class Persons{
    String name;
    Persons(){}
    Persons(String name){
        this.name = name;
    }
    void details(){
        class Gender{
            void show(){
                System.out.println("The citizen is a male");
            }
        }
        class Name{
           void n(){
                System.out.println("The name of the person is: " + name);
           }
        }
        Name n1 = new Name();
        n1.n();
        Gender g1 = new Gender();
        g1.show();
    }

    public static void main(String[] args) {
        Persons p1 = new Persons("Raj Tshring");
        p1.details();
        Persons p2 = new Persons();
        p2.name = "Bilash";
        p2.details();
    }
}
