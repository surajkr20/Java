package Arrays;

// ques.1512 => Given an array of integers nums, return the number of good pairs. A pair (i, j) is called good if nums[i] == nums[j] and i < j.

public class goodPairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        int ans = countGoodPairs1(arr);
        System.out.println(ans);
    }

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
