package BinarySearch;

// Binary search algorithm

public class demo {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 9, 14, 55, 65, 78, 88, 98, 108 };
        
        int result = search(arr, 55);
        
        if(result == -1){
            System.out.println("target is not available in this array");
        }else{
            System.out.println("target is available at " + result + " index");
        }
    }

    // normal binary search (it's only for one)
    static int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            // find mid element
            int mid = lo + (hi - lo) / 2;
            if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else
                return mid;
        }
        
        return -1;

    }

}

