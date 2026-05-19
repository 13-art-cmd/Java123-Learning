public class String_Class{
    public static void main(String[] args){
        String a = "Java";
        String b = "Python";
        String c = "Java";
        System.out.println(a.charAt(3));
        //Concatenation of String
        String d = a.concat(b);
        System.out.println(d);

        //Memory reference are equal that is same string
        System.out.println(a==c);
        
        //UpperCase
        String e = b.toUpperCase();
        String f = c.toUpperCase();
        //LowerCase
        String g = b.toLowerCase();
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //Another way to create a String is
        String h = new String("Hello");
        String i = new String("Achiever");
        System.out.println(h + i);
        String j = new String("Hello");
        System.out.println(h == j);

        //Replace
        //String objects are immutable so every time you replace character store it in another String Variable
        String k = b.replace('P','C');
        System.out.println(k);
        System.out.println(a.equals(c));
        System.out.println(h.equals(j));

        //Getting substring from a String
        String l = b.substring(3,5);
        System.out.println(l);

        String m = "Hello,Welcome,to,out,world";
        String n[] = m.split(",");
        System.out.println(n[2]);

        int len = n.length;
        for(int ko =0;ko<len;ko++){
            System.out.println(n[ko]);
        }

    }
}
