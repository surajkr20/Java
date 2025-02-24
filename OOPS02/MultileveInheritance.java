package OOPS02;

public class MultileveInheritance {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.fun();
        obj.fun02();
        obj.fun03();
    }
}

class GrandFather{
    void fun(){
        System.out.println("From grand parent...");
    }
}

class Parent extends GrandFather{
    void fun02(){
        System.out.println("from parent...");
    }
}

class Child extends Parent{
    void fun03(){
        System.out.println("from child...");
    }
}