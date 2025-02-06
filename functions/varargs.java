package functions;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        // fun(12,34,3,2,4,5,5,66,76,54);
        // funstr("hello","suraj","abhinav","suraj");
        multiple(12,32,'w', "Suraj");
    }

    static void multiple(int a, int b, char c, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a + " " + b);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void funstr(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
