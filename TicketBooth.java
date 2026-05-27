public class TicketBooth {
    private int availableSeats = 10;

    public synchronized void bookTicket(int wantedSeats){
        try {
            if(availableSeats> wantedSeats){
                availableSeats -= wantedSeats;
                System.out.println("Processing you to payment page");
                Thread.sleep(5000);
                System.out.println("Congrats ! You have successfully booked:" + wantedSeats);
            }
            else{
                System.out.println("Tickets not available");
            }
        } catch (InterruptedException e) {
            System.out.println("Your payment is in process");
        }
    }
}

