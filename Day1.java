interface Laptop{
    void display();
    void price();
    void company();
    void model();
    String OS = "Windows 11";  
}

interface details{
    void ram();
    void storage();
    void processor();
    void graphics();
}

class Dell implements Laptop, details{  
    @Override    //Difference between abstract and interface
    public void display(){
        System.out.println("It has a 15 inch display");
    }
    @Override
    public void company(){
        System.out.println("It's company is Dell");
    }
    @Override
    public void model(){
        System.out.println("Inspiron 15 3000");
    }
    @Override
    public void ram(){ 
        System.out.println("The Laptop has 8GB of RAM");
    }
    @Override
    public void processor(){
        System.out.println("The processor is Ryzen 5");
    }
    public void storage(){
        System.out.println("The storage is 512 GB");
    }
    //Use all methods of interface whenever using a interface
    public void price(){
        System.out.println("The price is 52500");
    }
    public void graphics(){
        System.out.println("The graphics card is AMD radeon");
    }
    void user(){
        System.out.println("User is Raj Tshring");
    }
}

public class Day1{
    public static void main(String[] args){
        Dell l1 = new Dell();
        l1.model();
        l1.company();
        l1.display();
        l1.ram();
        l1.graphics();
        l1.user();
        System.out.println(l1.OS);
        // l1.OS = "Linux";   We cant run this as updation is not allowed in interface
    }
}