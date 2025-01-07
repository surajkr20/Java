package Strings;

public class prettyprint {
    public static void main(String[] args) {

        // Declare a float variable with a value and the suffix 'f' to denote it's a
        // float type.
        float n = 456.2312f;

        // Format the float value to 2 decimal places using printf and %.2f format
        // specifier.
        // Output will be: formatted is : 456.23
        System.out.printf("formatted is : %.2f\n", n);

        // Format the value of Math.PI (π) to 4 decimal places using %.4f format
        // specifier.
        // Output will be: formated is : 3.1416
        System.out.printf("formated is : %.4f", Math.PI);

        // Use printf with string format specifiers (%s) to insert strings into the
        // output.
        // Output will be: hello my name is Abhinav and people also know me by Suraj
        System.out.printf("\nhello my name is %s and people also know me by %s ", "Abhinav", "Suraj");

    }
}
