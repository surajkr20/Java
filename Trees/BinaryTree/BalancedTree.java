package Trees.BinaryTree;

// Leetcode.ques.110 ->> Balanced Binary Tree = https://leetcode.com/problems/balanced-binary-tree/description/

public class BalancedTree {
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
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lh = height(root.left);
        if(root.left != null) lh++;

        int rh = height(root.right);
        if(root.right != null) rh++;

        int d = Math.abs(lh - rh);
        if(d > 1) return false;

        return (isBalanced(root.left) && isBalanced(root.right));
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

        isBalanced(root);
    }
}
