package OOPs;

// same name but diffrent types of arguments is called method overloading

class Calculator{

    int num = 34; // instance varible

    public int add(int n1, int n2){  //  n1,n2 are local variables
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class methodoverloading {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        double result = obj.add(345.5,34,54);
        System.out.println(result);
    }
}
