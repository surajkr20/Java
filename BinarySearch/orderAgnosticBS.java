package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 9, 14, 55, 65, 78, 88, 98, 108 };
        
        int result = agnosticSearch(arr, 55);
        
        if(result == -1){
            System.out.println("target is not available in this array");
        }else{
            System.out.println("target is available at " + result + " index");
        }
    }

    // order ognostic binary search (for ascending descending orders both)
    // when you don't know your arr is ascending or descending, then you apply this.
    static int agnosticSearch(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean Asc = arr[s] < arr[e];

        while (s <= e) {
            // find mid element
            int mid = s + (e - s) / 2;

            if (target == arr[mid])
                return mid;

            if (Asc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}