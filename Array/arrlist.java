package Array;

import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        // array list
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25); // you can add element in arrlist
        list.add(23);
        list.add(23);
        list.add(23);

        list.set(3, null); // set the element

        // list.clear();   // remove all arrlist elements

        // list.remove(0); // remove specific elements

        System.out.println(list.contains(25)); // chech if the list contains the specified elements

        System.out.println(list.get(0));    // get elements with the help of index

        System.out.println(list);
    }
}
