package Stacks.ImportantQues;

import java.util.Stack;

// GFG Ques. https://www.geeksforgeeks.org/problems/the-celebrity-problem/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class CelebrityProb {
    public static int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people onto the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Find potential celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            // If 'a' knows 'b', then 'a' is not a celebrity; push 'b' back
            if (mat[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a); // Otherwise, 'b' is not a celebrity; push 'a' back
            }
        }

        // Step 3: Verify the potential celebrity
        if (stack.isEmpty())
            return -1;
        int potential = stack.pop();

        // A celebrity should not know anyone and should be known by everyone
        // Simple validation
        for (int i = 0; i < n; i++) {
            if (i != potential) {
                if (mat[potential][i] == 1)
                    return -1; // A celebrity shouldn't know anyone
                if (mat[i][potential] == 0)
                    return -1; // Everyone should know the celebrity
            }
        }

        return potential;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 1 } };
        int ans = celebrity(arr);
        System.out.println(ans);
    }
}