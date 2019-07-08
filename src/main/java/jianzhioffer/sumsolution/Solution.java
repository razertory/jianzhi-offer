package jianzhioffer.sumsolution;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean f = (sum > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
