/* 
 * Type conversion and casting in java
 *
*/

public class TypeCasting {

    public static void main(String args[]){
        // small range data types easily stored in big range data types, is called conversion
        // ex- byte stored int int, short sotred in int, byte stored in short
        // byte a = 125;
        // int b = a;
        // System.out.println(b);

        // byte n = 56;
        // short m = n;
        // System.out.println(m);

        // float f = 345.5f;
        // double db = f;
        // System.out.println(db);

        // // big range data types not stored in small range data types, if you store apply type casting, is called type casting
        // short k = 124;
        // byte l = (byte)k;   // type casting (converting short to byte)
        // System.out.println(l);

        // float num = 34.56f;
        // int num1 = (int)num;
        // System.out.println(num1);

        byte a = 10;
        byte b = 20;
        int result = a*b;
        System.out.println(result);
    }
}