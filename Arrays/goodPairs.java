package Arrays;

// ques.1512 => Given an array of integers nums, return the number of good pairs. A pair (i, j) is called good if nums[i] == nums[j] and i < j.

public class goodPairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        int ans = countGoodPairs1(arr);
        System.out.println(ans);
    }

    // optimal solution
    /**
     * Counts the number of good pairs in the given array.
     * A pair (i, j) is called good if arr[i] == arr[j] and i < j.
     *
     * @param arr the input array of integers where 1 <= arr[i] <= 100
     * @return the number of good pairs in the array
     *
     * This function uses a frequency array to keep track of the occurrences of each number.
     * For each element in the input array, it adds the current count of that element to the answer
     * and then increments the count of that element in the frequency array.
     *
     * Example:
     * Input: arr = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs: (0,3), (0,4), (3,4), (2,5)
     */
    static int countGoodPairs1(int arr[]){
        int temp[] = new int[101];
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += temp[arr[i]];
            temp[arr[i]]++;
        }
        return ans;
    }

    // brute force solution
    static int countGoodPairs(int arr[]){
        int count = 0;
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j] && i<j) count++;
            }
        }
        
        return count;
    }
}
