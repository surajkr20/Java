package Stacks.InterviewQues;

import java.util.Stack;

public class NextGreater {
    // using nexted loop
    public static int[] find(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            res[i] = -1;
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]) res[i] = arr[j];
                break;
            }
        }

        return res;
    }
    // 2nd approach using stacks
    public static int[] find2(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        // Start loop from the last element
        for (int i = n - 1; i >= 0; i--) {
            // Ensure the stack is not empty before calling peek
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // Assign result based on stack condition
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            
            // Push the current element into the stack
            st.push(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 9, 2, 1, 4};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] res = find2(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
