package Linkedlist;

import java.util.Arrays;

public class MergeSortedArr {
    // brute force approach(not optimal and not acceptable on leetcode)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n]; // Temporary array to store sorted elements
        int i = 0;
        int j = 0; 
        int k = 0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }

    // optimal approach
    

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0}; // nums1 with extra space
        int[] arr2 = {2, 5, 6}; // nums2

        int m = 3; // Number of actual elements in nums1
        int n = 3; // Number of elements in nums2

        merge(arr1, m, arr2, n);
    }
}
