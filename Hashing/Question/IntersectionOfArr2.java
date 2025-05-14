package Hashing.Question;

// leetcode.350. Intersection of Two ArraysII - https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArr2 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequencies in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check nums2 and decrease frequency
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List to array
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int[] num = { 2, 2, 1 };

        int[] ans = intersect(arr, num);
        System.out.println(Arrays.toString(ans));
    }
}
