package Stacks.Practise;

// import java.util.*;

public class practise02 {
    public static class MyStack {
        int[] arr = new int[5];
        int top = -1;
        // int n = arr.length-1;
        void push(int x){
            if(top == arr.length-1){
                System.out.println("Stack overflow, <Error>");
                return;
            }
            
            arr[++top] = x;
        }

        int pop(){
            if(top == -1){ // if stack is empty
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = arr[arr.length-1];
            top--;
            return x;
        }

        int peek(){
            return arr[arr.length - 1];
        }

        void display(){
            for(int i=0; i<=top; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        MyStack st = new MyStack();
        st.push(23);
        st.push(24);
        st.push(25);
        st.push(26);
        st.push(27);

        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();
    }
}
