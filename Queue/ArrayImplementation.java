package Queue;

public class ArrayImplementation {
    public static class Queue {
        int f = -1;
        int r = -1;
        int size = 0;

        int[] arr = new int[100];

        public void add(int val){
            if(r == arr.length - 1) {
                System.out.println("Queue is full, please increase the size..");
                return;
            }
            if(f == -1){
                f = r = 0;
            }else{
                r++;
            }
            arr[r] = val;
            size++;
        }

        public int remove(){
            f++; 
            size--;
            return arr[f-1];
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }

        void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }else{
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(34);
        q.add(35);
        q.add(36);
        q.add(37);
        q.add(38);

        q.display();
        System.out.println(q.remove());
    }
}
