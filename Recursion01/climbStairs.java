package Recursion01;

public class climbStairs {
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution01(5));
    }

    static int solution(int n) {
        // iterative approach
        if (n <= 1) return 1;
        int prev2 = 1, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    static int solution01(int n){
        // recursive approach
        if(n<=1) return 1;
        return solution01(n-1)+solution01(n-2);
    }
}
