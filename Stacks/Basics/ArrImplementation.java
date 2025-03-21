package Stacks.Basics;

// array implemantation of stack

public class ArrImplementation {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;
        void push(int val){
            if(isFull()){
                System.out.println("stack is full!");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(12);
        st.push(23);
        st.push(24);
        st.push(25);
        st.push(26);

        st.display();
        
        st.push(100);
    }
}
