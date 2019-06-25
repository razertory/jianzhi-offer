package FindPath;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    // TODO 垃圾代码 leetcode 只打败了 5.07%
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, path, paths, target);
        return paths;
    }

    private void dfs(TreeNode root, List<Integer> path, List<List<Integer>> paths, int target) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && path.stream().mapToInt(a -> a).sum() == target) {
            paths.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        dfs(root.left, path, paths, target);
        dfs(root.right, path, paths, target);
        path.remove(path.size() - 1);
    }
}
