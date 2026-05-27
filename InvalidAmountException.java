public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(){
        super("Kindly enter a valid amount to be withdrawn");
    }
}
