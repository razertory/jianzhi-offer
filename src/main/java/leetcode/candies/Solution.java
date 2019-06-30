package leetcode.candies;

/**
 * 周赛
 * https://leetcode.com/problems/distribute-candies-to-people/
 **/
public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        if (num_people <= 0) return new int[0];
        if (candies <=0) return new int[num_people];
        int cur = 0;
        int i = 0;
        int[] ret = new int[num_people];
        while (candies > 0) {
            cur+=1;
            int left = candies - cur;
            if (left == 0) {
                ret[i] += cur;
                break;
            }
            if (left < 0) {
                ret[i] += candies;
                break;
            }
            candies = left;
            ret[i] = ret[i] + cur;
            i = (i+1) % (num_people);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int[] r = s.distributeCandies(1, 1);
        System.out.println(r);
    }
}
