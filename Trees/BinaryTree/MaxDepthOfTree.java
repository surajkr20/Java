package Trees.BinaryTree;

// Leetcode.ques.104. Maximum Depth of Binary Tree = https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

public class MaxDepthOfTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root == null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1 + Math.max(lh, rh);
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

        System.out.println(maxDepth(root));
    }
}
