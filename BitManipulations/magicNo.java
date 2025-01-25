
package BitManipulations;

// Ques. Find i-th magic No ? ( base - 5(start to 1-power) )
//  1 - 0 0 1 - 5
//  2 - 0 1 0 - 25
//  3 - 0 1 1 - 30

public class magicNo {
    public static void main(String[] args) {
        int n = 3;

        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
