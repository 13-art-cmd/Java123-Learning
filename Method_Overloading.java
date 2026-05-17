class Opera{
    int addition(int a,int b){
        return a+b;
    }
    int addition(int a, int b, int c){
        return a+b+c;
    }
    double addition(double a, double b){
        return a+b;
    }
    int subtraction(int a,int b){
        return a-b;
    }
    double subtraction(double a,double b){
        return a-b;
    }
    public static void main(String[] args){
        Opera o = new Opera();
        System.out.println(o.addition(2, 19));
        System.out.println(o.addition(3.4,43.999));
        System.out.println(o.subtraction(34.45,89.70));
    }
}