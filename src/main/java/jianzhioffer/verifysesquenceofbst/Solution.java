package jianzhioffer.verifysesquenceofbst;

/**
 * 验证二叉搜索树序列
 * https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return validate(sequence, 0, sequence.length - 1);
    }

    private boolean validate(int[] s, int left, int right){
        if (left >= right) return true;
        int cur = right;
        while(cur > left && s[cur - 1] > s[right]) cur--;
        for (int i = left; i < cur - 1; i++) {
            if (s[i] >= s[right]) return false;
        }
        return validate(s, left, cur - 1) && validate(s, cur, right - 1);
    }

    public static void main(String [] args) {
    }
}

