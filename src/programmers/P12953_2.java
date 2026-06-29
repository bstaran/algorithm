package programmers;

public class P12953_2 {
    public static void main(String[] args) {
        P12953_2.Solution solution = new P12953_2.Solution();
        int result = solution.solution(new int[]{1, 2, 3});
        System.out.println(result);
    }

    static class Solution {

        public int solution(int[] arr) {

            int answer = arr[0];
            for (int i = 1; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }

            return answer;
        }

        private static int lcm(int a, int b) {
            return a / gcd(a, b) * b;
        }

        private static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }
}
