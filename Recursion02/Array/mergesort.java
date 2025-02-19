package Recursion02.Array;

import java.util.Arrays;

// not change original arr
public class mergesort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6 };
        System.out.println(Arrays.toString(mergeSortArr(arr)));
    }

    static int[] mergeSortArr(int arr[]) {
        if (arr.length == 1)
            return arr;

        // divide arrays into two parts
        int mid = arr.length / 2;
        int[] left = mergeSortArr(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortArr(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // filling the elements in mix arr
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete(fill remainig elements)
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
