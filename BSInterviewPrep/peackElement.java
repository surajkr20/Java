package BSInterviewPrep;

public class peackElement {
    public static void main(String[] args) {
        int arr[] = { 0, 10, 5, 2 };

        int result = peakIndexInMountainArray(arr);
        System.out.println(result);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
