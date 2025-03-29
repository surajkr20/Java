package Stacks.ImportantQues;

import java.util.Stack;

public class infixToPrefix {
     public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int acsii = (int) ch;

            if(acsii >= 48 && acsii <= 57){
                String s = "" + ch;
                val.push(s);
            }
            else if(op.empty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }else if(ch == ')'){
                while(op.peek() != '('){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    
                    char o = op.pop();
                    String t = o + v1 + v2;

                    val.push(t);
                }
                op.pop(); // '(' removed
            }
            else{
                // handling precendence of operators
                if(ch == '+' || ch == '-'){
                    if(op.peek() == '+' || op.peek() == '-'){
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        // push
                        op.push(ch);
                    }else op.push(ch);
                }else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }

        while (val.size() > 1) {
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
