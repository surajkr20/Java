package Recursion02.Searching;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {23,32,40,45,59};
        int target = 38;

       System.out.println( isAvailable(arr, target, 0));
    }

    // linear search by recursive call
    static int isAvailable(int[] arr, int target, int idx){
        if(idx == arr.length) return 0; 
        if(arr[idx] == target) return idx;
        return isAvailable(arr, target, idx+1);
    }
}
