package jianzhioffer.inversepairs;

/**
 * 数组中的逆序对
 * O(n^2) 复杂度不能通过
 * https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5
 */
public class Solution {
    private int count = 0;

    public int InversePairs(int[] arr) {
        if (arr == null || arr.length == 0) return count;
        helper(arr, 0, arr.length - 1);
        return count;
    }

    private void helper(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        helper(arr, start, mid);
        helper(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    private void conquer(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count = (count + mid - i + 1) % 1000000007;
            }
        }

        while (i <= mid) temp[k++] = arr[i++];

        while (j <= end) temp[k++] = arr[j++];

        for (k = 0; k < temp.length; k++) arr[start + k] = temp[k];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ret = s.InversePairs(new int[]{364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575});
        System.out.println(ret);
    }
}