package Array;

public class demo {
    public static void main(String[] args) {
        // declaraton & initilazation (both) of array
        // String[] arr = new String[5];

        // System.out.println(arr[1]); // null

        int[] ros; // only declaration, ros is getting defined in the stack memory

        ros = new int[5]; // initilazation: actually defined in heap memory(memory creation).

        System.out.println(ros[1]);


    }
}
