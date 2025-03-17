package Linkedlist.LeetcodeQues;

// Ques.234 || Palindrome Linked List

public class palindromeLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void display(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // reverse the linkedlist(recursive approach)
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static boolean isPalindrome(ListNode head) {
        // finding middle Node
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // right half, reversed
        ListNode temp = reverse(slow.next);
        slow.next = temp;

        // after reversed, check values both sides
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2 != null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        boolean ans = isPalindrome(a);
        System.out.println(ans);

    }
}
