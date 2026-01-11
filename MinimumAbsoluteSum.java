import java.util.*;
public class MinimumAbsoluteSum {
    public static int minAbsSum(int[] A) {
        int n = A.length;
        int sum = 0;
        for (int num : A) {
            sum += Math.abs(num);
        }

        int half = sum / 2;
        boolean[] dp = new boolean[half + 1];
        dp[0] = true;

        for (int num : A) {
            int absNum = Math.abs(num);
            boolean[] next = Arrays.copyOf(dp, dp.length);
            for (int j = 0; j <= half - absNum; j++) {
                if (dp[j]) {
                    next[j + absNum] = true;
                }
            }
            dp = next;
        }

        // Find the closest achievable sum to half
        for (int j = half; j >= 0; j--) {
            if (dp[j]) {
                int other = sum - j;
                return Math.abs(other - j);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 2, -2};
        System.out.println("Minimum Absolute Sum: " + minAbsSum(A));
    }
}

