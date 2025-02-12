package Recursion02.Array;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 0, 0, 0, 0,0,0}; // Extra space for merging
        int arr2[] = {2, 4, 6, 8,7,6}; // Second sorted array
        int n = 4; // Actual number of elements in arr1
        int m = arr2.length;

        // mergeArr(arr1, arr2, n, m);
        // System.out.println("Merged Array: " + Arrays.toString(arr1));

        merge(arr1, m, arr2, n);
        System.out.println("Merged Array: " + Arrays.toString(arr1));
    }

    // optimized approach
    static void mergeArr(int[] arr1, int[] arr2, int n, int m) {
        int idx = n + m - 1; // Last index of merged array
        int i = n - 1; // Last element of arr1
        int j = m - 1; // Last element of arr2

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[idx] = arr1[i];
                i--;
            } else {
                arr1[idx] = arr2[j];
                j--;
            }
            idx--;
        }

        // Copy remaining elements from arr2 (if any)
        while (j >= 0) {
            arr1[idx] = arr2[j];
            j--;
            idx--;
        }
    }

    // 2nd approach(using extra array)
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n]; // Extra array to store merged result
        int i = 0, j = 0, k = 0; // Pointers for nums1, nums2, and merged array

        // Merge both arrays into 'merged'
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Copy merged array back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = merged[x];
        }
    }
}
