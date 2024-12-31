public class sortcolors {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        
        sorting(arr);
        System.out.println("sorted array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // first approach (o(n)), in two pass
    static void sorting(int nums[]){
        int n = nums.length;
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==0) zeros++;
            else if(nums[i]==1) ones++;
            else twos++;
        }

        int idx = 0;
        for(int i=0; i<zeros; i++){
            nums[idx++] = 0;
        }
        for(int i=0; i<ones; i++){
            nums[idx++] = 1;
        }
        for(int i=0; i<twos; i++){
            nums[idx++] = 2;
        }
    }

    // 2nd approach (o(n)), in one pass ( is call dutch national flag algo)
    static void sorting1(int nums){
        
    }
}
