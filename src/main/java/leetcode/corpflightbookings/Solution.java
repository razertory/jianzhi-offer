package leetcode.corpflightbookings;

/**
 * @author springchan
 * @date 2019-07-07
 * @description
 **/
public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        if (bookings == null || bookings.length == 0) return new int[n];
        int[] ret = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int[] booking = bookings[i];
            for (int j = booking[0]; j <= booking[1]; j++) {
                ret[j-1] += booking[2];
            }
        }
        return ret;
    }
}
