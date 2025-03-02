package Linkedlist;

public class practise {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void display01(Node head){
        if(head == null ) return;
        System.out.println(head.data);
        display01(head.next);
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;

        int size = 0;

        // insertAtEnd
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // insertAtHead
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                // head = tail = temp;
                insertAtEnd(val);
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // display the all nodes
        void display(){
            Node temp = head;
            while( temp!=null ){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        // sizeOfll
        int sizeOfll(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        // insertAt
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;

            if(idx == sizeOfll()){
                insertAtEnd(val);
                return;
            }else if(idx == 0){
                insertAtHead(val);
                return;
            }else if(idx < 0 || idx > sizeOfll()){
                System.out.println("wrong index, make sure is it valid index value");
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

            size++;
        }

        // get value
        int getAt(int idx){
            Node temp = head;
            if(idx < 0 || idx > sizeOfll()){
                return -1;
            }
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        // deleteAt
        void deleteAt(int idx){
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.insertAtEnd(45);
        ll.insertAtEnd(55);

        ll.display();

        ll.insertAtHead(78);

        // ll.display();

        // ll.sizeOfll();

        ll.insertAt(3, 33);
        ll.display();

        // System.out.println(ll.getAt(4));
        ll.deleteAt(2);
        ll.display();
        System.out.println(ll.size);
    }
}
