package Heap;

// find kth smallest element from arrays

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int findKthSmallest(int[] nums, int k) {
        int n = nums.length;

        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());   // max heap syntax

        for (int i = 0; i < n; i++) {
            MaxHeap.add(nums[i]);
            if (MaxHeap.size() > k)
                MaxHeap.poll();
        }

        return MaxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        System.out.println(findKthSmallest(arr, k));
    }
}