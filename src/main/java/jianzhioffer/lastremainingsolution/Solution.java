package jianzhioffer.lastremainingsolution;

/**
 * 约瑟夫环问题
 * https://www.nowcoder.com/practice/f78a359491e64a50bce2d89cff857eb6
 */
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}
