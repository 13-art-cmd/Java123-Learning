public class Usage_of_static_with_data_and_methods {
    static final int marks = 90; //Static Variable can be accessed without creating a object.
    int grade = 10;
    final int standard = 12;

    static void print(){
        System.out.println("This is a Static method print");
    }

    void printf(){
        System.out.println("This print statement is without static declaration");
    }
    public static void main(String[] args) {
        Usage_of_static_with_data_and_methods u = new Usage_of_static_with_data_and_methods();
        System.out.println(u.grade);
        System.out.println(marks);
        System.out.println(marks);
        System.out.println(u.standard);
        u.printf();
        print();  
    }
}
