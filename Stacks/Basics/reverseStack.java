package Stacks.Basics;

import java.util.Stack;

public class reverseStack {
    // push at bottom function
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    // reverse stack using recursion
    public static void reverse(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


    }
}
