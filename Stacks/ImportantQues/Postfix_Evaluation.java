package Stacks.ImportantQues;

import java.util.Stack;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int acsii = (int) ch;
            if(acsii >= 48 && acsii <= 57){
                val.push(acsii - 48);
            }else{
                int v2 = val.pop();
                int v1 = val.pop();

                if(ch == '+') val.push(v1 + v2);
                if(ch == '-') val.push(v1 - v2);
                if(ch == '*') val.push(v1 * v2);
                if(ch == '/') val.push(v1 / v2);
            }
        }
        System.out.println(val.peek());
    }
}
