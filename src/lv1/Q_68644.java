package lv1;

import java.util.*;
import java.util.stream.Collectors;

//두 개 뽑아서 더하기
public class Q_68644 {
    public List<Integer> solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int x = numbers[i] + numbers[j];
                set.add(x);
            }
        }

        List<Integer> sortedList = set.stream().sorted().collect(Collectors.toList());
        return sortedList;
    }
}



