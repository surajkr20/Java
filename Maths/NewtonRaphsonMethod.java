package Maths;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }

    static double sqrt(double n) {
        double x = n;  // Initial guess
        double root = 0;  // Declare root outside the loop

        while (true) {
            root = 0.5 * (x + (n / x));  // Newton-Raphson formula
            if (Math.abs(root - x) < 1e-6) {  // Check for convergence
                break;
            }
            x = root;  // Update the guess
        }

        return root;
    }
}
