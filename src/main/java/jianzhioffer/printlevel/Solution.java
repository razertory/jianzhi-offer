package jianzhioffer.printlevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288
 **/
public class Solution {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);

        while(!queue.isEmpty()) {
            ArrayList<Integer> thisLevel = new ArrayList<>();
            int low = 0, high = queue.size();
            for (int i = low; i < high; i++) {
                TreeNode node = queue.poll();
                thisLevel.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            ret.add(thisLevel);
        }
        return ret;
    }
}
