package LinearSearch;

import java.util.Scanner;

public class findno {

    public static void main(String[] args) {    
        int arr[] = {12,23,32,54,12};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target : ");
        int n = sc.nextInt();

        int result = findnum(arr, n);
        
        System.out.println("available on index no : " + result);
    }

    static int findnum(int[] arr, int n){

        if(arr.length == 0){
            return -1;
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                count++;
                return i;
            }
        }
        System.out.println("total existing times : " + count);
        return -1;
    }
}