package Trees.BinaryTree;

// leetcode.ques --> same tree = https://leetcode.com/problems/same-tree/

public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            left = right = null;
        }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(20);
        TreeNode a = new TreeNode(15);
        TreeNode b = new TreeNode(22);

        root1.left = a;
        root1.right = b;

        TreeNode root2 = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(22);

        root2.left = c;
        root2.right = d;

        System.out.println(isSameTree(root1, root2));
    }
}
