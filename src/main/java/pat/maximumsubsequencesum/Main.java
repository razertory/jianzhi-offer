package pat.maximumsubsequencesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author springchan
 * @date 2019-07-15
 * @description
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.valueOf(reader.readLine());
        int[] numbers = new int[len];
        String[] split = reader.readLine().split(" ");
        for (int i = 0; i < len; i++){
            numbers[i] = Integer.valueOf(split[i]);
        }

        maxSubset(numbers, len);
    }

    static void maxSubset(int[] array, int len) {
        int cur = 0, max = Integer.MIN_VALUE, start = 0, end = len - 1, index = 0;
        for (int i = 0; i < len; i++) {
            int number = array[i];
            cur += number;
            if (cur < 0) {
                cur = 0;
                index = i + 1;
            } else if (cur > max) {
                max = cur;
                start = index;
                end = i;
            }
        }
        max = Math.max(max, 0);
        System.out.println(max + " "+ array[start] + " "+ array[end]);
    }
}
