package jianzhioffer.numberofk;

/**
 * @author springchan
 * @date 2019-07-03
 * @description
 **/
public class Solution2 {
    public int GetNumberOfK(int [] array , int k) {
        return count(array, k, 0, array.length - 1);
    }

    public int count(int [] array, int k, int left, int right) {
        if (left > right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int midValue = array[mid];
        if (k < midValue) {
            return count(array, k, left, mid-1);
        } else if (k > midValue) {
            return count(array, k, mid+1, right);
        } else {
            return count(array, k, left, mid-1) + count(array, k, mid+1, right) + 1;
        }
    }
}
