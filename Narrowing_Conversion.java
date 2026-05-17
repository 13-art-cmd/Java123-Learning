public class Narrowing_Conversion {
    public static void main(String[] args) {
        //In Narrowing casting we need to explcitly convert the larger data type to smaller data type
        //By default java compiler works in double format 
        //So that's why while assigning a float variable we need to convert it into using narrow casting.
        double d = 3456.3423587930;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        float percentage = (float) 89.989;
        //System.out.println(percentage);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        
    }   
}
