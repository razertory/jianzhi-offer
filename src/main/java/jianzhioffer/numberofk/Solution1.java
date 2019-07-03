package jianzhioffer.numberofk;

/**
 * @author springchan
 * @date 2019-07-03
 * @description
 **/
public class Solution1 {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) return 0;
        return biSearch(array, k + 0.5) - biSearch(array, k - 0.5);
    }

    private int biSearch(int[] arr, double k) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) >> 1;
            if (arr[mid] < k)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return l;
    }
}
