package jianzhioffer.numberofk;

/**
 * 统计一个数字在排序数组中出现的次数。
 * https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) return 0;
        int smaller = findSmaller(array, k);
        int bigger = findBigger(array, k);
        return bigger - smaller + 1;
    }

    private int findBigger(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    private int findSmaller(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
