package Recursion02.Array;

public class sortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,6};
        System.out.println(isSorted(arr, 0));
    }

    // using recursion
    static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        return arr[idx] < arr[idx+1] && isSorted(arr, idx+1);
    }
}
