package Trees.BinaryTree;

// levelwise printing (not optimized) without bfs algorithm

public class TraverseNthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            left = right = null;
        }
    }

    // total height of tree or level
    public static int heightOfTree(Node root){
        if(root == null) return 0;
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    // custom level wise printing
    public static void levelOrderTraversal(Node root, int n){
        if(root == null) return;
        if(n == 1) System.out.print(root.val + " ");
        levelOrderTraversal(root.left, n-1);
        levelOrderTraversal(root.right, n-1);
    }

    // printing all levels at a time
    public static void levelOrderPrinting(Node root, int level){
        for(int i=1; i<=level; i++){
            levelOrderTraversal(root, i);
            System.out.println();
        }
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

        // levelOrderTraversal(root, 4);

        int NoOfLevel = heightOfTree(root);
        System.out.println(NoOfLevel);

        levelOrderPrinting(root, NoOfLevel);
    }
}
