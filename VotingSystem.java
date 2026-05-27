import java.util.Scanner;

class UnderageException extends Exception{
    public UnderageException(String message){
        super(message);
    }
}

public class VotingSystem{
    public static void checkEligibilty(int age) throws UnderageException{
        if (age<=18){
            throw new UnderageException("You must be 18 above to vote");
        }
        System.out.println("You have casted your vote");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age");
        int age = sc.nextInt();

        try {
            checkEligibilty(age);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }

}