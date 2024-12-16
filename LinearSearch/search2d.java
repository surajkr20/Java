package LinearSearch;

import java.util.Scanner;

public class search2d {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target : ");
        int n = sc.nextInt();

        int[] result = search(arr, n); // Corrected: `result` is now an int array.
        if (result[0] != -1) {
            System.out.println("Target found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target not found.");
        }
    }

    static int[] search(int arr[][], int target) { // Return type changed to int[].
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j}; // Corrected: `new int[]` instead of `new int`.
                }
            }
        }
        return new int[] {-1, -1}; // Corrected: Returning an array for not found.
    }
}
