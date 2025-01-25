package BitManipulations;

// Ques => Given a no n, find if it is even or odd

public class evenOrOdd {
    public static void main(String[] args) {
        boolean ans = find(5);
        
        if(ans==true) System.out.println("odd number");
        else System.out.println("even no");
    }

    static boolean find(int n) {
        return ((n & 1) == 1);
    }
}
