package Linkedlist.practise;

public class practise02 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    // reverse the linkedlist
    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    // nth node from the end
    public static Node nthNode(Node head, int n){
        // i don't have an idea related ll size, so i have find first size
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        // the node exist
        int m = size - n + 1;
        temp = head;
        for(int i=1; i<m; i++){
            temp = temp.next;
        }
        return temp;
    }
    // optimized approach
    public static Node nthNode01(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    // delete nth node
    public static Node deleteNthNode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }

    // middle element
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Node ans = reverse(a);
        // System.out.println(ans.data);
        // display(ans);

        // display(a);
        // Node ans = deleteNthNode(a, 3);
        // display(a);

        Node ans = middleNode(a);
        System.out.println( ans.data);
    }
}
