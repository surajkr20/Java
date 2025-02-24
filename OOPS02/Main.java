package OOPS02;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4);
        // System.out.println(box.l + " " + box.h + " " + box.w );

        // Old_Box childBox = new Old_Box(1.0, 2.5, 23.22, 12.03);
        // System.out.println("result: " + childBox.l + childBox.weight);

        Old_Box obj = new Old_Box();
        
    }
}

class Box {
    private double l;
    double h;
    double w;

    String name = "abhinav bhardwaj";

    void show(){
        System.out.println("this is Parent class method..");
    }

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
        System.out.println("calling default constructor");
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
        System.out.println("calling the cube property");
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
        System.out.println("calling old parameter constructor");
    }
}

class Old_Box extends Box{
    double weight;

    public Old_Box(){
        this.weight = -1;
    }

    public Old_Box(double l, double h,double w, double weight){ 
        // super(6); // calling parameterized constructor
        // super.show(); // calling parent class method
        // System.out.println(super.name); // accessing parent class variables
        // this.weight = weight; 
    }

    Old_Box(Old_Box other){
        super(other);
    }

}