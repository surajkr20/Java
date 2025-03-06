package Linkedlist.LeetcodeQues;

public class CycleInLinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        if(head == null || head.next == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null){
            if(slow == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
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
        d.next = b;
        b.next = c;
        c.next = d;
        // d.next = e;

        System.out.println(hasCycle(a));
    }
}
