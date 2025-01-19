package Practise;

public class Basics {
    public static void main(String[] args) {
        int n = 10001;

        int ans = print(n);
        System.out.println("diff of total digits of product and sum : " + ans);
    }

    static int print(int n) {
        int count = 0;
        int sum = 0;
        int product = 1;
        while (n != 0) {

            int lastNo = n % 10;
            sum = sum + lastNo;
            product = product * lastNo;
            n = n/10;
            count++;
        }
        System.out.println("total no of digits : " + count);
        int diff = product - sum;
        return diff;
    }
}

// n = 456 =