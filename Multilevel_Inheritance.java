class Grandfather{
    void Grandfather_age(){
        System.out.println("Grandfather age is 70");
    }
}

class Parent extends Grandfather{
    void Parent_age(){
        System.out.println("Parent age is 45");
    }
}

class Child extends Parent{
    void Child_age(){
        System.out.println("Child age is 13");
    }
    void Child_name(){
        System.out.println("Child name is Raj Tshring");
    }
    void Parent_name(){
        System.out.println("Father name is: Munna Lal Prajapati");
    }

    public static void main(String[] args){
        Child raj = new Child();
        raj.Child_age();
        raj.Grandfather_age();
        raj.Parent_age();
        raj.Child_name();
        raj.Parent_name();
    }
}