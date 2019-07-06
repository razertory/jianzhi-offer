package jianzhioffer.findcontinussequence;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe
 * 滑动窗口法
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int low = 1, high = 2;
        while (low < high) {
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> sub = new ArrayList<>();
                for(int i = low; i <= high; i++) {
                    sub.add(i);
                }
                ret.add(sub);
                low++;
            }
            if (cur < sum) high++;
            if (cur > sum) low++;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<ArrayList<Integer>> ret = s.FindContinuousSequence(3);
        System.out.println(ret);
    }
}
