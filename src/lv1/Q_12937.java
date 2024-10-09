package lv1;

//짝수와 홀수
public class Q_12937 {
        public String solution(int num) {

            String answer = "";

            if (num%2 == 0) {
                answer = "Even";
            }else {
                answer = "Odd";
            }
            return answer;
        }
}



