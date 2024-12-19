package BSInterviewPrep;

// Ques. Leetcode.744, Find Smallest Letter Greater Than Target(ceiling charcater).
// explanations: You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class ques744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // If the target is greater than or equal to the last character, wrap around
        if(target > letters[end]){
            return letters[0];
        }

        while( start <= end){
            // find mid character
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
