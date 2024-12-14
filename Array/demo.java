package Array;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        // declaraton & initilazation (both) of array
        // String[] arr = new String[5];

        // System.out.println(arr[1]); // null

        // int[] ros; // only declaration, ros is getting defined in the stack memory

        // ros = new int[5]; // initilazation: actually defined in heap memory(memory creation).

        // System.out.println(ros[1]);

        // int arr[] = {12,43,23,76,45};

        String name = "suraj";

        for(char ch : name.toCharArray()){
            System.out.println(ch);
        }

        // System.out.println(Arrays.toString(name.toCharArray()));

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // print arr elements using for each
        // for(int num : arr){
        //     System.out.println(num);
        // }

    }
}
