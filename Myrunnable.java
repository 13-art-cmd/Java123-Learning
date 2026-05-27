class MyRunnable1 implements Runnable{
    private int plates_served = 0;
    @Override
    public void run(){
        synchronized (this) {
            for(int i=0;i<=4;i++){
                plates_served++;
            System.out.println(Thread.currentThread().getName() + plates_served);
            }
        }  
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
        Thread t1 = new Thread(Rice,"Raj");
        Thread t2 = new Thread(Rice,"Ankit");
        t2.start();
        t1.start();
    }
}