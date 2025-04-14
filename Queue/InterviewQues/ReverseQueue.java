package Queue.InterviewQues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(23);
        q.add(25);
        q.add(28);
        q.add(27);
        q.add(29);

        Stack<Integer> st = new Stack<>();

        while(q.size() > 0){
            st.add(q.remove());
        }

        while(st.size() > 0){
            System.out.print(st.peek() + " ");
            st.pop();
        }

        // System.out.println(q);
        // System.out.println(st);
    }
}
