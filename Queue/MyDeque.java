package Queue;

import java.util.*;

public interface MyDeque {
    public static void main(String[] args) {
        java.util.Deque<Integer> dq = new ArrayDeque<>();

        dq.add(34);
        dq.add(35);
        dq.add(36);
        dq.add(37);

        dq.addFirst(0);
        dq.addLast(0);

        // dq.removeAll(dq);
        dq.removeLast();
        dq.removeFirst();

        while(!dq.isEmpty()){
            System.out.print(dq.peek() + " ");
            dq.poll();
        }
    }
}
