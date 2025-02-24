package oops;

public class MainFile {
    public static void main(String[] args) {
        Human obj = new Human(null, 0, 0, false);
        System.out.println(obj.name);
    }
}

public class Human {
    String name;
    int age;
    float salary;
    boolean married;

    public Human(String name, int age, float salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }
}

