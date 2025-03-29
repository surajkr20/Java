package Stacks.ImportantQues;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6"; // Input infix expression
        Stack<Integer> val = new Stack<>(); // Stack to store operand values
        Stack<Character> op = new Stack<>(); // Stack to store operators

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int acsii = (int) ch;
            if (acsii >= 48 && acsii<=57) {
                val.push(acsii - 48); // Convert character to integer and push to value stack
            } else if (op.isEmpty()) {
                op.push(ch); // If operator stack is empty, push the current operator
            } else {
                if (ch == '+' || ch == '-') {
                    // Process previous operator before pushing current one
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    else if (op.peek() == '-')
                        val.push(v1 - v2);
                    else if (op.peek() == '*')
                        val.push(v1 * v2);
                    else if (op.peek() == '/')
                        val.push(v1 / v2);

                    op.pop(); // Remove processed operator
                    op.push(ch); // Push current operator
                } else if (ch == '*' || ch == '/') {
                    // If top of operator stack has higher or equal precedence, evaluate first
                    if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '*')
                            val.push(v1 * v2);
                        else if (op.peek() == '/')
                            val.push(v1 / v2);
                        op.pop();
                    }
                    op.push(ch); // Push current operator
                }
            }
        }

        // Process remaining operators in stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '+')
                val.push(v1 + v2);
            else if (op.peek() == '-')
                val.push(v1 - v2);
            else if (op.peek() == '*')
                val.push(v1 * v2);
            else if (op.peek() == '/')
                val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek()); // Print final evaluated result
    }
}
