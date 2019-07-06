package jianzhioffer.elftrotatestring;

/**
 * 字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc
 * https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec
 */
public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.isEmpty()) return str;
        int count = n % str.length();
        StringBuffer buffer = new StringBuffer(str);
        for (int i = 0; i <= n - 1; ++i) {
            buffer.append(str.charAt(i));
        }
        return buffer.toString().substring(n, buffer.length());
    }
}
