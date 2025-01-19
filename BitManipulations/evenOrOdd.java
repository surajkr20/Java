package BitManipulations;

// Ques => Given a no n, find if it is even or odd

public class evenOrOdd {
    public static void main(String[] args) {
        boolean ans = find(5);
        System.out.println(ans);
    }

    static boolean find(int n) {
        return ((n & 1) == 1);
    }
}
