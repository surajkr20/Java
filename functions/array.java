package functions;

public class array {
    public static void main(String[] args) {
        int arr[] = {12,33,44,32,34};

        changeArr(arr);
        System.out.print("original array elements : ");
        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArr(int arr[]){

        arr[0] = 20;
        
        System.out.print("duplicate arr elements : ");
        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
