package Stacks.Basics;

import java.util.Stack;

public class RecursiveDisplay {
    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(23);
        st.push(24);
        st.push(25);

        System.out.println(st);
        displayRec(st);
    }
}
