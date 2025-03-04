package Linkedlist.LeetcodeQues;

public class deleteNthNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    // delete from last
    public static ListNode deleteNode(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(23);
        ListNode b = new ListNode(25);
        ListNode c = new ListNode(28);
        ListNode d = new ListNode(22);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        a = deleteNode(a, 4);
        display(a);
        // System.out.println(ans.val);
    }
}
