package Stacks.Basics;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(23);
        st.push(24);
        st.push(25);

        // while(st.size() > 0){
        //     System.out.println(st.peek());
        //     st.peek();
        // }

        // second way
        // Stack<Integer> temp = new Stack<>();
        // while(st.size() > 0){
        //     int x = st.pop();
        //     temp.push(x);
        // }
        // while(temp.size() > 0){
        //     int x = temp.pop();
        //     st.push(x);
        // }

        // System.out.println(st);

        // with the help of array
        int n = st.size();
        int[] arr = new int[n];

        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
    }
}
