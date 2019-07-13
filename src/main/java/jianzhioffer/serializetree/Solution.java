package jianzhioffer.serializetree;

import java.util.Stack;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84
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

    private int index = -1;

    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new
                Stack<>();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        if (index >= len) {
            return null;
        }
        String[] strr = str.split(",");
        TreeNode node = null;
        if (!strr[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
