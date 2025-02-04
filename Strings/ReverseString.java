package Strings;

public class ReverseString {
    public static String reverseString(String str) {
        String str1 = str.toLowerCase();
        StringBuilder reverse = new StringBuilder(str1);
        return reverse.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(reverseString(str)); // Output: "dlrowolleh"
    }
}
