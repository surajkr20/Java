package Practise;

public class recursion {
    public static void main(String[] args) {
        // print(5);
        // print01(5);

        // System.out.println(fact(5));

        // System.out.println(fibo(7));

        // System.out.println(sum(5));

        System.out.println(power(6,3));
    }

    // 1 to n
    static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }

    // n to 1
    static void print01(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print(n - 1);
    }

    // factorial of a number
    static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    // fibonacci series
    static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    // sum of n numbers
    static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    // power of a number
    static int power(int a, int b){
        if(b==0) return 1;
        return a* power(a, b-1);
    }

    // reverse a string
    static String reverse(int str){
        
    }
}
