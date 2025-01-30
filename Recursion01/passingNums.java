package Recursion01;

// diff between n-- vs --n

public class passingNums {
    public static void main(String[] args) {
        nums(5);
    }

    static void nums(int n){
        if(n==0) return;
        System.out.println(n);
        // nums(n--);   // first passing the value and then substract
        nums(--n);  // first substract and then pass.
    }
}
