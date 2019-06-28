package jianzhioffer.inversepairs;

import java.util.PriorityQueue;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对.
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5
 */
public class Solution {
    public int InversePairs(int [] array) {
        if (array == null || array.length ==  0) return 0;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            pq.add(array[i]);
            count += countBigger(pq.toArray(), array[i]);
        }

        return count;
    }

    private int countBigger(Object[] arr, int t) {
        int start = 0, end = arr.length - 1, mid = 0;
        if (t < (Integer) arr[0]) return arr.length;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((Integer) arr[mid] == t) {
                int i = mid, j = mid;
                break;
            } else if ((Integer) arr[mid] < t) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr.length - 1 - mid;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        //int ret = s.InversePairs(new int[]{1,2,3,4,5,6,7,3});
        System.out.println(s.countBigger(new Object[]{1,2,3,3}, 0));
        System.out.println(s.countBigger(new Object[]{1,2,3,3}, 7));
        System.out.println(s.countBigger(new Object[]{1,2,3,3}, 1));
        System.out.println(s.countBigger(new Object[]{1,2,3,3}, 3));
//        System.out.println(s.countBigger(new Object[]{1,2,3,3}, 2));
    }
}
