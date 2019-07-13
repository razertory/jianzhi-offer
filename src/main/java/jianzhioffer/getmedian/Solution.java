package jianzhioffer.getmedian;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 * https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1
 */
public class Solution {

    private int count;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            //PriorityQueue默认是小顶堆，实现大顶堆，需要反转默认排序器
            return o2.compareTo(o1);
        }
    });


    public void Insert(Integer num) {
        count += 1;
        if ((count & 1) == 0) {
            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        } else {
            if (!minHeap.isEmpty() && num > maxHeap.peek()) {
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {
        if (count == 0) return 0d;
        double result;
        if ((count & 1) == 1) {
            result = maxHeap.peek();
        } else {
           result = (minHeap.peek() + maxHeap.peek()) / 2d;
        }
        return result;
    }
}
