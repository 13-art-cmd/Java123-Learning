class Players{
    static void display(){
        System.out.println("What game is he playing?");
    }
    static void playing(){
        System.out.print("The player is busy in playing the follwing game: ");
    }
    static class Game{
        void Cricket(){
            System.out.println("Playing Cricket");
        }
        void Football(){
            System.out.println("Playing Football");
        }
        void Hockey(){
            System.out.println("Playing Hockey");
        }
    }
    public static void main(String[] args){
        display();
        Players.Game p = new Players.Game();
        playing();
        p.Cricket();
        p.Football();
        p.Hockey();
    }
}