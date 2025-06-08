package Practise;

public class practise {
    public static int fibo(int n){
        if(n<=1) return n;
        int first = fibo(n-2);
        int second = fibo(n-1);
        return first+second;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
