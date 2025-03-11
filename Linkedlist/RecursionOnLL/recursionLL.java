package Linkedlist.RecursionOnLL;

public class recursionLL {
    int size = 0;

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // display all nodes using loops
    public static void display(Node head){
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // using recursion
    public static void displayRecursion(Node head){

        // if(head != null){
        //     System.out.print(head.data + " ");
        //     head = head.next;
        // }else return;
        // displayRecursion(head);

        if(head == null) return;
        System.out.print(head.data + " ");
        displayRecursion(head.next);

    }

    // normal insersion using loops
    public static void insertAt(Node head, int idx, int val){
        Node temp = head;
        Node t = new Node(val);
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    // insertion using recursion >> pending
    // public static Node InsertRec(int idx, int val, Node head){
    //     if(idx == 0){
    //         Node temp = new Node(val, head);
    //     }
    // }

    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(24);
        Node c = new Node(25);
        Node d = new Node(26);
        Node e = new Node(27);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        // display(a);
        // display(a);
        // insertAt(a, 2, 44);
        // display(a);
    }
}
