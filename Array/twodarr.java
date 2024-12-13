package Array;

import java.util.Arrays;

public class twodarr {
    public static void main(String[] args) {
        // int arr[][] = new int[5][];

        int arr1[][] = {
            {1,2,3},
            {2,3},
            {43,32,55}
        };

        for(int i=0; i<3; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }



    }
}
