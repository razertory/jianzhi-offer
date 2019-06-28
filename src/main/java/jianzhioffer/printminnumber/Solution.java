package jianzhioffer.printminnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993
 */
public class Solution {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i + "");
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String m, String n) {
                return myCompare(m, n);
            }
        });

        String s = "";
        for (String i : list) {
            s += i;
        }

        return s;
    }

    private int myCompare(String s1, String s2) {
        String sum1 = s1 + s2;
        String sum2 = s2 + s1;
        return sum1.compareTo(sum2);
    }
}