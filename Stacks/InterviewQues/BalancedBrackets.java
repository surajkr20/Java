package Stacks.InterviewQues;

// Ques.leetcode.20 =>> 
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0) return false;
                else if(ch == ')') st.pop();
            }
        }
        if(st.size() > 0) return false;
        return true;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        // isBalanced(str);
        System.out.println(isBalanced(str));
    }
}
