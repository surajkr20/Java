package DynamicProgramming.Basics;

import java.util.Arrays;

public class Fibo {
    // example with dp (Memoization)
    public static int fibo(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);   // setting default values in the arr
    
        System.out.println(fibo(n, arr));
    }
}