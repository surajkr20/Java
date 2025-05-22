package Heap;

// leetcode.ques.414. Third Maximum Number = https://leetcode.com/problems/third-maximum-number/description/

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Find3rdLargest {
    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            if (set.contains(num))
                continue;

            minHeap.add(num);
            set.add(num);

            if (minHeap.size() > 3) {
                set.remove(minHeap.poll()); // remove smallest
            }
        }

        // If less than 3 distinct elements, return the maximum
        if (minHeap.size() < 3) {
            while (minHeap.size() > 1) {
                minHeap.poll(); // discard smaller elements
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        System.out.println(thirdMax(arr));
    }
}
