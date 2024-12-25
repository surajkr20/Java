package BSInterviewPrep;

// ques. find the ceiling and floor no in a sorted arr. log(n) complexity.

public class practise {
    public static void main(String[] args) {
        int arr[] = {11,7,2,15};
        int result = strictlySG(arr);
        System.out.println(result);
    }

    static int strictlySG(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(available(arr, arr[i-1]) && available(arr, arr[i+1])){
                count++;
            }
        }
        return count;
    }

    static boolean available(int arr[], int no){
        boolean check = false;
        for(int i=0; i<arr.length; i++){
            if(no == arr[i]){
                check = true;
            }
        }
        return check;
    }
}
