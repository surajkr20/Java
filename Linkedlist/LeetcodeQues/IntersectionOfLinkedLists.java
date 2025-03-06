package Linkedlist.LeetcodeQues;

public class IntersectionOfLinkedLists {

    public static class ListNode {
        int val;
        ListNode next;
        
        // Constructor to create a node
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    // Function to find the intersection node
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Define two pointers for the heads of the linked lists
        ListNode tempA = headA;
        ListNode tempB = headB;

        // Calculate the length of the first linked list
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        // Calculate the length of the second linked list
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        // Reset the pointers back to the head of each list
        tempA = headA;
        tempB = headB;

        // Align the starting points of both lists by moving the pointer of the longer list ahead
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB; // Calculate the difference in lengths
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next; // Move tempA ahead to match tempB
            }
        } else {
            int steps = lengthB - lengthA; // Calculate the difference in lengths
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next; // Move tempB ahead to match tempA
            }
        }

        // Traverse both lists simultaneously until a common node is found
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // Return the intersection node (or null if no intersection exists)
        return tempA;
    }

    // Helper function to create linked lists and find intersection
    public static void main(String[] args) {
        // Creating two linked lists with an intersection
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;  // Intersection point
        
        ListNode headB = new ListNode(4);
        headB.next = common;  // Intersection point
        
        // Find intersection node
        ListNode intersection = getIntersectionNode(headA, headB);
        
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
