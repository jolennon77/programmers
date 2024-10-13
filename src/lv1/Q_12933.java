package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Q_12933 {
    //정수 내림차순으로 배치하기
    public long solution(long n) {
        List<Long> list = new ArrayList<>();

        while (n != 0 ) {
            list.add(n % 10);
            n = n / 10;
        }
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (long num : list) {
            result.append(num);
        }

        long answer = Long.parseLong(result.toString());
        return answer;
    }
}