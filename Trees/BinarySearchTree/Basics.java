package Trees.BinarySearchTree;

public class Basics {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){

    }

    public static void main(String[] args) {
        // Representation of binary tree
        Node root = new Node(25);
        Node rootLeft = new Node(20);
        Node rootRight = new Node(25);

        root.left = rootLeft;
        root.right = rootRight;

        Node a = new Node(16);
        Node b = new Node(22);

        rootLeft.left = a;
        rootLeft.right = b;

        Node c = new Node(23);
        Node d = new Node(27);

        rootRight.left = c;
        rootRight.right = d;

        preorder(root);
        inorder(root);
    }
}
