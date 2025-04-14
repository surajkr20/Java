package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// level wise printing using BFS algorithm = queue implementation

public class BFSALGO {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            left = right = null;
        }
    }

    public static void bfsImplementation(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);

        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);

            System.out.print(temp.val + " ");
            q.remove();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        Node root = new Node(20);
        Node a = new Node(15);
        Node b = new Node(22);

        root.left = a;
        root.right = b;

        Node c = new Node(10);
        Node d = new Node(18);

        a.left = c;
        a.right = d;

        Node e = new Node(15);
        Node f = new Node(25);

        b.left = e;
        b.right = f;

        bfsImplementation(root);
    }
}
