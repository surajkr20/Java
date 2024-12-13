package Array;

import java.util.Arrays;
import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        // int arr[] = new int[5];

        // // input result
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter elements of arr : ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // // printing result 
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // string type arr
        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays elements : ");

        for(int i=0; i<name.length; i++){
            name[i] = sc.next();
        }

        System.out.println(Arrays.toString(name));

    }
}
