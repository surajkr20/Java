package SotingQues;

// Asked by Amazon :- (cycle sort)
// leetcode ques.268 => Missing No = Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class missingNo {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,7,0,1};
        int result = MissingNo(arr);
        System.out.println(result);
    }

    static int MissingNo(int arr[]){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;            
            }else i++;
        }

        // search for first missing no
        for(int index=0; index<arr.length; index++){
            if (arr[index] != index) {
                return index;
            }
        }

        // case-ii
        return arr.length;
    }
}
