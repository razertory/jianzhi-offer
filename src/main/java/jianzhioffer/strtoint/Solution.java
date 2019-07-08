package jianzhioffer.strtoint;

/**
 * 将一个字符串转换成一个整数
 * https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e
 */
public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.isEmpty())
            return 0;
        char[] a = str.toCharArray();
        int symbol = 0;
        if (a[0] == '-')
            symbol = 1;
        int sum = 0;
        for (int i = symbol; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return symbol == 0 ? sum : sum * -1;
    }
}
