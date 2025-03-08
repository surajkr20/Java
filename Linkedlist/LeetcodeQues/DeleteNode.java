package Linkedlist.LeetcodeQues;

// Ques.237 on leetcode

public class DeleteNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    // delete node
    public static void deleteNode(ListNode node) {
        
    }

    // display fn
    public static void display(ListNode head){
        while( head != null ){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(23);
        ListNode b = new ListNode(25);
        ListNode c = new ListNode(26);

        a.next = b;
        b.next = c;
        
        // display fun before delting node
        display(a);

        // delete a node
        deleteNode(c);

        // display fun after delting node
        display(a);

    }
}
