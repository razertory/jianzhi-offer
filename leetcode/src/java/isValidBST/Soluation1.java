package isValidBST;

public class Soluation1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    // 递归地控制当前遍历的最小，最大值。保证当前节点一定大于最小值，小于最大值
    private boolean validate(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (min != null && min.val >= root.val) return false;
        if (max != null && max.val <= root.val) return false;
        return validate(root.left, min, root) && validate(root.right, root, max);
    }
}
