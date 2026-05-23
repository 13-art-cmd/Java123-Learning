import java.util.Scanner;

public class FeesNotSubmitted extends Exception{
    FeesNotSubmitted(String message){
        super(message);
    }
    
}


class Any{
    public static void main(String[] args){
        int fees;
        Scanner sc = new Scanner(System.in);
        fees = sc.nextInt();

        if(fees < 50000){
            try {
                throw new FeesNotSubmitted("kindly submit your fees");   //There are one safe and two ways to access them       
            } catch (FeesNotSubmitted e) {
                System.out.println(e.getMessage());  //This tells java ignore whatever is in message and print mine one always.
            }
        }
        
    }
}
