public class Super_Revision{
    static int roll = 23;
     void method(){
        System.out.println("I am a parent a method");
     }

    public Super_Revision() {
        System.out.println("It is a parent constructor");
    } 
}

class Inherite extends Super_Revision{
    int roll = 34;
    @Override void method(){
        super.method();
        System.out.println("I am a child method");
    }
    Inherite(){
        super();
        System.out.println("I am a child constructor with super.");
    }
    void read(){
        System.out.println(super.roll);
    }
    public static void main(String[] args){
        Inherite my = new Inherite();
        my.method();
        my.read();
    }
}