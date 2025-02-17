package Recursion02.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,6};
        int target = 5;
        System.out.println(found(arr, 0, target));
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
}
