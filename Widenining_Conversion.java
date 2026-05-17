public class Widenining_Conversion {
    public static void main(String[] args){

        //IN widening we don't need to mention explicity.
        //Widening goes from smaller type to larger type.
        byte b = 24;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = i;

        System.out.println("Type Conversion:");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
