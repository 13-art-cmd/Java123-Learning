class School{
    School(){
        System.out.println("Welcome to our school");
    }
    final void on(){
        System.out.println("All days except sunday");
    }
    public void dress(){
        System.out.println("A Red, White, Blue check shirt and a grey pant");
        System.out.println("House dress, trouser");
    }
    public void facilities(){
        System.out.println("Facilities available are:" );
    }
}

class Kendriya extends School{         //Single Level- Inheritance
    Kendriya(){
        super();
        System.out.println("Welcome to the Kendriya Vidyalaya");
    }
    @Override
    public void facilities(){
        super.facilities();
        System.out.println("Sports Complex");
        System.out.println("Football and Cricket, Hockey and many more available");
    }
    public static void main(String[] args){
        School Badarpur  = new Kendriya(); 
        Badarpur.dress();
        Badarpur.facilities();
    }
}

class Classroom{   //Multi-level Inheritance
    //add on more code to practice more
    Classroom(){
        super();
        System.out.println("Total 36 classrooms available");
        System.out.println("Computer Classes also available");
    }

    public static void main(String[] args) {
        Classroom C12 = new Classroom();
    }
}

