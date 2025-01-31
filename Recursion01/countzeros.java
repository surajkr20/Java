package Recursion01;

public class countzeros {
    public static void main(String[] args) {
        System.out.println(method02(120030));
    }

    // brute force approach
    static int method01(int n){
        int count = 0;
        while(n != 0){
            int lastDigit = n % 10;
            if(lastDigit == 0) count++;
            n = n/10;
        }
        return count;
    }

    // by using recursion
    static int method02(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n == 0) return count;
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
