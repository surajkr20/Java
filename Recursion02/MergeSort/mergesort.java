package Recursion02.MergeSort;

public class mergesort {

    public static void merge(int[] arr, int s, int e){
        int mid = s + ( e - s )/2;

        int len1 = mid - s + 1;
        int len2 = e - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        // copy values
        for(int i=0; i<len1; i++){
            
        }
    }

    public static void MergeSortAlgo(int[] arr, int s, int e){
        if( s > e) return;

        int mid = s + (e - s)/2;

        // sort left part
        MergeSortAlgo(arr, s, mid);

        // sort right part
        MergeSortAlgo(arr, mid+1, e);

        // then merge it
        merge(arr, s, e);

    }

    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        
        int m = arr.length;

        MergeSortAlgo(arr, 0, m);
    }
}
 