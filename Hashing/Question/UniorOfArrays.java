package Hashing.Question;

import java.util.HashSet;

public class UniorOfArrays {
    public static HashSet<Integer> findUnion(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n1; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<n2; i++){
            set.add(arr2[i]);
        }

        return set;
    }

    public static int findIntersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {7,3,4};
        int[] nums = {3,4,1,2,5,6};

        // HashSet<Integer> ans = findUnion(arr, nums);

        // System.out.println(ans);

        // for(int val : ans){
        //     System.out.print(val + " ");
        // }

        System.out.println(findIntersection(arr, nums));
    }
}
