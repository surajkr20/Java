package Recursion02.MergeSort;

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        int arr1[] = {9,5,3,7};
        int n = arr.length;
        int m = arr1.length;
        mergeArr(arr, arr1, n, m);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeArr(int[] arr1, int[] arr2, int n, int m){
        int idx = n + m - 1;
        int i = n - 1;
        int j = m - 1;

        while (i>=0 && j>=0) {
            if(arr1[i]>=arr2[j]){
                arr1[idx] = arr1[i];
                idx--;
                i--;
            }
            else{
                arr1[idx] = arr2[i];
                idx--;
                i--;
            }
        }
    }
}
