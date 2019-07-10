package jianzhioffer.lastremainingsolution;

/**
 * 纯数学方法，需要找到约瑟夫环的公式
 * 假设 n 个数标记分别为0，1，2...n-1，那么第一个被踢出去的数是 (m-1) % n
 */
public class Solution2 {
    public int LastRemaining_Solution(int n, int m){
        if (n == 0) return -1;
        int last=0;
        for (int i=2; i <= n; i++) {
            last = (last+m)%i;
        }
        return last;
    }
}
