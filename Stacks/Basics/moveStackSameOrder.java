package Stacks.Basics;

import java.util.Scanner;
import java.util.Stack;

public class moveStackSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n;
        System.out.println("Enter the size of stack : ");
        n = sc.nextInt();

        System.out.println("enter Elements : ");

        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);

        // move stack in another stack in reverse order
        Stack<Integer> st2 = new Stack<>();

        while(st.size() > 0){
            // int x = st.peek();
            // st2.push(x);
            // st.pop();

            st2.push(st.pop());
        }

        // for same order
        Stack<Integer> st3 = new Stack<>();

        while(st2.size() > 0){
            st3.push(st2.pop());
        }

        System.out.println("stack1 : " + "" + st);
        System.out.println("stack2 : " + "" + st2);
        System.out.println("stack3 : " + "" + st3);
    }
}
