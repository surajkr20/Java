package Recursion02.Searching;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 23, 32, 40, 45, 59 };
        int target = 59;
        int end = arr.length - 1;
        // System.out.println(isAvailable(arr, target));
        System.out.println(recursiveBinary(arr, target, 0, end));

    }

    // that is iterative approach of binary search.
    static int isAvailable(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return 0;
    }

    // recursive approach
    static int recursiveBinary(int[] arr, int target, int start, int end) {
        if (start > end)
            return 0;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return recursiveBinary(arr, target, start, mid - 1);
        else
            return recursiveBinary(arr, target, mid + 1, end);
    }
}
