package Trees.BinaryTree;

public class implementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
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
        Node f = new Node(10);

        b.left = e;
        b.right = f;

        root.val = 10;
        
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
}
