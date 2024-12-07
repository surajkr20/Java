package OOPs;

import java.util.Scanner;

class Calculator { // Calculator, is the name of class

    int a = 45;

    public int add(int n1, int n2){ // add, is the name of fun
        int result = n1 + n2;
        System.out.println("value of a is : " + a);
        return result;
    }
    
}

public class Basics {
    @SuppressWarnings("resource")
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1 ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2 ");
        int num2 = sc.nextInt();

        Calculator calc = new Calculator(); // creating an object
        int result = calc.add(num1, num2);
        System.out.println(result);
        
    }
}
 