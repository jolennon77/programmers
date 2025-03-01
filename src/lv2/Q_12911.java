package lv2;

public class Q_12911 {

  public int solution(int n) {

    int bitCnt = Integer.bitCount(n);

    while (true) {

      n++;

      if (bitCnt == Integer.bitCount(n)) {
        break;
      }
    }

    return n;
  }
}