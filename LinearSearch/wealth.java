package LinearSearch;

// Ques. You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.Return the wealth that the richest customer has.

public class wealth {
    public static void main(String[] args) {
        int arr[][] = {
            {1,6,3},
            {1,2,9},
            {8,2,4}
        };

        int result = maximumWealth(arr);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int costomer = 0; costomer < accounts.length; costomer++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[costomer].length; account++) {
                sum += accounts[costomer][account];
            }
            // now we have sum of accounts of costomer
            // check with overall ans.
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
