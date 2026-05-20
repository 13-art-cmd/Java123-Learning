//private class Access_Modifiers{} - Only public, final, abstract.
import java.util.Scanner;


class AI{
    private String User = "Raj Tshring";
    protected int age = 19;

    private void display(){
        System.out.println(User + " " + age);
    }
    public void Available(){
        System.out.println("ChatGPT");
        System.out.println("Claude");
        System.out.println("Gemini");
        System.out.println("Kimi");
        System.out.println("Cursor");
    }
    String choice;
    void answer(){System.out.println("The user has selected the following AI model: " + choice);}
}

public class Access_Modifiers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        AI u1 = new AI();
        //System.out.println(u1.User);
        //Not allowed because it is private and can't be inherited in ither classes
        System.out.println(u1.age);
        u1.Available();
        System.out.println("Kindly enter the name of the AI model you want to use: " );
        u1.choice = s.nextLine();
        u1.answer();
    }
}
