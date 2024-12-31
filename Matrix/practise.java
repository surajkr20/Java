package Matrix;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 3, 5},
            {70, 91, 11},
            {13, 19, 17}
        };
        int target = 17;

        int result[] = search(matrix, target);
        if(result!=null){
            System.out.println("found at"+" "+result[0]+" "+result[1]);
        }else{
            System.out.println("not found");
        }

        sort(matrix);

        int binaryRS[] = binarysearch(matrix, target);
        if(binaryRS!=null){
            System.out.println("found at"+" "+binaryRS[0]+" "+binaryRS[1]);
        }else{
            System.out.println("not found");
        }
    }

    static int[] search(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    static int[] binarysearch(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            if(target>=arr[i][0] && target<=arr[i][arr[i].length-1]){
                int start = 0;
                int end = arr[i].length - 1;
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if(target == arr[i][mid]){
                        return new int[] {i,mid};
                    }
                    else if(target>arr[i][mid]){
                        start = mid + 1;
                    }else {
                        end = mid - 1;
                    }
                }
            }
        }
        return null;
    }

    static void sort(int arr[][]){
        for(int[] row: arr){
            Arrays.sort(row);
        }
    }
}
