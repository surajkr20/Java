package OOPS02.Inheritance;

public class SingleIheritance {
    public static void main(String[] args) {
        Child original = new Child();

        original.show();
        original.display();
    }
}

class Parent {
    void show(){
        System.out.println("parent class..");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("child class method");
    }
}

