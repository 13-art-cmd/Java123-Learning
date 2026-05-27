public class User implements Runnable{
    public static void main(String[] args){
        TicketBooth ISBT = new TicketBooth();
        Thread Raj = new Thread(() -> ISBT.bookTicket(3),"Raj");
        Thread Sonam = new Thread(()-> ISBT.bookTicket(5),"Sonam");
        Thread Neha = new Thread(() -> ISBT.bookTicket(4),"Neha");
        Raj.start();
        Sonam.start();
        Neha.start();
    }
}
