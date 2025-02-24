package oops;

// A wrapper class in Java is used to convert primitive data types (int, char, etc.) into objects
// ex- int > Integer, byte > Byte, char > Character etc.

public class wrapperClass {
    public static void main(String[] args) {
        // Integer a = 20;
        // System.out.println(a);

        // final int b = 34;
        // b = 35; // error

        // System.out.println(b);

        A obj = new A("abhinav");
        System.out.println(obj);
    }
}

class A{
    final int a = 34;
    
    String name;

    public A(String name){
        this.name = name;
    }
}