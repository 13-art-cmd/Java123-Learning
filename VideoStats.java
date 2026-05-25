class VideoStats extends Thread {
    private int views = 0;
    
    public void addView(){
        synchronized (this) {
            views++;
        }
    }
}


class Mian{
    public static void main(String[] args) throws InterruptedException{
    }
}
