package BSInterviewPrep;

// Ques.No on leetcode - 2148
// Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

public class strictlySG {
    public static void main(String[] args) {
        int arr[] = { 11, 7, 2, 15 };

        int result = countElements(arr);
        System.out.println(result);
    }

    static int countElements(int[] nums) {
        // Finding the minimum and maximum values in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) { // For-each loop to iterate over the array
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        // Counting elements that are strictly greater than min and strictly smaller
        // than max
        int count = 0;
        for (int num : nums) { // For-each loop to iterate over the array
            if (num > min && num < max)
                count++;
        }

        return count;
    }
}
