package jianzhioffer.firstnotrepeat;

import java.util.HashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.isEmpty()) return -1;
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (count.containsKey(key))
                count.put(key, count.get(key) + 1);
            else
                count.put(key, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (count.get(key) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ret = s.FirstNotRepeatingChar("d232klnkle1dx123ndkl");
        System.out.println(ret);
    }
}
