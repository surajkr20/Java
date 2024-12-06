package Loops;

import java.util.Scanner;

public class evenNO {
    public static void main(String[] args){
        // input in java

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
