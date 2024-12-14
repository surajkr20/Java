package Array;

public class max {
    public static void main(String[] args) {
        int arr[] = {12,43,65,34,12};

        int result = maxvalue(arr);
        System.out.println(result);
    }

    static int maxvalue(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
