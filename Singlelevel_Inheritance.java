
//Single-level Inheritance

class Mobile{
    void brand(){
        System.out.print("The phone is of: ");
    }
    void camera(){
        System.out.print("The camera details are below: ");
    }
    void processor(){
        System.out.print("The processor is: ");
    }
    void ram(){
        System.out.print("The total ram available is: ");
    }
}


class Motorola extends Mobile{
    @Override
    void brand(){
        super.brand();
        System.out.println("Motorolaa");
    }
    @Override
    void camera(){
        super.camera();
        System.out.println("50 megapixels");
    }
    @Override
    void processor(){
        super.processor();
        System.out.println("Snapdragon 6s Gen3");
    }
    @Override
    void ram(){
        super.ram();
        System.out.println("8GB + another 8GB for extension");
    }
    public static void main(String[] args){
        Motorola g34 = new Motorola();
        g34.brand();
        g34.processor();
        g34.ram();
        g34.camera();
    }
}