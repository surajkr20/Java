package LinearSearch;

public class uniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        // System.out.println(bruteForceApproach(arr));

        System.out.println(optimized(arr));
    }

    static int bruteForceApproach(int [] arr){

        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=i; j<arr.length; j++){
                if(arr[i] == arr[j]) count++;
            }

            if(count == 1) return arr[i];
        }

        return -1;
    }

    static int optimized(int arr[]){
        int unique = 0;
        for(int i=0; i<arr.length; i++){
            unique ^= arr[i];
        }

        return unique;
    }
}
