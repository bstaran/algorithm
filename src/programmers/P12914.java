package programmers;

public class P12914 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(3);
        System.out.println(result);
    }

    static class Solution {
        public long solution(int n) {

            if (n == 1) {
                return 1L;
            }

            long[] dp = new long[n];
            dp[0] = 1L;
            dp[1] = 2L;
            for (int i = 2; i < n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567L;
            }

            return dp[n - 1];
        }
    }
}
