class Parents{
    void Birthday(){
        System.out.println("Happy Birthday Beta");
    }
}

class Childs extends Parents{
    @Override
    void Birthday(){
        super.Birthday();
        System.out.println("Thank you Papa and Mummy");
    }
}

public class super1{
    public static void main(String[] args){
        Childs Raj = new Childs();
        Raj.Birthday();
    }
}