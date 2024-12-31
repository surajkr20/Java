package LoopsPractise;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        boolean result = primeNo(n);
        if(result){
            System.out.println("not prime");
        }else{
            System.out.println("prime no");
        }
        
    }

    static boolean primeNo(int n){
        for(int i=2; i<n; i++){
            if(n%i!=0){
                return true;
            }
        }
        return false;
    }
}
