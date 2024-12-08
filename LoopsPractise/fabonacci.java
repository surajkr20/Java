
package LoopsPractise;

import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }

    }
}
