package SotingQues;

// cycle sort(leetcode)
// Ques.287 => Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.There is only one repeated number in nums, return this repeated number.You must solve the problem without modifying the array nums and using only constant extra space.

public class duplicateNo {
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i+1){
                int correct = nums[i] - 1; // Position where the current number should be
                if (nums[i]!=nums[correct]) {
                    // Swap nums[i] with nums[correct]
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
