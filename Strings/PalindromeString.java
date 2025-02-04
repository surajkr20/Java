package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "aca";
        System.out.println(isPalindrome(str));  // Output: true
    }

    static boolean isPalindrome(String str) {
        String str1 = str.toLowerCase();
        
        // Using StringBuilder for efficient reversal
        String reversed = new StringBuilder(str1).reverse().toString();

        // Correct way to compare strings
        return str1.equals(reversed);
    }

    static boolean isPalindrome1(String str) {
        String str1 = str.toLowerCase();
        int left = 0, right = str1.length() - 1;

        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
