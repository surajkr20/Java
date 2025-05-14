package oops;

public class classBasics {
    public static void main(String[] args) {
        // Student suraj; // declaration
        // suraj = new Student();  // initialization
        
        // Student suraj = new Student();
        // suraj.marks = 65;
        // suraj.name = "suraj";
        // System.out.println(suraj.marks);
        // System.out.println(suraj.name);
        // System.out.println(suraj.rollNo);

        // Student stud1 = new Student();
        // stud1.name = "aditi";
        // System.out.println(stud1.name);

        // stud1.greetings();

        Student obj1 = new Student("abhinav",004, 80.63f);
        // Student obj2 = new Student();

        // System.out.println(obj1.marks);
        // System.out.println(obj1.name);

        Student one = new Student();
        Student two = one;

        one.name = "something something";
        System.out.println(two.name);

    }
}

// create a class
class Student{
    String name;
    int rollNo;
    float marks;

    void changeName(String name){
        System.out.println(name);
    }

    void greetings(){ // normal fun/methods
        System.out.println("welcome" + " " + name);
    }

    Student(){
        this(80000); // calling a another constructor inside the constructor
        System.out.println("default constructor called");
    }

    Student(int bankBalance){
        System.out.println("abhinav's bankBalance " + "" + bankBalance);
    }

    Student(String name, int rollNo, float marks){  // parameterized constructor
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
