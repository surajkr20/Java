package Linkedlist.LeetcodeQues;

// Ques. 142 on leetcode >> Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null

public class CycleInLinkedl02 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node detectCycle(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        // Detect cycle using Floyd's Tortoise and Hare algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer one step
            fast = fast.next.next;    // Move fast pointer two steps
            
            if (slow == fast) {       // Cycle detected
                break;
            }
        }

        // If no cycle is found, return null
        if (fast == null || fast.next == null) return null;

        // Find the start of the cycle
        Node temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow; // Cycle start node
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

       Node ans = detectCycle(a);
       System.out.println(ans.data);
    }
}
