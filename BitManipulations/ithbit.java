package BitManipulations;

public class ithbit {
    public static void main(String[] args) {
        int n = 1010110; // This is treated as a decimal number, not binary.
        int bit = 4;

        int ans = findbit(n, bit);
        System.out.println(ans);

        // int ansSetBit = setbit(ans, bit);
        // System.out.println(ansSetBit);
    }

    // find ith bit in a binary no
    static int findbit(int n, int bit) {
        // create the mask => ( 1<<(bit-1) )
        int mask = 1 << (bit - 1);

        // perform bitwise AND operation with n & mask
        int result = n & mask;

        // return 1 if the bit is set, otherwise return 0
        if (result != 0)
            return 1;
        else
            return 0;
    }

    // set ith bit in a binary number
    static int setbit(int n, int bit) {
        // create the mask => ( 1<<(bit-1) )
        int mask = 1 << (bit - 1);

        // use bitwise OR operation to set the bit
        int result = n | mask;

        if (result != 0)
            return 1;
        else
            return 0;
    }
}
