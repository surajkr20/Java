package OOPS02;

public class Hierarchical {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.fun();
        obj.fun02();

        Child obj01 = new Child();
        obj01.fun();
        obj01.fun03();
        
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

class Child extends GrandFather{
    void fun03(){
        System.out.println("from child...");
    }
}
