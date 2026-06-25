package programmers;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(20, 12);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {

        public static final int BORDER_THICKNESS = 2;

        public int[] solution(int brown, int yellow) {

            return calculateDimensions(brown, yellow);

        }

        private static int[] calculateDimensions(int brown, int yellow) {
            int sqrtHeight = (int) Math.sqrt(yellow);

            for (int yellowHeight = sqrtHeight; yellowHeight >= 1; yellowHeight--) {
                if (yellow % yellowHeight == 0) {

                    int yellowWidth = yellow / yellowHeight;
                    int carpetWidth = yellowWidth + BORDER_THICKNESS;
                    int carpetHeight = yellowHeight + BORDER_THICKNESS;
                    if (brown == calculateBrownTiles(carpetWidth, carpetHeight, yellow)) {
                        return new int[]{carpetWidth, carpetHeight};
                    }
                }
            }
            return new int[]{brown, 1};
        }

        private static int calculateBrownTiles(int carpetWidth, int carpetHeight, int yellow) {
            return carpetWidth * carpetHeight - yellow;
        }
    }
}
