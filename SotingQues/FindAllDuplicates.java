package SotingQues;

import java.util.ArrayList;
import java.util.List;

// leetcode Ques.442. Find All Duplicates in an Array

// explanation - Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // Position where the current number should be
            if (nums[i] != nums[correct]) {
                // Swap nums[i] with nums[correct]
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index]!= index+1){
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
