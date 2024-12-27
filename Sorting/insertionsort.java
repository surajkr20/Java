public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 3, 9, 29, 15 };

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than the key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }
}
