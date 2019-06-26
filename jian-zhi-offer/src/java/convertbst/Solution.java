package convertbst;

import java.util.ArrayList;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }


    public TreeNode Convert(TreeNode root) {
        if (root == null) return null;
        ArrayList<TreeNode> order = new ArrayList<>();
        inOrder(root, order);
        for(int i = 1; i < order.size(); i++) {
            order.get(i-1).right = order.get(i);
            order.get(i).left = order.get(i - 1);
        }
        return order.get(0);
    }

    private void inOrder(TreeNode root, ArrayList<TreeNode> order) {
        if (root == null) return;
        inOrder(root.left, order);
        order.add(root);
        inOrder(root.right, order);
    }
}
