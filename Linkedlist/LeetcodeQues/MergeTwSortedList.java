package Linkedlist.LeetcodeQues;

// Ques.21 =>> You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

public class MergeTwSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // not optimal approach
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }

        return head.next;
    }

    // optimal approach(using one pass)
    public static ListNode mergeTwoLL(ListNode list1, ListNode list2){
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        while( head1 != null && head2 != null ){
            if(head1.val <= head2.val){
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = head2;
                head2 = head2.next;
            }
        }

        if(head1 == null) temp.next = head2;
        else temp.next = head1;

        return head.next;
    }
}
