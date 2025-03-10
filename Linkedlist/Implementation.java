package Linkedlist;

public class Implementation {
    // Node list
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist{
        Node head = null;
        Node tail = null;

        int size = 0;
        // Insert At end
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if( head == null ){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;

            size++;
        }

        // display the all nodes
        void display(){
            Node temp = head;
            while( temp != null ){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        // length of nodes
        int length(){
            Node temp = head;
            int count = 0;
            while( temp != null ){
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Insert At beggining
        void insertAtHead(int val){
            Node temp = new Node(val);

            if(head == null){
                temp = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }

            size++;
        }

        // insert at given index 
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;

            if(idx == size){
                insertAtEnd(val);
                return;
            }else if(idx == 0){
                insertAtHead(val);
                return;
            }else if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return;
            }

            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;

            size++;
        }

        // get element
        int getElement(int idx){
            Node temp = head;
            if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return -1;
            }
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        // deleteAtIndex
        void deleteAtIndex(int idx){
            Node temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        // remove duplecates 
        void deleteDuplicates() {
            Node temp = head;
            while(temp.next != null){
                if(temp.data == temp.next.data){
                    temp.next = temp.next.next;
                    size--;
                }else{
                    temp = temp.next;
                }
            }
            tail = temp;
            tail.next = null;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        // ll.insertAtHead(10);
        // ll.insertAtHead(12);
        // ll.insertAtHead(28);
        ll.insertAtEnd(30);
        ll.insertAtEnd(35);
        ll.insertAtEnd(35);
        ll.insertAtEnd(35);

        // ll.display();

        // ll.insertAt(1, 35);
        // ll.display();

        // System.out.println(ll.getElement(3));

        // ll.deleteAtIndex(3);
        // ll.display();

        ll.display();
        ll.deleteDuplicates();
        ll.display();
    }
}
