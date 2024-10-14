package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//제일 작은 수 제거하기
class Q_12935 {
  public List<Integer> solution(int[] arr) {
    if (arr.length == 1) {
      return Arrays.asList(-1);
    }

    Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    List<Integer> answer = new ArrayList<>(Arrays.asList(integerArray));

    Integer min = Collections.min(answer);

    answer.remove(min);

    return answer;
  }
}
