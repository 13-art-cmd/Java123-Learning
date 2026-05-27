public class BankAccount {
    private static double balance = 10000;

    // Custom Exceptions inside the class
    static class InSufficientFundsException extends Exception {
        public InSufficientFundsException(String msg) { super(msg); }
    }
    static class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String msg) { super(msg); }
    }

    public static void withdraw(double amount) throws InSufficientFundsException {
        if (amount < 0) throw new InvalidAmountException("Negative Amount!");
        if (balance < amount) throw new InSufficientFundsException("Insufficient fund");
        
        balance -= amount;
        System.out.println("Remaining balance is: " + balance);
    }

    public static void main(String[] args) {
        System.out.println("--- Starting Program ---"); 
        try {
            withdraw(10000);
        } catch (InSufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--- Program Finished ---");
    }
}