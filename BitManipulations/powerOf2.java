package BitManipulations;

public class powerOf2 {
    public static void main(String[] args) {
        int n = 48;

        boolean result = (n & (n - 1)) == 0;
        System.out.println(result);

    }
}
