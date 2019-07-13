package jianzhioffer.maxinwindows;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值
 * https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (num == null) return new ArrayList<>();
        if (num.length < size) return new ArrayList<>();
        if (size == 0) return new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        int begin = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            begin = i - size + 1;
            if (queue.isEmpty())
                queue.add(i);
            else if (begin > queue.peekFirst())
                queue.pollFirst();

            queue.peekFirst();

            while (!queue.isEmpty() && num[queue.peekLast()] <= num[i]) {
                queue.pollLast();
            }

            queue.add(i);

            if (begin >= 0)
                ret.add(num[queue.peekFirst()]);
        }

        return ret;
    }
}
