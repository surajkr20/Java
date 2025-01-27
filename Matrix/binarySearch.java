package Matrix;

public class binarySearch {
    public static void main(String[] args) {
        // Binary search on 2D array
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 19}
        };
        int target = 19;

        // int result[] = found(matrix, target);
        // if (result != null) {
        //     System.out.println("Target found at: Row " + result[0] + ", Column " + result[1]);
        // } else {
        //     System.out.println("Target not found");
        // }

        boolean isFound = found1(matrix, target);
        if(isFound==true) System.out.println("target available in array");
        else System.out.println("not found");
    }

    static int[] found(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]<=target && target<=arr[i][arr[i].length-1]){
                int start = 0;
                int end = arr[i].length - 1;
                while(start<=end){
                    int mid = start + (end - start)/2;
                    if(arr[i][mid]==target){
                        return new int[]{i,mid};
                    }else if(target<arr[i][mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
            }
        }
        return null; // Target not found
    }

    // this is index mapping techniques - all 2d arrays treated a single array
    static boolean found1(int matrix[][], int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n*m-1;

        int row_index;
        int col_index;

        while(start<=end){
            int mid = start + (end-start)/2;
            row_index = mid/m;
            col_index = mid%m;

            if(matrix[row_index][col_index] == target) return true;
            else if(matrix[row_index][col_index]<target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
