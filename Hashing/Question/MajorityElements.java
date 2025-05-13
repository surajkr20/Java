package Hashing.Question;

import java.util.HashMap;

public class MajorityElements {
    public static void find(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Print elements that appear more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 3, 4, 2, 2, 1, 2, 1 };

        find(arr);
    }
}
