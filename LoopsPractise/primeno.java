package LoopsPractise;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no : ");
        int n = sc.nextInt();

        boolean check = false;

        for(int i=2; i<n; i++){
            if(n%i==0){
                check = true;
                System.out.println("it's divisble by " + i);
                break;
            }
        }

        if (check == true) {
            System.out.println("not prime");
        }else System.out.println("prime");
    }
}
