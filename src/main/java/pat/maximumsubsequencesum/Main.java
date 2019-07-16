package pat.maximumsubsequencesum;

import java.util.Scanner;

/**
 * @author springchan
 * @date 2019-07-15
 * @description
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++)
            numbers[i] = scanner.nextInt();
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
