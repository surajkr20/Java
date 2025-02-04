package Strings;

public class ReverseString {
    
    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(reverseString(str)); // Output: "dlrowolleh"

        // System.out.println(usingLoops(str));

        System.out.println(twoPointers(str));

    }
        // using string builder
    static String reverseString(String str) {
        String str1 = str.toLowerCase();
        StringBuilder reverse = new StringBuilder(str1);
        return reverse.reverse().toString();
    }
        // using loops with string builder
    static String usingLoops(String str){
        String str1 = str.toLowerCase();
        StringBuilder reversed = new StringBuilder();
        for(int i=str1.length()-1; i>=0; i--){
            reversed.append(str1.charAt(i));
        }

        return reversed.toString();
    }
        // two pointers approach
    static String twoPointers(String str){
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
