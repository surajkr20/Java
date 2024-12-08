package Arrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        int num1[] = new int[5];

        // taking input for in arrays.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your array elements : ");
            for(int i=0; i<5; i++){
                num1[i] = sc.nextInt();
            }
        }
        
        for(int i=0; i<5; i++){
            System.out.print(num1[i] + " ");
        }
    }
}
