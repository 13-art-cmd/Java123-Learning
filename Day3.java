final class Countries{
    void continent(){
        System.out.println("The continent are North America, South America, Asia, Europe, Africa, Austraila, Antartica");
    }

    public static void main(String[] args){
        Countries c = new Countries();
        c.continent();
    }
}

//class Geo extends Countries{}
//We can't subclass a class who is defined with final keyword.

class India{
    final void capital(){
        System.out.println("The capital city of india is New Delhi ");
    }
    void Ccity(){
        System.out.println("The computer city of India is Bangalore");
    }
    void Tcity(){
        System.out.println("The trade city of India is surat");
    }
    void Tocity(){
        System.out.println("The tourist city of India is Shimla");
    }
}

class State extends India{
    //We can't override a method defined with final keyword
    @Override
    void Tocity(){
        super.Tocity();
        System.out.println("The city is located in Himachal Pradesh");
    }

    @Override
    void Tcity(){
        super.Tcity();
        System.out.println("The city is located in Gujarat");
    }
}

public class Day3{
    public static void main(String[] args){
        State details = new State();
        details.Tocity();
        details.capital();
        details.Tcity();
    }
}