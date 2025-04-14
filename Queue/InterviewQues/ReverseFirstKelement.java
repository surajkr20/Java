package Queue.InterviewQues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelement {
    public static void reverse(Queue<Integer> q, int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        while(n > n - k){
            st.add(q.remove());
        }

        // while (st.size() > 0) {
        //     q.add(st.pop());
        // }

        System.out.println(q);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(23);
        q.add(25);
        q.add(28);
        q.add(27);
        q.add(29);

        int k = 3;

        reverse(q, k);
    }
}
