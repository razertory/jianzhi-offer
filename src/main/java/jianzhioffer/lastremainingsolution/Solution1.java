package jianzhioffer.lastremainingsolution;

import java.util.LinkedList;
import java.util.List;

/**
 * @author springchan
 * @date 2019-07-06
 * @description
 **/
public class Solution1 {
    public int LastRemaining_Solution(int n, int m){
        if (n == 0) return 0;

        List numbers = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) numbers.add(i);
        int index = -1;
        while(numbers.size() > 1) {
            index = (m + index) % numbers.size(); // 模拟链表
            numbers.remove(index);
            index--;
        }
        return (int) numbers.get(0);
    }
}
