package lv1;

import java.util.Arrays;

public class Q_86051 {

    class Solution {
        public int solution(int[] numbers) {

            int sum = 0;

            for (int i = 0; i <= 9; i++) {
                sum += i;
            }

            int answer = sum - Arrays.stream(numbers).sum();

            return answer;
        }
    }
}
