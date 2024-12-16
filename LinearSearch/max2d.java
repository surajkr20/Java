package LinearSearch;

// Integer.MIN_VALUE and Integer.MAX_VALUE, IS the most smallest and greatest numbers in integer.

public class max2d {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 53},
            {4, 15, 6},
            {7, 8, 29}
        };

        int result = search(arr);
        System.out.println(result);
    }

    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
