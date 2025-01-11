package patterns;

public class basics {
    public static void main(String[] args) {
        printPattern(5);
        squarePattern(5);
        rectangleNum(5);
    }

    static void printPattern(int n){
        System.out.println("perpendiculare rectangle :-");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void squarePattern(int n){
        System.out.println("suare pattern :-");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rectangleNum(int n){
        System.out.println("rectangle Number patterns :-");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
