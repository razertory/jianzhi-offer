package leetcode.defangipadress;

/**
 * @author springchan
 * @date 2019-07-07
 * @description
 **/
public class Solution {
    public String defangIPaddr(String address) {
        if (address == null || address.isEmpty()) return address;
        String[] s = address.split("\\.");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length - 1; i++) {
            buffer.append(s[i]);
            buffer.append("[.]");
        }
        buffer.append(s[s.length - 1]);
        return buffer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.defangIPaddr("1.1.1.1");
    }
}
