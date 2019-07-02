package jianzhioffer.greatestsubarray;

/**
 * @author springchan
 * @date 2019-07-02
 * @description
 **/
public class Solution1 {

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] sum = new int[array.length];
        int result = array[0];
        sum[0] = result;
        for (int i = 1; i < array.length; i++) {
            sum[i] = Math.max(sum[i - 1] + array[i], array[i]);
            result = Math.max(sum[i], result);
        }
        return result;
    }
}
