package permutation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

/**
 * 字符串的全排列
 * https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7
 */
public class Solution {
    public ArrayList<String> Permutation(String str) {
        if (str == null || str.isEmpty()) return new ArrayList<>();
        HashSet<String> r = new HashSet<>();
        permutation(r, str.toCharArray(), 0);
        ArrayList<String> result = new ArrayList<>(r);
        result.sort(Comparator.naturalOrder());
        return new ArrayList<String>(result);
    }

    private void permutation(HashSet r, char[] str, int start) {
        if (start == str.length) {
            r.add(new String(str));
        }
        for (int i = start; i < str.length; i++) {
            swap(str, i, start);
            permutation(r, str, start + 1);
            swap(str, start, i);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
