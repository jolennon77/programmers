package lv1;
class Q_12943 {
    //콜라츠 추측

    public int solution(int num) {
        int answer = 0;
        long number = num;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }

            answer++;

            if (answer == 500) {
                return -1;
            }
        }

        return answer;
    }
}
