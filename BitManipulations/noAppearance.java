package BitManipulations;

// Ques => Given an array of numbers and in that array every number appears twice, only one no appeare in one's find that no.

public class noAppearance {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,2,1,3,6,6,4,7};

        // bruteForce(arr);

        int ans = optimized(arr);
        System.out.println(ans);
    }

    // brute force solution
    static void bruteForce(int[] arr){
       
    }

    // optimized solution using XOR operator
    static int optimized(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
