package OOPS02.Polymorphism;

import OOPS02.Polymorphism.Calculator;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(12, 34));


    }
}

class Shapes{
    void fun(){
        System.out.println("i'm the shapes");
    }
}

class Triangle extends Shapes{
    void show(){
        System.out.println("Area is 0.5 * b * h");
    }
}