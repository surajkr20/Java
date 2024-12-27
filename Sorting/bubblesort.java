public class bubblesort {
    public static void main(String[] args) {
       int arr[] = {12,4,3,9,29,15};
        
       sortWithBubble(arr);
       for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
    }

    static void sortWithBubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean isSwaped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSwaped = true;
                }
            }

            if(!isSwaped) break;
        }
    }
}
