package lv1;

import java.util.Scanner;

//[PCCE 기출문제] 2번 / 각도 합치기
public class Q_340206 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angle1 = sc.nextInt();
    int angle2 = sc.nextInt();

    int sum_angle = angle1 + angle2;
    System.out.println(sum_angle%360);
  }
}