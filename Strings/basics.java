package Strings;

// basics of about strings

public class basics {
    public static void main(String[] args) {
        // Step 1: "suraj" is created in the String Pool, and `name` references it.
        // String name = "suraj";

        // // Step 2: A new String "kumar" is created in the String Pool. `name` now references this new String.
        // name = "kumar";  
        // System.out.println(name);

        // String name1 = "kumar";     

        // System.out.println(name==name1);

        // these values created outside the pool but in heap.
        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a==b);   // false (==(comparitor)
        System.out.println(a.equals(b)); //true
       
        
    }
}

