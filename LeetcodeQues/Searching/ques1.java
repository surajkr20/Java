package LeetcodeQues.Searching;

public class ques1 {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 9, 13, 12, 10, 5 };

        int result = binarysearch(arr);
        System.out.println(result);
    }

    static int linearsearch(int[] arr, int target) {
        if (target == arr[arr.length - 1])
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int arr[]) {
        
    }
}
