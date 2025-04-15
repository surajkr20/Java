package Trees.BinaryTree;

// Leetcode.ques.257. Binary Tree Paths = https://leetcode.com/problems/binary-tree-paths/description/?source=submission-ac

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void helper(TreeNode root, List<String> ans, String s) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s + root.val + "->");
        helper(root.right, ans, s + root.val + "->");
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        TreeNode a = new TreeNode(15);
        TreeNode b = new TreeNode(22);

        root.left = a;
        root.right = b;

        TreeNode c = new TreeNode(10);

        a.left = c;

        List<String> ans = binaryTreePaths(root);
        System.out.println(ans);
    }
}
