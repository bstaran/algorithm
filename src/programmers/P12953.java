package programmers;

import java.util.Arrays;

public class P12953 {
    public static void main(String[] args) {
        P12953.Solution solution = new P12953.Solution();
        int result = solution.solution(new int[]{1, 2, 3});
        System.out.println(result);
    }

    static class Solution {

        private static int candidateMultiple;
        private static int incrementStep;

        public int solution(int[] arr) {

            Arrays.sort(arr);
            candidateMultiple = arr[arr.length - 1];
            incrementStep = arr[ arr.length - 1];

            boolean isCommonMultiple = false;
            while (!isCommonMultiple) {
                if (isCommonMultiple(arr)) {
                    isCommonMultiple = true;
                }
            }

            return candidateMultiple;
        }

        private static boolean isCommonMultiple(int[] arr) {
            for (int i : arr) {
                if (candidateMultiple % i != 0) {
                    candidateMultiple += incrementStep;
                    return false;
                }
            }
            return true;
        }
    }
}
