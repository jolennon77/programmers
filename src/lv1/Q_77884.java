package lv1;

import java.util.*;

public class Q_77884 {

    class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {

                double sqrt = Math.sqrt(i);

                //제곱수가 정수인 경우 약수의 개수가 홀수
                //ex 16의 재곱근은 4 -> 16의 약수는 1,2,4,8,16 5개
                //15의 제곱근은 3.xxx -> 15의 제곱 1,3,5,15 4개
                if (i % sqrt == 0) {
                    answer -= i;
                } else {
                    answer += i;
                }
            }
            return answer;
        }
    }
}
