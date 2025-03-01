package Linkedlist;

public class Implementation {
    // Node list
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;

        // Insert At end
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if( head == null ){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        // display the all nodes
        void display(){
            Node temp = head;
            while( temp != null ){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        // length of nodes
        void length(){
            Node temp = head;
            int count = 0;
            while( temp != null ){
                count++;
                temp = temp.next;
            }
            System.out.println("total length of nodes : " + count);
        }

        // Insert At beggining
        void insertAtHead(int val){
            Node temp = new Node(val);

            if(head == null){
                temp = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.insertAtEnd(12);
        ll.insertAtEnd(14);
        // ll.insertAtEnd(15);

        ll.display();
        // ll.length();

        ll.insertAtHead(23);
        ll.insertAtHead(28);

        ll.display();
    }
}
