package Linkedlist;

public class BasicsLL {
    // using fun
    public static void display(Node head){
        Node temp = head;
        int count = 0;
        while( temp != null){
            count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(count);
    }

    // recursively
    public static void displayRecursively(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayRecursively(head.next);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // creating nodes
        Node a = new Node(34);
        Node b = new Node(35);
        Node c = new Node(36);
        Node d = new Node(38);

        // connect to next
        a.next = b;
        b.next = c;
        c.next = d;
        
        // accessing the values
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.next.next);

        // display the list loop on linklist
        Node temp = a;
        // for(int i=1; i<=4; i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        // while( temp != null){
        //     System.out.println(temp.data + " ");
        //     temp = temp.next;
        // }

        // using the fun display the list
        display(a); // calling fun

        // display linklists recursively
        displayRecursively(a);
    }
}