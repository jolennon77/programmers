package lv1;

//약수의 합
public class Q_12928 {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                answer += i;
                if (i != n / i) { // i와 n/i가 다르면 둘 다 더하기
                    answer += n / i;
                }
            }
        }

        return answer;
    }
}



