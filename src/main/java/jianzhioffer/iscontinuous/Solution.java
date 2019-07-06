package jianzhioffer.iscontinuous;

import java.util.Arrays;

/**
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 * https://www.nowcoder.com/practice/762836f4d43d43ca9deb273b3de8e1f4
 */
public class Solution {
    public boolean isContinuous(int[] numbers) {
        int len=numbers.length;
        if(len!=5)  return false;
        Arrays.sort(numbers);
        int jokers=0;//计算王的数目
        for(int i=0;i<5&&numbers[i]==0;i++){
            jokers++;
        }
        if(jokers>4) return false;

        for(int i=jokers+1;i<5;i++){
            if(numbers[i]==numbers[i-1])//判断对子的存在
                return false;
        }
        int dis=numbers[4]-numbers[jokers];
        if(dis<=4)   return true;
        return false;
    }
}
