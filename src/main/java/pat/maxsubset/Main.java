package pat.maxsubset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) numbers[i] = scanner.nextInt();
        System.out.println(maxSubset(numbers, len));
    }

    static int maxSubset(int[] numbers, int len) {
        int[] dp = new int[len];
        int result = numbers[0];
        dp[0] = result;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
