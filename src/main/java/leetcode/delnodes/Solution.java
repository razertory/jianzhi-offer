package leetcode.delnodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author springchan
 * @date 2019-07-07
 * @description
 **/
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // TODO 没有 A 过
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null) return new ArrayList<>();
        List<TreeNode> ret = new ArrayList<>();
        helper(root, ret, Arrays.stream(to_delete).boxed().collect(Collectors.toList()));
        return ret;
    }

    private void helper(TreeNode root, List<TreeNode> cur, List<Integer> del) {
        if (root == null) return;
        if (del.contains(root.val)) {
            helper(root.left, cur, del);
            helper(root.right, cur, del);
        } else {
            cur.add(root);
        }
    }
}
