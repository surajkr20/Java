package Linkedlist.practise;

public class practise01 {
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

        void InsertAtTail(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                head.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIdx(int idx, int val){
            Node temp = head;
            Node t = new Node(val);
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void replace(int idx, int val){
            Node temp = head;
            Node t = new Node(val);
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next.next;
            temp.next = t;
        }

        Node getNthNode(int idx){
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp;
        }

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
        Linkedlist ll = new Linkedlist();
        ll.InsertAtTail(23);
        ll.InsertAtTail(24);

        ll.insertAtHead(22);
        ll.insertAtHead(21);

        ll.insertAtIdx(1, 22);

        ll.replace(2, 25);

        ll.display();
        // System.out.println(ll.size);

        Node ans = ll.getNthNode(2);
        System.out.println(ans.data);
        
    }
}
