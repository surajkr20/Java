package Recursion01;

public class reverseNo {
    static int sum = 0;

    static void reverse01(int n) {
        if (n == 0)
            return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse01(n / 10);
    }

    public static void main(String[] args) {
        int n = 2345;
        reverse01(n);
        System.out.println(sum);
    }
}
