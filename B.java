class Printer{
    public synchronized void printAssignment(String docName){
            try{
                for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName() + " " + "is printing " + " " +  docName + "Page: " + i);
                    Thread.sleep(800);
                }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
    }
}

public class B{
    public static void main(String[] args){
        Printer hp = new Printer();
        Thread Alice = new Thread(() -> hp.printAssignment("Os"),"Alice");
        Thread Bob = new Thread(()-> hp.printAssignment("Java"),"Bob");
        Alice.start();
        Bob.start();
    }
}