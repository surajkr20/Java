package BitManipulations;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2; // base value like for binary-2, decimal-10, octal-8 etc

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
