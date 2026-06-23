package programmers;

public class fibonacci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5);
        System.out.println(result);
    }
}

class Solution {

    private static final int MOD = 1234567;

    public int solution(int n) {
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n - 1; i++) {
            int next = (previous + current) % MOD;
            previous = current;
            current = next;
        }

        return current;
    }
}
