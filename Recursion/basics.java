package Recursion;

public class basics {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        if(n==5) return;
        print1(n+1);
    }
}