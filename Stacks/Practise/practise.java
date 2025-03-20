package Stacks.Practise;

import java.util.Stack;

public class practise {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(24);
        st.push(26);

        Stack<Integer> st2 = new Stack<>();

        while(st.size() > 0){
            st2.push(st.pop());
        }

        Stack<Integer> st3 = new Stack<>();

        while(st2.size() > 0){
            st3.push(st2.pop());
        }

        System.out.println(st);
        System.out.println(st2);
        System.out.println(st3);
    }
}
