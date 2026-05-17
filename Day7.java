class Handler{
    static void display(int n){
        if(n < 0){
            throw new ArithmeticException();
        }
        System.out.println("The number entered by you is:" + n);
    }

    public static void main(String[] args){
        try{
            display(23);
            display(-12);
        }
        catch(ArithmeticException e){
            System.out.println("Kindly enter a positive number");
        }
    }
}