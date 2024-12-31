public class practise {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 3, 9, 29, 15 };

        bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        selectionSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // bubble sort algorithms
    static void bubblesort(int arr[]) {
        int n = arr.length;
        boolean isSorted = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSorted = true;
                }
            }
            if(!isSorted) break;
        }
    }

    // selection sort algo
    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j]) minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int arr[]){
        
    }
}
