package Loops;

import java.util.Scanner;

public class evenNO {
    public static void main(String[] args){
        try (// input in java
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of n : ");
            int n = sc.nextInt();

            // loop
            for(int i=1; i<=n; i++){
                if(i%3==0){
                    System.out.println(i);
                }
            }
        }
    }
}
