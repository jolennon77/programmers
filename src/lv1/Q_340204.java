package lv1;

import java.util.Scanner;

//[PCCE 기출문제] 4번 / 병과분류
public class Q_340204 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String code = sc.next();
      String lastFourWords = code.substring(code.length()-4, code.length());

      if(lastFourWords.equals(
          "_eye"
      )){
        System.out.println("Ophthalmologyc");
      }
      else if(
          lastFourWords.equals("head")
      ){
        System.out.println("Neurosurgery");
      }
      else if(
          lastFourWords.equals("infl")
      ){
        System.out.println("Orthopedics");
      }

      else if(lastFourWords.equals("skin"))
      {
        System.out.println("Dermatology");
      }

      else
      {
        System.out.println("direct recommendation");
      }
    }
}
