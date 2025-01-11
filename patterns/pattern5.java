package patterns;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class pattern5 {
    public static void main(String[] args) {
        print(2);
    }

    static void print(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
