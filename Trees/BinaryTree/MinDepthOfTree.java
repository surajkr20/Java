package Trees.BinaryTree;

// leetcode.111. Minimum Depth of Binary Tree = https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

public class MinDepthOfTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
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

        b.left = e;

        System.out.println(minDepth(root));
    }
}