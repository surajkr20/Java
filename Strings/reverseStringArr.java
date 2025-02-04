package Strings;

public class reverseStringArr {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new reverseStringArr().reverseString(s);

        for(char ch : s){
            System.out.print(ch + " ");
        }
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start<=end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
