class operate{
    int divide(int n){
        return 20/n;
    }

    public static void main(String[] args){
        operate num1 = new operate();
        try {
            int res2 = num1.divide(10);
            System.out.println(res2);
            int res1 = num1.divide(0);
        } catch (Exception e) {
            System.out.println("Kindly enter a number other than 0");
        }
        finally{
            System.out.println("This is the end of the program");
        }
    }
}


public class Day5{
    public static void main(String[] args){
        int r = 20/2;
        System.out.println(r);
        int result = 10/0;
        System.out.println(result);
    }
}