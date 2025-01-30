package Recursion01;

public class factorial {
    public static void main(String[] args) {
        fact01(5);
        int ans = fact02(5);
        System.out.println(ans);

        int ans1 = sumOfN(10);
        System.out.println(ans1);
    }

    static void fact01(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

    static int fact02(int n){
        if(n==1) return 1;

        return n * fact02(n-1);
    }

    static int sumOfN(int n){
        if(n==0) return 0;
        return n + sumOfN(n-1);
    }
}
