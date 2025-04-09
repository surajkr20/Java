package Queue;

public class LinkedlistImplementation {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                temp = tail;
            }
            size++;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x  = head.data;
            head = head.next;
            size--;
            return x;
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(52);
        q.add(53);
        q.add(55);

        q.display();
        q.remove();
        q.display();
    }
}
