package LinearSearch;

public class searchinrange {
    public static void main(String[] args) {
        int arr[] = {12,32,43,23,12,33,11,89};

        int target = 23;
        int result = searchRange(arr, target);
        System.out.println(result);
    }

    static int searchRange(int[] arr, int target){
       int start = 1;
       int end = 5;

       if(arr.length == 0){
        return -1;
       }

        for(int i=start; i<=end; i++){
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
