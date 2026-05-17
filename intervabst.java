abstract class Hostel{
    Hostel(){
        System.out.println("Welcome to our hostel");
    }
    void Rooms(){
        System.out.println("Total rooms available are: 20");
    }
    abstract void students();

}

class Hostel1 extends Hostel{
    void students(){
        System.out.println("NUmber of students available are 1200");
    }
    void HostelName(){
        System.out.println("Hostel NAme is Maharishi Valmiki Hostel");
    }
    
    void Rooms(){
        super.Rooms();
    }
}


interface College{
    int College_number = 7890;
    void Departments();
    void Facility();
    void Lab();
    void Classes();
}

class College1 implements College{
    int College_number = 890;
    @Override
    public void Departments(){
        System.out.println("Total Departments available is : 4");
    }

    @Override
    public void Lab(){
        System.out.println("Total labs available are 6");
    }

    @Override
    public void Classes(){
        System.out.println("Total students available are 400");
    }

    @Override
    public void Facility(){
        System.out.println("Study facility is overall good");
    }
}

public class intervabst{
    public static void main(String[] args) {
        College1 c = new College1();
        c.Lab();
        c.Departments();
        c.Classes();
        Hostel1 h1 = new Hostel1();
        h1.Rooms();
        h1.HostelName();
        
    }
}