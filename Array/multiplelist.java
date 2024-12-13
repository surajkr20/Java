package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class multiplelist {
    public static void main(String[] args) {
        // declare to arrlist of arrlist
        ArrayList<ArrayList<Integer>> twoDlist = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(23);
        row1.add(25);
        row1.add(28);
        twoDlist.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(33);
        row2.add(45);
        row2.add(58);
        twoDlist.add(row2);

        System.out.println(twoDlist);
    }
}
