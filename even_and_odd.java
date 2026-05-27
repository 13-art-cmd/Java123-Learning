class Even extends Thread{
    @Override
    public  void run(){
        synchronized(this){
            for(int i=0;i<=20;i++){
            System.out.println(Thread.currentThread().getName() + "Prints" + i);
            i++;
        }
        }
    }
}

class Odd extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println(Thread.currentThread().getName() + "Prints" + i);
            i++;
        }    
    }
}

public class even_and_odd{
    public static void main(String[] args){
        Thread Even_thread = new Even();
        Thread Odd_thread = new Odd();
        Even_thread.start();
        Odd_thread.start();
    }
}