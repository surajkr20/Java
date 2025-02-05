package Recursion01;

// question on gfg(easy)

public class Gcd {

    public static void main(String[] args) {
        System.out.println(solution(18, 40));
    }

    // this is recursive approach
    static int solution(int a, int b) {
        if (b == 0)
            return a;

        return solution(b, a % b);
    }
}