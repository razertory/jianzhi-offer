package jianzhioffer.numberapearonce;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811
 */
public class Solution {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array, int num1[] , int num2[]) {
        if (array == null || array.length == 0) return;
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            temp ^= array[i];
        }

        int index = 0;
        while(temp != 0) {
            if (temp % 2 == 1) break;
            temp >>= 1;
            index++;
        }

        for (int i = 0; i < array.length; i++) {
            if (indexBit(array[i], index) == 0)
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }

    // 第 index 位的二进制值
    private int indexBit(int n, int index) {
        n >>= index;
        return  n % 2;
    }
}
