package jianzhioffer.greatestsubarray;

/**
 * @author springchan
 * @date 2019-07-02
 * @description
 **/
public class Solution1 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] dp = new int[array.length];
        int result = array[0];
        dp[0] = result;
        for (int i = 1; i < array.length; i++) {
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
