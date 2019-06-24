package isValidBST;

public class Soluation1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    /**
     * 思路和 solution2 一致，不断维持一个上下界
     */
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    // 递归地控制当前遍历的最小，最大值。保证当前节点一定大于最小值，小于最大值
    private boolean validate(TreeNode root, TreeNode lower, TreeNode upper) {
        if (root == null) return true;
        if (lower != null && lower.val >= root.val) return false;
        if (upper != null && upper.val <= root.val) return false;
        return validate(root.left, lower, root) && validate(root.right, root, upper);
    }
}
