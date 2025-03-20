package Stacks.Basics;

import java.util.Stack;

public class implementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(24);
        st.push(3);

        // System.out.println(st.indexOf(1));
        // System.out.println(st);
        // st.pop();
        // System.out.println(st.size());

        // printing random element from stack using loop
        while(st.size() > 2){ // 
            st.pop();
        }
        System.out.println(st.peek());
    }
}
