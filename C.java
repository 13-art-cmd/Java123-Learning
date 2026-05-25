class RiceCooker implements Runnable{
    private int plates_served = 0;

    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            plates();
        }
    }

    private synchronized void plates(){
        plates_served++;
        System.out.println(Thread.currentThread().getName() + " " + "served" + " " + "Plate" + " " + plates_served);
    }
}

public class C{
    public static void main(String[] args) {
        Runnable Rice = new RiceCooker();
        Thread t1 = new Thread(Rice,"t1");
        Thread t2 = new Thread(Rice,"t2");  
        t2.start();
        t1.start();
    }
}