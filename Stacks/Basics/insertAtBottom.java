package Stacks.Basics;

import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(23);
        st.push(24);
        st.push(25);

        Stack<Integer> temp = new Stack<>();
        int idx = 2;

        // insert at bottom
        while(st.size() > idx){
            temp.push(st.pop());
        }
        st.push(30);
        while(temp.size() > 0){
            st.push(temp.pop());
        }

        System.out.println(st);

    }
}
