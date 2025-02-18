package Recursion02.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,5, 7 ,8,5};
        int target = 5;
        // System.out.println(found(arr, 0, target));

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(findAllIndex(arr, 0, target, list));

    }

    // returning idx
    static int found(int arr[], int idx, int target){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        else return found(arr, idx+1, target);
    }

    // returning boolean value
    static boolean found01(int arr[], int idx, int target){
        if(idx == arr.length) return false;
        return arr[idx] == target || found01(arr, idx+1, target);
    }

    // finding all available target indexes
    static ArrayList<Integer> findAllIndex(int arr[], int idx, int target, ArrayList<Integer> list){
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        return findAllIndex(arr, idx+1, target, list);
    }
}
