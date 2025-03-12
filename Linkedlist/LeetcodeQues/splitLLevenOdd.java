package Linkedlist.LeetcodeQues;

public class splitLLevenOdd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node splitTwoLL(Node head){
        Node temp = head;

        Node head1 = new Node(2);
        Node even = head1;

        Node head2 = new Node(3);
        Node odd = head2;

        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp;
                even = temp;
                temp = temp.next;
            }else{
                odd.next = temp;
                odd = temp;
                temp = temp.next;
            }
        }

        return head2.next;

    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(1);
        // Node g = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // f.next = g;

        display(a);
        Node evenNode = splitTwoLL(a);
        display(evenNode);
    }
}
