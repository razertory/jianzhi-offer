package jianzhioffer.firstappearonce;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符
 * https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720
 */
public class Solution {
    int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
            hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] str=s.toString().toCharArray();
        for(char c:str)
        {
            if(hashtable[c]==1)
                return c;
        }
        return '#';
    }
}
