package Loops;

import java.util.Scanner;

public class displayap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        int a = 1;
        for(int i=1; i<=n; i++){
            System.out.println("value of a is: " + a + " ");
            a+=2;
        }
    }
}
