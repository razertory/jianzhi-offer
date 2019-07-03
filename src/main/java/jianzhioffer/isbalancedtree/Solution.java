package jianzhioffer.isbalancedtree;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left, 0) - maxDepth(root.right, 0)) <= 1 &&
                IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }
}
