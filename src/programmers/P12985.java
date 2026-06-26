package programmers;

public class P12985 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(8, 1, 7);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n, int a, int b) {

            if (a > b){
                int tmp = a;
                a = b;
                b = tmp;
            }

            int count = 1;
            while (!(b - a == 1 && a % 2 == 1)) {
                if (a % 2 != 0) a++;
                if (b % 2 != 0) b++;
                a /= 2;
                b /= 2;
                count++;
            }
            return count;
        }
    }
}
