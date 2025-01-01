package lv1;

import java.util.Arrays;

//내적
public class Q_70128 {
    class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;

            for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
            }

            return answer;

        }
    }
}
