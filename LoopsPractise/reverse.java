package LoopsPractise;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = sc.nextInt();

        // int digit = n;
        int reverse = 0;
        int product = 1;
        int sum = 0;

        while(n!=0){
            int ld = n%10;
            product = product * ld;
            sum = sum + ld;
            reverse = (reverse * 10) + ld;
            n = n/10;
        }
        System.out.println("reverse no is : " + reverse);

        int deff = product - sum;
        System.out.println("deffrence of product and sum : " + deff);
    }
}
