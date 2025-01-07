package Strings;

import java.util.ArrayList;

public class concatinations {
    public static void main(String[] args) {
        // characters concatination
        System.out.println('a'+'b');    //195

        // strings concatinations
        System.out.println("a"+"b");

        // char + int concatinations
        System.out.println('a'+3);

        System.out.println((char)('a'+3)); // output - d

        System.out.println("suraj"+ new ArrayList<>()); // suraj[]

        System.out.println("suraj"+ new Integer(56)); // suraj56 

        String ans = new Integer(55) + "" + new ArrayList<>();
        System.out.println(ans);    // 55[]

        
    }
}

