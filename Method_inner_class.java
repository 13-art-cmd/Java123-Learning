class Method_inner_class{
    public void display(){
        class details{
            void show(){
                System.out.println("I am a method inner class.");
            }
            void implement(){
                System.out.println("You have implemented an method inner class");
            }
        }
        details d = new details();
        d.show();
        d.implement();
    }

    public static void main(String[] args){
        Method_inner_class Mic = new Method_inner_class();
        Mic.display();
    }
}
