package Linkedlist.LeetcodeQues;

// 83. Remove Duplicates from Sorted List
// ques.leetcode.83 >> Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class removeDuplicates {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // public static void deleteDuplicates(ListNode head) {
    //     ListNode temp = head;
    //     ListNode tail = null;
    //     while(temp != null){
    //         if(temp.val == temp.next.val){
    //             temp.next = temp.next.next;
    //         }else{
    //             temp = temp.next;
    //         }
    //     }
    //     tail = temp;
    //     temp.next = null;
    // }

    public static void display(ListNode head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(33);
        ListNode b = new ListNode(34);
        ListNode c = new ListNode(34);
        ListNode d = new ListNode(35);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        // ListNode ans = deleteDuplicates(a);
        display(ans);

    }
}
