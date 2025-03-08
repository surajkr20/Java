package Linkedlist;

public class BasicsLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                inserAtEnd(val);
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIdx(int idx, int val){

            if(idx < 0 || idx > size){
                System.out.println("wrong idx");
                return;
            }
            else if(idx == 0){
                insertAtHead(val);
                return;
            }
            else if(idx == size){
                inserAtEnd(val);
                return;
            }

            Node temp = head;
            Node t = new Node(val);
            
            for(int i=1; i<= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getElement(int idx){
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int idx){
            Node temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        // display fun 
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Node a = new Node(34);
        // Node b = new Node(35);
        // Node c = new Node(36);
        // Node d = new Node(37);

        // a.next = b;
        // b.next = c;
        // c.next = d;

        Linkedlist ll = new Linkedlist();
        ll.inserAtEnd(56);
        ll.inserAtEnd(58);
        ll.inserAtEnd(34);
        ll.deleteAtIndex(1);
        ll.display();
        System.out.println(ll.size);
    }
}