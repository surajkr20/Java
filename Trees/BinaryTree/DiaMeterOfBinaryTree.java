package Trees.BinaryTree;

// leetcode.ques.543 => Diameter of binary tree(ength of the longest path between any two nodes) => https://leetcode.com/problems/diameter-of-binary-tree/description/

public class DiaMeterOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            left = right = null;
        }
    }

    public static int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);

        int mid = height(root.left) + height(root.right);

        if(root.left != null) mid++;
        if(root.right != null) mid++;

        int max = Math.max(leftAns, Math.max(rightAns, mid));

        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        TreeNode a = new TreeNode(15);
        TreeNode b = new TreeNode(22);

        root.left = a;
        root.right = b;

        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(18);

        a.left = c;
        a.right = d;

        TreeNode e = new TreeNode(15);
        TreeNode f = new TreeNode(25);

        b.left = e;
        b.right = f;

        System.out.println(diameterOfBinaryTree(root));
    }
}
