package Stacks.ImportantQues;

import java.util.Stack;

public class prefix_evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            int acsii = (int) ch;
            if(acsii >= 48 && acsii <= 57){
                val.push(acsii - 48);
            }else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
