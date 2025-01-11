package patterns;

// Ques. 
    // *****
    // ****
    // ***
    // **
    // *

public class pattern3 {
    public static void main(String[] args) {
        oppositeRectangle(5);
    }

    static void oppositeRectangle(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
