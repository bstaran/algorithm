package programmers;

import java.util.LinkedList;
import java.util.List;

public class P134240 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{1, 3, 4, 6});
        System.out.println(result);
    }

    static class Solution {
        public String solution(int[] food) {

            List<Integer> foodList = new LinkedList<>();
            foodList.add(0);
            for (int i = food.length - 1; i > 0; i--) {
                for (int j = 0; j < food[i] / 2; j++) {
                    foodList.addFirst(i);
                    foodList.addLast(i);
                }
            }

            StringBuilder answer = new StringBuilder();
            for (int foodNo : foodList) {
                answer.append(foodNo);
            }

            return answer.toString();
        }
    }
}
