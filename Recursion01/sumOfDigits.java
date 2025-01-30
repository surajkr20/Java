package Recursion01;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 2345;
        SOD(n);

        System.out.println(SOD01(n));
    }

    static void SOD(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    static int SOD01(int n) {
        if(n==0) return 0;
        return n % 10 + SOD01(n / 10);
    }
}
