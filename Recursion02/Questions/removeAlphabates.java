package Recursion02.Questions;

// ques => "abbacd" => bbcd(remove all 'a')

public class removeAlphabates {
    public static void main(String[] args) {
        String value = "abbacd";
        // System.out.println(removeAplpha(value));
        // skip("", value);
        System.out.println(skip01(value));
    }

    // brute force appraoch
    static StringBuilder removeAplpha(String str){
        StringBuilder newStr = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != 'a'){
                newStr.append(str.charAt(i));
            }
        }

        return newStr;
    }

    // using recursion(without return statement)
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p + ch, up.substring(1));
        }
    }

    // with return statement
    static String skip01(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip01(up.substring(1));
        }else {
            return ch + skip01(up.substring(1));
        }
    }
}
