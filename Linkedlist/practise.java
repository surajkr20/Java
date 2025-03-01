package Linkedlist;

public class practise {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(25);

        // connect to the nodes
        a.next = b;

        display01(a);

        
    }

    public static void display(Node head){
        Node temp = head;
        while( temp != null ){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void display01(Node head){
        if( head == null ) return;
        System.out.println(head.data);
        display01(head.next);
    }
}
