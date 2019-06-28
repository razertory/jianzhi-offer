package leetcode.isvalidbst;

import java.util.ArrayList;

/**
 * 是否是二叉搜索树
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * BST 的中序遍历是一个非递减的有序序列, 利用这个特性即可
     * T: O(n) S: O(n)
     */
    public boolean isValidBST(TreeNode root) {
        ArrayList<TreeNode> order = new ArrayList();
        validate(root, order);
        for (int i = 1; i < order.size(); i++) {
            if (order.get(i).val <= order.get(i - 1).val) return false;
        }
        return true;
    }

    private void validate(TreeNode root, ArrayList<TreeNode> order) {
        if (root == null) return;
        validate(root, order);
        order.add(root);
        validate(root, order);
    }
}
