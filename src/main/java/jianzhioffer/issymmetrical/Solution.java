package jianzhioffer.issymmetrical;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb
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

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return compare(pRoot.left, pRoot.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return compare(left.right, right.left) && compare(left.left, right.right);
    }
}
