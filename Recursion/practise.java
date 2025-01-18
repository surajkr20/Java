package Recursion;

public class practise {
    public static void main(String[] args) {
        // System.out.println(print(4));
        tableOfNo(5,1);
        // reverseCount(5);
        // System.out.println(factorialOfNo(5));
    }

    static int print(int n){
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        if(n==1) return 1;
        return n + print(n-1);
    }

    // static void tableOfNo(int n){
    //     tableOfNo(n, 1);
    // }

    static void tableOfNo(int n, int digit){
        if(digit <= 10){
            System.out.println(n * digit);
            tableOfNo(n, digit + 1);
        }
    }

    static void reverseCount(int n){
        // for(int i=n; i>=1; i--){
        //     System.out.println(i);
        // }

        if(n == 0) return;
        System.out.println(n);
        reverseCount(n-1);
    }

    static int factorialOfNo(int n){
        // int digit = 1;
        // for(int i=1; i<=n; i++){
        //     digit = digit * i;
        // }
        // System.out.println(digit);

        if(n == 1){
            return 1;
        }
        return n * factorialOfNo(n-1);
    }
}