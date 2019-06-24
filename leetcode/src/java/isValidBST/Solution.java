package isValidBST;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 *
 * */


// https://leetcode.com/problems/validate-binary-search-tree/
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        ArrayList<TreeNode> order = new ArrayList<TreeNode>();
        validate(root, order);
        for (int i = 1; i < order.size(); i++){
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
