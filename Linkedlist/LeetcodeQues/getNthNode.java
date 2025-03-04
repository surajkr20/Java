package Linkedlist.LeetcodeQues;

public class getNthNode {
    // Listnode
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    // in two passes
    public static ListNode getNode(ListNode head, int n){
        ListNode temp = head;
        int size = 0;

        if (head == null || n <= 0) return null; // Handle invalid cases

        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;

        // mth node from start
        temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    
    // optimized approach(turtle-rabbit techniqe)
    public static ListNode getNode02(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(23);
        ListNode b = new ListNode(25);
        ListNode c = new ListNode(28);
        ListNode d = new ListNode(22);

        a.next = b;
        b.next = c;
        c.next = d;

        // brute force approach
        // ListNode ans = getNode(a, 3);
        // System.out.println(ans.val);

        // optimized approach
        ListNode result = getNode02(a, 2);
        System.out.println(result.val);
    }
}
