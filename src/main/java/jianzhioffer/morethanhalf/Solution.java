package jianzhioffer.morethanhalf;

import java.util.HashMap;

/**
 * 超过一半的数字
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int count = 1, cur = array[0];
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int i = 1; i < array.length; i++) {
            if (numCount.containsKey(array[i]))
                numCount.put(array[i], numCount.get(array[i]) + 1);
            else
                numCount.put(array[i], 1);
            if (count == 0) {
                cur = array[i];
                count = 1;
            } else if (array[i] == cur) {
                count++;
            } else {
                count--;
            }
        }
        if (count == 0 || numCount.get(cur) < array.length / 2) return 0;
        return cur;
    }
}
