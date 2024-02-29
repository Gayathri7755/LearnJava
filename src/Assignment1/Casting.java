package src.Assignment1;

public class Casting {
    public static void main(String[] args) {
        // Narrowing TypeCasting

        System.out.println("---Narrowing TypeCasting---");

        double l= 67.91;

        byte m= (byte)l;

        System.out.println("1. Double: "+l);

        System.out.println("Double to Byte:"+m+"\n");

        float i=83.45f;
        int j= (int)i;
        System.out.println("2. Float: "+i);

        System.out.println("Float to Int:"+j+"\n");

        char k='n';
        short u=(short)k;

        System.out.println("3. Char: "+k);

        System.out.println("Char to Short:"+u+"\n");
        byte r=100;
        char s=(char)r;

        System.out.println("4. Byte: "+r);

        System.out.println("Byte to Char:"+s+"\n");
        double t=1676.87777;
        long v=(long)t;

        System.out.println("5. Double: "+t);

        System.out.println("Double to Long:"+v+"\n");
        // Widening TypeCasting

        System.out.println("---Widening TypeCasting---");



        char a='j';

        int b=a;

        System.out.println("1. Char: "+a);

        System.out.println("Char to Int: "+b+"\n");

        short c=574;

        double d=c;

        System.out.println("2. Short: "+c);

        System.out.println("Short to Double: "+d+"\n");

        char x='g';

        double y=x;

        System.out.println("3. Char: "+x);

        System.out.println("Char to Double: "+y+"\n");
        byte e= 101;

        float f= e;

        System.out.println("4. Byte: "+e);

        System.out.println("Byte to Float:"+f+"\n");

        int p=536366336;

        float q=p;

        System.out.println("5. Int: "+p);

        System.out.println("Int to Float: "+q+"\n");


    }
}
