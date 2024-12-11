package functions;

public class passbyvalue {
    public static void main(String[] args) {
        // Java is always pass by value, which means a copy of the actual value is
        // passed to methods. Modifications made to the parameter inside the method do
        // not affect the original variable.

        int original = 5;
        changeValue(original);
        System.out.println(original); // Output: 5

    }

    public static void changeValue(int num) {
        num = 10;  // Changes the local copy
    }
}
