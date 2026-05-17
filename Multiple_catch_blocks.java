public class Multiple_catch_blocks {
    static int arr[] = {23,24,12,54,22,33};

    public static void main(String[] args){
        try{
            int r = arr[4];
            System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong index accessed.");
        }
        catch(Exception e){
            System.out.println("General error");
        }
    }
}
