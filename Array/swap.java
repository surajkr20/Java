package Array;

import java.util.Arrays; // Import statement added

public class swap {
    public static void main(String[] args) {
        int arr[] = {12, 43, 23, 45, 32};

        // swap(arr, 1, 3);
        // System.out.println(Arrays.toString(arr)); // Converts the array to a string for printing

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, end, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
