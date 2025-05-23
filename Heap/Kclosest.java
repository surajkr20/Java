package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

// Leetcode.658. Find K Closest Elements = https://leetcode.com/problems/find-k-closest-elements/description/

public class Kclosest {
    // approach.1 => using heaps(max heap)
    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (a.key == b.key) {
                        return Integer.compare(b.value, a.value); // break tie by value
                    }
                    return Integer.compare(b.key, a.key); // max-heap by distance
                });

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        while (maxHeap.size() > 0) {
            result.add(maxHeap.poll().value);
        }

        Collections.sort(result);
        return result;
    }

    // 2nd approach = binary search + two pointers
    public static List<Integer> findClosestElement1(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;

        while (left < right) {
            int mid = (left + right) / 2;

            // Compare distances between x and window edges
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1; // move window right
            } else {
                right = mid; // move window left
            }
        }

        // Build and return result
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> ans = findClosestElement1(arr, 4, 3);
        System.out.println(ans);
    }
}
