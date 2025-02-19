package Recursion02.Array;

import java.util.Arrays;

// sort original array using merge sort
public class mergeSort02 {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 6 };
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int arr[], int s, int e) {
        if (e-s == 1)
            return;

        // divide arrays into two parts
        int mid = s + (e -s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int mix[] = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        // filling the elements in mix arr
        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete(fill remainig elements)
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int idx=0; idx<mix.length; idx++){
            arr[s+idx] = mix[idx];
        }
    }
}
