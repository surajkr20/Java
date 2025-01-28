package Maths;

public class primeNo {
    public static void main(String[] args) {
        int n = 15;

        for(int i=1; i<=n; i++){
            System.out.println(i + " : " + isPrime(i));
        }

       System.out.println(primeChecker(n));
    }

    // using this approach, printing the prime no's 1 to n.
    static boolean isPrime(int n){
        if(n<1) return false;
        
        int c = 2;
        while( c*c <= n ){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    // this is random no checker, this is prime or not
    static String primeChecker(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0) return "Not prime";
        }
        return "prime";
    }
}
