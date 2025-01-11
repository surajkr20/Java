package functions;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        // user input
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int f1 = sc.nextInt();

        System.out.print("Enter second value : ");
        int s2 = sc.nextInt();

        int result = add(f1, s2);
        System.out.println("the final result is going to : " + result);

        String value = greet(" suraj");
        System.out.println(value);
    }

    // int type method
    static int add(int f1, int s2) {

        int sum = f1 + s2;

        return sum;

    }
    // string type method
    static String greet(String msg){
        String result = "hello" + msg;
        return result;
    }
}
