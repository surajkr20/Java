package OOPS02.Polymorphism;

public class InnerCalculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // System.out.println(calc.add(12, 12));
        // System.out.println(calc.add(23,12,22));
        // System.out.println(calc.substract(12, 10));

        Calculator calc01 = new Calculator(12, 43);

        Calculator calc02 = new Calculator((int)12.4f, 34);

    }
    
}

class Calculator {

    // methods overloading
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
    
    int substract(int a, int b){
        return a-b;
    }

    // constructor overloading
    Calculator(){
        System.out.println("default constructor");
    }

    Calculator(int a, int b){
        System.out.println("taking two arguments");
        System.out.println(a+b);
    }

    Calculator(double a, int b){
        System.out.println(a + b);
    }

}
