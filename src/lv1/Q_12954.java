package lv1;

import java.util.*;

//x만큼 간격이 있는 n개의 숫자
public class Q_12954 {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            answer.add((long) x * i);
        }
        return answer;
    }
}