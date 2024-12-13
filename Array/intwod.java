package Array;

import java.util.Arrays;
import java.util.Scanner;

public class intwod {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements of 2d array : ");
        // taking input for 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // printing result
        // System.out.println("printing elements of arr : ");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.println(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
