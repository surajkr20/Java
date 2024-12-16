package LinearSearch;

// Ques. Given an array nums of integers, return how many of them contain an even number of digits.
// leetcode - 1295
public class even {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int result = findNumbers(nums);
        System.out.println(result);
    }

    // function to Numbers with Even Number of Digits
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a numbers contains even or not
    static boolean even(int num) {
        int nofdigits = digits(num);
        if (nofdigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // function to count the no of digits
    static int digits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

}