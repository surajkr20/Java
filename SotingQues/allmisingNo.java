package SotingQues;

import java.util.ArrayList;
import java.util.List;

// asked by Google (cycle sort)
// leetcode Ques.448 => Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

public class allmisingNo {
    public static void main(String[] args) {
        int arr[] = {9, 6, 4, 2, 3, 7, 0, 1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Place each number at its correct position
        while (i < nums.length) {
            int correct = nums[i] - 1; // Position where the current number should be
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                // Swap nums[i] with nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Find all missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
}
