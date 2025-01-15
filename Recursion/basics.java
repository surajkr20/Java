package Recursion;

public class basics {
    public static void main(String[] args) {
        int ans = sumOfN(5);
        System.out.println(ans);
    }

    // print 1 to n
    static void print1(int n){
        if(n != 0){ // base class for stop calling fun as per requirment
            print1(n-1);
            System.out.println(n);
        }
    }

    // print n to 1
    static void print2(int n){
        if(n == 0) return;
        System.out.println(n);
        print2(n-1);
    }

    // finding factorial of n numbers
    static int factorial(int n){
        if(n == 1) return 1;
        int ans = n * factorial(n-1);
        return ans;
    }

    // Sum of first N natural numbers
    static int sumOfN(int n){
        if(n==1) return 1;
        int ans = n + sumOfN(n-1);
        return ans;
    }

}