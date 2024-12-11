package functions;

public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
        // System.out.println(x); // scope will begin when value is initialised
        x = 45;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
