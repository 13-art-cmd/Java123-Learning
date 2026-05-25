class  Gaming extends Thread{
    @Override
    public void run(){
        try {
            int i = 0;
            while(i<10){
            System.out.println("Currently playing game");
            Thread.sleep(2000);
            i++;
            }
        }
        catch (InterruptedException e) {
            System.out.println("Gaming Interrupted !");
        }
    }
}

class Study extends Thread{
    @Override
    public void run(){
        try {
            int i = 0;
            while(i<10){
            System.out.println("Studied for half an hour");
            i++;
            } 
        } 
        catch (Exception e) {
            System.out.println("Study Over!");
        }
    }
}

public class MyThread{
    public static void main(String[] args){
        Thread guru = new Gaming();
        Thread core = new Study();
        guru.start();
        core.start();
    }
}