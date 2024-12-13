package Array;

import java.util.Arrays;

public class passingfun {
    public static void main(String[] args) {
        String arr[] = {"hello","hii","whatever","set","java"};

        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(String arr[]){
        arr[0] = "abhinav";
        System.out.println(Arrays.toString(arr));
    }
}
