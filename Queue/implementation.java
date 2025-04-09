package Queue;

// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static void QueueDisplay(Queue<Integer> temp){
        if(temp.size() == 0) return;
        System.out.print(temp.peek() + " ");
        temp.poll();
        QueueDisplay(temp);
    }
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>(); // initialization of queue or
        Queue<Integer> q = new LinkedList<>();
        
        // basic operations of queue
        q.add(34);
        q.add(35);
        q.add(36);
        q.add(37);
        q.add(34);

        // display all queue elements using extra queue
        Queue<Integer> q2 = new LinkedList<>();

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q2.offer(q.poll());
        }

        while(q2.size() > 0){
            q.add(q2.poll());
        }

        // Recursive display
        QueueDisplay(q);

    }
}  
