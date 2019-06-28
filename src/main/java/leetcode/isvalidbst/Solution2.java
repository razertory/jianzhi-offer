package leetcode.isvalidbst;

public class Solution2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 左子树的最大值小于 root
     * 右子树的最小值大于 root
     * T: O(n*logn) S:O(n)
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean leftValid = root.left == null || getMax(root.left).val < root.val;
        boolean rightValid = root.right == null || getMin(root.right).val > root.val;
        return leftValid && rightValid && isValidBST(root.left) && isValidBST(root.right);
    }

    private TreeNode getMin(TreeNode root) {
        if (root.left == null) return root;
        return getMin(root.left);
    }

    private TreeNode getMax(TreeNode root) {
        if (root.right == null) return root;
        return getMax(root.right);
    }
}
