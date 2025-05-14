package Hashing.Question;

// leetcode.349. Intersection of Two Arrays = https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for(int val: intersect){
            result[i] = val;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int[] num = {2,2};

        int[] ans = intersection(arr, num);
        System.out.println(Arrays.toString(ans));
    }
}