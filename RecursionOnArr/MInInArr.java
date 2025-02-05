package RecursionOnArr;

public class MInInArr {
    public static void main(String[] args) {
        int arr[] = {10,22,4,5,8,9};
        int n = arr.length-1;
        
        System.out.println(minInArr(arr, n));
    }

    static int minInArr(int[] arr, int index){
        if(index == 0) return arr[index];
        return Math.min(arr[index], minInArr(arr, index-1));
    }
}
