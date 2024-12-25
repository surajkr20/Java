package Matrix;

public class linearSearch {
    public static void main(String[] args) {
        // binary search on 2d array
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        int target = 17;
        int[] result = found(matrix, target);
        if (result != null) {
            System.out.println("Found at: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Not found");
        }
    }
    // linear search
    static int[] found(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
