package lv1;//연습장

class Q_12934 {
    //정수 제곱근 판별
    public long solution(long n) {
        int root = (int) Math.sqrt(n);

        if ((long) root * root == n) {
            return (long) (root + 1) * (root + 1);
        }
        return -1;
    }
}