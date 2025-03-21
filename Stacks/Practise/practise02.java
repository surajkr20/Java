package Stacks.Practise;

import java.util.Stack;

public class practise02 {
    public static void reverse(Stack<Integer> st){
        
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(24);
        st.push(26);

        // while(st.size() > 0){
        //     System.out.println(st.peek());
        //     st.pop();
        // }
        // System.out.println(st);

        // int n = st.size();
        // int[] temp = new int[n];

        // for(int i=n-1; i>=0; i--){
        //     temp[i] = st.pop();
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(temp[i] + " ");
        // }

        reverse(st);
    }
}
