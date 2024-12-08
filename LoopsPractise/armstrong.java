package LoopsPractise;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer no : ");
        int n = sc.nextInt();

        int digit = n;

        int reverse = 0;

        while(n!=0){
            int ld = n % 10;
            reverse = (reverse * 10) + ld;
            n = n/10;
        }

        System.out.println("reverse : " + reverse);
        System.out.println("digit : " + digit);

        if(reverse == digit){
            System.out.println("Armstrong No");
        }else System.out.println("Not Armstrong No");
    }
}
