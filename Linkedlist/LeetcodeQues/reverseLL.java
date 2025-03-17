package Linkedlist.LeetcodeQues;

public class reverseLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // this is recursive approach
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // iterative approach
    public static ListNode reverse01(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static void display(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        ListNode ans = reverse01(a);
        display(ans);
    }

}
