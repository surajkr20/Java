package Recursion02.Array;

public class printArr {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,6};
        // int result = sumOfArr(arr, 0);
        // System.out.println(result);
        // printArray(arr, 0);
        printReverse(arr, arr.length-1);
    }

    // sum of arr elements by recursion
    static int sumOfArr(int arr[], int index){
        if(index == arr.length-1){
            return arr[index];
        }
        
        return arr[index] + sumOfArr(arr, index+1);

    }

    // print all arr elements by recursion
    static void printArray(int arr[], int index){
        if(index == arr.length-1) return;
        
        System.out.print(arr[index] + " ");

        printArray(arr, index+1);
    }

    // print all arr elements in reverse by recursion
    static void printReverse(int arr[], int index){
        if(index == -1) return;
        System.out.print(arr[index] + " ");
        printReverse(arr, index-1);
    }

}
