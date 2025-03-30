package Stacks.Practise;

import java.util.Stack;

public class practise {
    public static void display(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        display(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(34);
        st.push(35);
        st.push(37);
        st.push(38);
        st.push(39);

        // display stacks using array

        // int[] arr = new int[st.size()];
        // int n = arr.length;

        // for(int i=n-1; i>=0; i--){
        //     arr[i] = st.pop();
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // using recursion 
        display(st);
        
    }
}