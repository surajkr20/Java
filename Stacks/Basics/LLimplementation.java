package Stacks.Basics;

public class LLimplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        int peek(){
            if(head == null){
                System.out.println("stack is Empty!");
                return -1;
            }
            return head.data;
        }

        void pop(){
            if(head == null){
                System.out.println("stack is Empty!");
                return;
            }
            head = head.next;
            size--;
        }

        void display(){
            while(head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(23);
        st.push(24);
        st.push(56);

        // System.out.println(st.peek());
        st.pop();
        st.pop();

        st.display();
    }
}
