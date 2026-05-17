final class hand{
    int a[]  = {1,2,3,4,5};
    public static void main(String[] args){
        hand h1 = new hand();
        try{
            System.out.println(h1.a[3]);
            System.out.println(h1.a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Kindly enter a valid index value");
        }
        finally{
            System.out.println("Thanks for using our array.");
        }
    }
}
