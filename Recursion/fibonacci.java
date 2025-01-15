package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        fibo1(4);
        // System.out.println(ans);
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        // System.out.println(n);
        return fibo(n-1)+fibo(n-2);
    }

    static void fibo1(int n){
        int a = 0;
        int b = 1;

        for(int i=0; i<=4; i++){
            int next = a+b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }
}
