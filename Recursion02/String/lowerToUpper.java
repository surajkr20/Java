package Recursion02.String;

public class lowerToUpper {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder str = new StringBuilder(input);

        convert(str, 0);

        System.out.println(str.toString()); // Output: HELLO
    }

    static void convert(StringBuilder str, int index){
        if (index == str.length()) return; // Correct base condition

        char ch = str.charAt(index);
        if (Character.isLowerCase(ch)) {
            str.setCharAt(index, (char) ('A' + ch - 'a')); // Convert to uppercase
        }

        convert(str, index + 1); // Recursive call
    }
}
