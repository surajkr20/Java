package Strings;

// string builder performance is very fast, then string

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // builder.append("hello");
        // builder.append("suraj");

        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.delete(3,5));
    }
}
