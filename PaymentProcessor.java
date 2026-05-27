interface PaymentMethod{
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private int CreditCardNumber;
    public CreditCardPayment(int CreditCardNumber){
        this.CreditCardNumber = CreditCardNumber;
    }
    @Override 
    public void pay(double amount){
        System.out.println("Amount to be paid by credit card number is" + CreditCardNumber + amount);
    }
    @Override
    public void refund(double amount){
        System.out.println("Amount to be refunded to Card number " + CreditCardNumber + amount);
    }
}

class PayPalPayment implements PaymentMethod{
    private String email_id;
    public PayPalPayment(String email_id){
        this.email_id = email_id;
    }
    @Override 
    public void pay(double amount){
        System.out.println("Amount to be paid" + amount);
    }
    @Override
    public void refund(double amount){
        System.out.println("Amount to be refunded: " + amount);
    }

}

class BankTransfer implements PaymentMethod{
    private long AccountNumber;
    public BankTransfer(long AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    @Override 
    public void pay(double amount){
        System.out.println("Amount to be paid" + AccountNumber + "  " + amount);
    }
    @Override
    public void refund(double amount){
        System.out.println("Amount to be refunded: " + amount);
    }
}

public class PaymentProcessor{
    public static void processPayment(PaymentMethod paymentMethod,double amount){
        paymentMethod.pay(amount);       //This is magic line
        System.out.println("The amount is successfully paid");
    }
    public static void processRefund(PaymentMethod paymentMethod,double amount){
        paymentMethod.refund(amount);
        System.out.println("The amount has been successfully refunded" + amount);
    }
    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();
        BankTransfer raj = new BankTransfer(751200010);
        processor.processPayment(raj,4000);

        PayPalPayment dhruv = new PayPalPayment("dhruv24@gmail.com");
        processor.processPayment(dhruv, 9000);


    }
}