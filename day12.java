class Lap{
    class Processor{
        void processor(){
            System.out.println("It is installed with AMD Ryzen 5 3550U");
        }
        void g_processor(){
            System.out.println("It has a integrated graphics card");
        }
    }
    public static void main(String[] args){
        Lap l1 = new Lap();
        Lap.Processor p1 = l1.new Processor();
        p1.processor();
    }
}


