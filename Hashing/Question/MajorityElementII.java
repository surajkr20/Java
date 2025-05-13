package Hashing.Question;

// leetcode.ques.229 Majority Element II = https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key: map.keySet()){
            if(map.get(key) > n/3){
                result.add(key);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 3, 4, 2, 2, 1, 2, 1 };
        
        List<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }
}
