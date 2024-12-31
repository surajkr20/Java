import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {41, 13, 22, 10, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void cycleSort(int arr[]){
        int i=0; 
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                // int temp = arr[i];
                // arr[i] = arr[correct];
                // arr[correct] = temp;
                swap(arr, i, correct);
            }else i++;
        }
        
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
