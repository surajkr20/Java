import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void cycleSort(int arr[]){

        int n = arr.length;
        int idx = 0;
        while(idx<n){
            int correct = arr[idx]-1;
            if(arr[idx]==arr[correct]) idx++;
            else swap(arr, idx, correct); 
        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
