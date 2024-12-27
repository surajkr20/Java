public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 3, 9, 29, 15 };

        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void selectionSort(int arr[]){
        for(int i=0; i<arr.length - 1; i++){
            int smIndex = i; // it is the first element of unsorted part of arr
            
            // finding smallest element
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[smIndex]){
                    smIndex = j;
                }
            }

            // swap arr[smIndex] and arr[i]
            int temp = arr[smIndex];
            arr[smIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
