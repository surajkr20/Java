package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversals {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // preorder traversals
    static class PreOrderTraversals{
        // recursive approach
        private void helper(TreeNode root, List<Integer> ans){
            if(root == null) return;
            ans.add(root.val);
            helper(root.left, ans);
            helper(root.right, ans);
        }
        public List<Integer> preorderRecursive(TreeNode root){
            List<Integer> ans = new ArrayList<>();
            helper(root, ans);
            return ans;
        }

        // iterative approach
        public List<Integer> preorderIterative(TreeNode root){
            List<Integer> preorder = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();
            st.push(root);

            while(!st.isEmpty()){
                root = st.pop();
                preorder.add(root.val);

                if(root.right != null){
                    st.push(root.right);
                }
                if(root.left != null){
                    st.push(root.left);
                }
            }

            return preorder;
        }
    }

    static class InorderTraversals{
        // recursive approach
        public void helper(TreeNode root, List<Integer> ans){
            if(root == null) return;
            helper(root.left, ans);
            ans.add(root.val);
            helper(root.right, ans);
        }
        public List<Integer> inorderRecurrsive(TreeNode root){
            List<Integer> ans = new ArrayList<>();
            helper(root, ans);
            return ans;
        }

        // iterative approach of inorder traversal
        public List<Integer> inorderIterative(TreeNode root){
            List<Integer> inorder = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();
            TreeNode node = root;
            while(true){
                if(node != null){
                    st.push(node);
                    node = node.left;
                }else{
                    if(st.isEmpty()) break;
                    node = st.pop();
                    inorder.add(node.val);
                    node = node.right;
                }
            }
            return inorder;
        }
    }

    static class PostOrderTraversals{
        // recursive approach
        public void helper(TreeNode root, List<Integer> ans){
            if(root == null) return;
            helper(root.left, ans);
            helper(root.right, ans);
            ans.add(root.val);
        }
        public List<Integer> PostOrderRecursive(TreeNode root){
            List<Integer> ans = new ArrayList<>();
            helper(root, ans);
            return ans;
        }

        // itrative approach - using two stack
        public List<Integer> PostOrderIterative(TreeNode root){
            List<Integer> postOrder = new ArrayList<>();
            Stack<TreeNode> st1 = new Stack<>();
            Stack<TreeNode> st2 = new Stack<>();

            if(root == null) return postOrder;

            st1.push(root);

            while(!st1.isEmpty()){
                root = st1.pop();
                st2.push(root);

                if(root.left != null) st1.push(root.left);
                if(root.right != null) st1.push(root.right);
            }

            while(!st2.isEmpty()){
                postOrder.add(st2.pop().val);
            }

            return postOrder;
        }
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

        // PreOrderTraversals implement = new PreOrderTraversals();
        // System.out.println(implement.preorderRecursive(root));
        // System.out.println(implement.preorderIterative(root));

        // InorderTraversals inorder = new InorderTraversals();
        // System.out.println(inorder.inorderRecurrsive(root));
        // System.out.println(inorder.inorderIterative(root));

        PostOrderTraversals postorder = new PostOrderTraversals();
        System.out.println(postorder.PostOrderIterative(root));
        System.out.println(postorder.PostOrderRecursive(root));
    }
}
