package Stacks.ImportantQues;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();

        for(int i = str.length() - 1; i>=0; i--){
            char ch = str.charAt(i);
            int acsii = (int) ch;
            if(acsii >= 48 && acsii <= 57){
                val.push(ch + "");
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;

                String t = v1 + v2 + op;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
