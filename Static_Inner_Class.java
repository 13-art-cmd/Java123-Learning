class Out{
    static class staticIn{
        void display(){
            System.out.println("Hello! I am a static Inner Class");
        }
    }

    class innerIn{
        void display(){
            System.out.println("I am a Local Inner class");
        }
    }

    public static void main(String[] args){
        Out.staticIn out = new Out.staticIn();
        out.display();

        Out o = new Out();
        Out.innerIn i = o.new innerIn();
        i.display();

        
    
    }
}