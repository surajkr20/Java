package Heap;

// leetcode.ques.215. Kth Largest Element in an Array = https://leetcode.com/problems/kth-largest-element-in-an-array/description/

import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            MinHeap.add(nums[i]);
            if(MinHeap.size() > k) MinHeap.poll();
        }

        return MinHeap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr, 4));
    }
}
