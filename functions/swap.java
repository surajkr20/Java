package functions;

public class swap {
    // in java only pass by value, no consept of pass by reference
    public static void main(String[] args) {
        int a = 45;
        int b = 34;

        swapvalue(a, b);

        // String name = "bhardwaaj abhinav";
        // // nameChange(name); // passed only value
        // System.out.println(name);

    }

    static void swapvalue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a & b are : " + a + " " + b);
    }

    static void nameChange(String naam){
        naam = "abhinav bhardwaj";
        System.out.println(naam); 
    }
}
