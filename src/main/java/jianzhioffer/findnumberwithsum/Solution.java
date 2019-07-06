package jianzhioffer.findnumberwithsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b
 */
public class Solution {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> ret = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(sum - array[i], array[i]);
        }

        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                min = Math.min(min, map.get(array[i]) * array[i]);
                ret.put(min, new ArrayList<>(Arrays.asList(array[i], map.get(array[i]))));
            }
        }

        if (ret.isEmpty()) return new ArrayList<>();

        Collections.sort(ret.get(min));
        return ret.get(min);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.FindNumbersWithSum(new int[]{1, 2, 4, 7, 11, 16}, 10);
    }
}
