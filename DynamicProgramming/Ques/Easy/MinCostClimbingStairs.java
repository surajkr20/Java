package DynamicProgramming.Ques.Easy;

import java.util.Arrays;

// leetcode.ques.746. Min Cost Climbing Stairs = https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class MinCostClimbingStairs {
    // recursive approach = time complexity - o(2^n) and space complexity - o(n)
    private static int minCost(int[] cost, int idx) {
        if (idx == 0 || idx == 1)
            return cost[idx];
        return cost[idx] + Math.min(minCost(cost, idx - 1), minCost(cost, idx - 2));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
    }

    // optimized approach using dp(with memorization) = time and space complexities are o(n).
    private static int helper(int[] cost, int idx, int[] dp){   
        if(idx == 0 || idx == 1) return cost[idx];
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(helper(cost, idx-1, dp), helper(cost, idx-2, dp));
    }

    public static int minCostClimbingStairs02(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(helper(cost, n - 1, dp), helper(cost, n - 2, dp));
    }

    // 3rd approach dp with tabulation - time and space complexites are o(n)
    public static int minCostClimbingStairs03(int[] cost){
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<n; i++){
            dp[i] = cost[i] + Math.min(dp[i-2], dp[i-1]);
        }
        return Math.min(dp[n-2], dp[n-1]);
    }

    public static void main(String[] args) {
        int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        System.out.println(minCostClimbingStairs03(cost));
    }
}