import java.util.Scanner;

public class practice{
    static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        int num1;
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        num1 = input.nextInt();

        while(num1 != 1){
            fact *= num1;
            num1 -=1;
        }
        System.out.println("The factorial of number through iterative method: " + fact);
        int num2;
        System.out.println("Enter another number:");
        num2 = input.nextInt();
        System.out.println("The factorial of a number through Recursive function : " + factorial(num2));
    }
}