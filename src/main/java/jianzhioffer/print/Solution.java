package jianzhioffer.print;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
 * 其他行以此类推
 * https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0
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

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        if (pRoot == null) return listAll;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        int level = 0;
        s1.push(pRoot);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            level += 1;
            while (level % 2 != 0 && !s1.isEmpty()) {
                TreeNode node = s1.pop();
                list.add(node.val);
                if (node.left != null) s2.push(node.left);
                if (node.right != null) s2.push(node.right);
            }

            while(level % 2 == 0 && !s2.isEmpty()){
                TreeNode node = s2.pop();
                list.add(node.val);
                if (node.right != null) s1.push(node.right);
                if (node.left != null) s1.push(node.left);
            }
            listAll.add(list);
        }
        return listAll;
    }
}
