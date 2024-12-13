package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class inputArrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.print("how many elements want to you add in arrlist? : ");
        int n = in.nextInt();

        // taking input in arrlist
        System.out.println("Enter your elements : ");
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }

        // getting elemetns from arrlist
        System.out.println("your all elements : ");
        for(int i=0; i<n; i++){
            System.out.println(list.get(i));
        }
    }
}
