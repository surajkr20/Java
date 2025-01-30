package Recursion01;

public class numbers {
    public static void main(String[] args) {
        num(5);
        numReverse(10);
    }

    static void num(int n){
        if(n == 0) return;
        num(n-1);
        System.out.print(n + " ");
    }

    static void numReverse(int n){
        if(n==0) return;
        System.out.print(n + " ");
        numReverse(n-1);
    }
}
