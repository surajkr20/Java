package DynamicProgramming.Basics;

// leetcode.ques.509 = https://leetcode.com/problems/fibonacci-number/submissions/1656330469/

public class Fibo {
    // example with dp (Memoization)
    public static int fibo(int n, int[] dp) {
        if (n <= 1)
            return n;

        // If the value is already computed, return it (avoids redundant computation)
        if (dp[n] != 0)
            return dp[n];

        // Recursive call to compute the value if not already stored
        int ans = fibo(n - 1, dp) + fibo(n - 2, dp);

        // Store the computed result in dp array for future use
        dp[n] = ans;

        // Return the result
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n + 1];
        // Arrays.fill(arr, -1); // setting default values in the arr

        System.out.println(fibo(n, arr));
    }
}