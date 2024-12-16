package LinearSearch;

public class min {
    // find min value in entire arr
    public static void main(String[] args) {
        int arr[] = {122,43,23,11,-3,-110};

        int result = min(arr);
        System.out.println(result);
    }

    static int min(int arr[]){
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
