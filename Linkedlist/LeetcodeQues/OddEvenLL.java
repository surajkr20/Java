package Linkedlist.LeetcodeQues;

// leetcode 328

public class OddEvenLL {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode OddEvenlist(ListNode head){
        ListNode temp = head;

        ListNode head1 = new ListNode(3);
        ListNode odd = head1;

        ListNode head2 = new ListNode(2);
        ListNode even = head2;

        while(temp != null){
            if(temp.val % 2 != 0){
                ListNode a = new ListNode(temp.val);
                odd.next = a;
                odd = a;
            }else{
                ListNode a = new ListNode(temp.val);
                even.next = a;
                even = a;
            }
            temp = temp.next;
        }

        odd.next = even.next;
        odd = even;

        return head2.next;
    }

    public static void display(ListNode head){
        while(head != null){
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
        // Node g = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // f.next = g;

        ListNode ans = OddEvenlist(a);
        display(ans);
    }
}
