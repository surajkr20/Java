package patterns;

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

public class pattern28 {
    public static void main(String[] args) {
        printing(4);
    }

    static void printing(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            for(int s=1; s<=noOfSpaces; s++){
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}