class MyRunnable1 implements Runnable{
    private int plates_served = 0;
    @Override
    public void run(){
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<10){
        System.out.println("I am playing cricket with Thread2");
        i++;
        }
    }
}


public class Myrunnable {
    public static void main(String[] args){
        Runnable Rice = new MyRunnable1();
        Thread t1 = new Thread(Rice);
        Thread t2 = new Thread(Rice);
        t1.start();
        t2.start();
    }
}