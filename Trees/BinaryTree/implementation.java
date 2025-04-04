package Trees.BinaryTree;

public class implementation {
    public static class Node{
        int val;
        Node left, right;

        Node(int val){
            this.val = val;
            left = right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    
    public static int maxNode(Node root){
        if(root == null) return 0;

        int a = maxNode(root.left);
        int b = maxNode(root.right);
        int c = root.val;

        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(4);
        Node b = new Node(6);
        // connection, root to left and right
        root.left = a;
        root.right = b;

        Node c = new Node(3);
        Node d = new Node(3);
        a.left = c;
        a.right = d;

        Node e = new Node(5);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        // preorder traversal (root->left->right)
        // preorder(root);

        // finding size of tree
        System.out.println(size(root));

        // sum of tree nodes
        System.out.println(sumOfNodes(root));

        // max value of in tree
        System.out.println(maxNode(root));
    }
}
