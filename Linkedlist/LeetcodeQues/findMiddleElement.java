package Linkedlist.LeetcodeQues;

public class findMiddleElement {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // optimal aproach in one pass (o(n) t.c)
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void middleEle(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        int length = 0;

        // Count the number of nodes in the linked list
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Find the middle index (0-based index)
        int middleIndex = length / 2;

        // Move temp to the middle node
        temp = head;
        if(middleIndex % 2 == 0){ // for even size
            for (int i = 0; i < middleIndex-1; i++) {
                temp = temp.next;
            }
        }else{  // for odd size
            for (int i = 0; i < middleIndex; i++) {
                temp = temp.next;
            }
        }

        // Print the middle element
        System.out.println("Middle element: " + temp.data);
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

        middleEle(a);
        Node ans = middleNode(a);
        System.out.println(ans.data);
    }

}
