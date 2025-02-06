package Recursion02.String;

public class reverse {
    public static void main(String[] args) {
        reverseString("suraj", 4);
    }

    static void reverseString(String name, int end) {
        if (end < 0) return; // Base condition to stop recursion

        System.out.print(name.charAt(end)); // Print the character
        reverseString(name, end - 1); // Recursive call with decremented index
    }
}
