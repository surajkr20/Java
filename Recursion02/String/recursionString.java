package Recursion02.String;

public class recursionString {
    public static void main(String[] args) {
        String value = "namrn";
        int end = value.length()-1;
        System.out.println(isPalindrome(value, 0, end));
    }

    static boolean isPalindrome(String str, int start, int end){
        if(start >= end) return true;

        if(str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start+1, end-1);
    }
}
