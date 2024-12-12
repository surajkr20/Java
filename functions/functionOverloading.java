package functions;

public class functionOverloading {
    public static void main(String[] args) {
        fun(34);
        fun("suraj");
    }

    static void fun(int x){
        System.out.println(x);
    }

    static void fun(String x){
        System.out.println(x);
    }
}
