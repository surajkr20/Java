package Maths;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        // factor01(n);
        // factors02(n);
        factors03(n);
    }

    // complexity = o(n).
    static void factor01(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void factors02(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == 0){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    static void factors03(int n){
        ArrayList<Integer> list = new ArrayList<>();

        // Loop from 1 to sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // Check if i is a factor
                if (n / i == i) { // Check if it's a perfect square
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " "); // Print the smaller factor
                    list.add(n / i);          // Store the larger factor for later
                }
            }
        }

        // Print the larger factors in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
