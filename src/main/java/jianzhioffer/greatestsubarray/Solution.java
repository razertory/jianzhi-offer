package jianzhioffer.greatestsubarray;


/**
 * 最大子序列和
 * https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int max = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            max += array[i - 1];
            max = Math.max(max, 0);
            sum = Math.max(sum, max + array[i]);
        }
        return sum;
    }
}
