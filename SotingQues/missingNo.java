package SotingQues;

// Asked by Google :- 
// ques.268 => Missing No = Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class missingNo {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,7,0,1};
        int result = MissingNo(arr);
        System.out.println(result);
    }

    static int MissingNo(int nums[]){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;            
            }else i++;
        }

        // search for first missing no
        for(int index=0; index<nums.length; index++){
            if (nums[index] != index) {
                return index;
            }
        }

        // case-ii
        return nums.length;
    }
}
