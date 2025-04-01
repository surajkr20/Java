package Trees.BinaryTree;

public class sizeMaxSumHeight {
    // static int size = 0;
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(8);
        Node b = new Node(11);

        root.left = a;
        root.right = b;

        Node c = new Node(5);
        Node d = new Node(9);

        a.left = c;
        a.right = d;

        Node e = new Node(10);
        Node f = new Node(12);

        b.left = e;
        b.right = f;

        root.val = 10;

        System.out.println(size(root));
    }
}
