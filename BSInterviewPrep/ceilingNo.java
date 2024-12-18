package BSInterviewPrep;

// The "ceiling number" concept in binary search refers to finding the smallest number in a sorted array that is greater than or equal to a given target. If the target exists in the array, the ceiling is the target itself

public class ceilingNo {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 10, 14 };
        int target = 6;

        int result = searchCeilingNO(arr, target);
        System.out.println("ceiling element at " + result + "th" + " index");

        int found = searchFloorNO(arr, result);
        System.out.println("floor element at " + found + "th" + " index");
    }

    // ceiling no (smallest no in the array greater than or = target)
    static int searchCeilingNO(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        int ans = -1; // initialized ans invalid 

        while (start <= end) {
            // find mid element;
            int mid = start + (end - start) / 2;

            if(arr[mid]==n){
                return mid;
            }else if(n>arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }

        }
        return ans;
    }
    
    // floor no (greatest no less than or = target)
    static int searchFloorNO(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        int ans = -1; // initialized ans invalid 

        while (start <= end) {
            // find mid element;
            int mid = start + (end - start) / 2;

            if(arr[mid]==n){
                return mid;
            }else if(n>arr[mid]){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return ans;
    }
}
