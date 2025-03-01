package lv2;

import java.util.Stack;

public class Q_12909 {
  boolean solution(String s) {

    char[] chars = s.toCharArray();
    Stack<Integer> stack = new Stack<>();

    for (char ch : chars) {
      if(ch == '(') {
        stack.push(0);
        continue;
      }

      if(stack.isEmpty() || stack.peek() != 0 ) {
        return false;
      }
      stack.pop();

    }
    return stack.isEmpty();

  }

  public static void main(String[] args) {

  Q_12909 solution = new Q_12909();

  boolean a = solution.solution("((()())");

    System.out.println(a);

  }
}
