package Linkedlist.LeetcodeQues;

public class deleteMiddleNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteMiddle(Node head) {
        if(head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(34);
        Node b = new Node(35);
        Node c = new Node(36);
        Node d = new Node(37);
        // Node e = new Node(38);

        a.next = b;
        b.next = c;
        c.next = d;
        // d.next = e;

        display(a);
        Node ans = deleteMiddle(a);
        display(ans);
    }
}
