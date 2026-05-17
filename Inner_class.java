class Auto{
    void Edetail(){
        System.out.println("it is an electric Rickshaw.");
    }
    void Mdetail(){
        System.out.println("It is an motor Rickshaw.");
    }

    class Fare{
        void Efare(){
            System.out.println("The fare of using E-Rickshaw is 20 Rupees");
        }
        void Mfare(){
            System.out.println("The fare of using Motor-Rickshaw is 50 Rupees");
        }
    }

    public static void main(String[] args){
        Auto Yellow = new Auto();
        Yellow.Mdetail();
        Auto Tuktuk = new Auto();
        Tuktuk.Edetail();

        //Now, to create inner class object we need to first refer from outer class object
        Auto.Fare yf = Yellow.new Fare();
        yf.Mfare();
        Auto.Fare tf = Tuktuk.new Fare();
        tf.Efare();
    }
}