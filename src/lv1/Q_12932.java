package lv1;

import java.util.ArrayList;
import java.util.List;

class Q_12932 {
    //자연수 뒤집어 배열로 만들기
    public List<Long> solution(long n) {

        List<Long> answer  = new ArrayList<>();

        while (n != 0){
            answer.add(n % 10);
            n = n / 10;
        }

        return answer;
    }
}