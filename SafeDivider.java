import java.util.Scanner;

public class SafeDivider{
    public static void main(String[] args) {
        String userinput;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Kindly enter a number in the format of String: ");
        userinput = s1.nextLine();

        try { 
            int input = Integer.parseInt(userinput);
            int divide = 100/input;
            System.out.println("The result after converting your number and division by 100: " + divide);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number not string.");
        }
        catch(ArithmeticException e){
            System.out.println("The number you entered is not divisible by 100");
        }
        finally{
            System.out.println("Parsing attempt finished.");
        }
        //Instead of using this multiple catch blocks we can also use pipe | to make the both exception in one condition.
    }
}
