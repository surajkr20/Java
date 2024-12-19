package BSInterviewPrep;

public class floorNo {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 10, 14 };
        int target = 13;

        int found = searchFloorNO2(arr, target);
        System.out.println("floor element at " + found + "th" + " index");
    }

    // floor no (greatest no less than or = target)
    static int searchFloorNO(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        int ans = -1; // initialized ans invalid

        while (start <= end) {
            // find mid element;
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (n > arr[mid]) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

    static int searchFloorNO2(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find mid element;
            int mid = start + (end - start) / 2;

            if (n < arr[mid]) {
                end = mid - 1;
            } else if (n > arr[mid]) {
                start = mid + 1;
            }else return mid;

        }
        return end;
    }
}
