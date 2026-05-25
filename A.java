class BankAccount{
    private int balance = 100;

    public void withdraw(int amount){
        synchronized(this){
            if(balance >= amount){
                System.out.println(Thread.currentThread().getName() + " is withdrawing");
                balance = balance - amount;
                System.out.println("New balance: " + balance);
            }
            else{
                System.out.println("Insuffficient balance for: " + Thread.currentThread().getName());            }
        }
    }
}

public class A{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        Thread husband = new Thread(() -> account.withdraw(70),"Husband");
        Thread wife = new Thread(() -> account.withdraw(70),"Wife");
        husband.start();
        wife.start();
    }
}
