package Trees.BinaryTree;

public class implementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            left = right = null;
        }
    }

    // preorder traversal(root->left->right)
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal(left->root>right)
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // postorder traversal(left->right->root)
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // total size of nodes in given tree
    public static int sizeOfTrees(Node root){
        if(root == null) return 0;
        return 1 + sizeOfTrees(root.left) + sizeOfTrees(root.right);
    }

    // max node in the given nodes
    public static int maxNode(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = Math.max(maxNode(root.left), maxNode(root.right));
        int result = Math.max(a, b);
        return result;
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

        // preorder(root);
        // inorder(root);
        // postorder(root);

        // System.out.println(sizeOfTrees(root));

        System.out.println(maxNode(root));

    }
}
