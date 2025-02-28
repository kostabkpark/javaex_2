package example;

import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {

    // 두 개의 숫자를 입력 받아서 더해서 출력해주는 프로그램을 while 문과 method 를 이용해서 작성하라.
    // while 문의 종료 조건은 음수 값을 입력하는 경우이다.

    Scanner in = new Scanner(System.in);

    while(true) {
      System.out.print("첫 번째 숫자를 입력하세요.(종료하려면 -1 입력) : ");
      int num1 = in.nextInt();
      if(num1 < 0) {
        break;
      }
      System.out.print("두 번째 숫자를 입력하세요.(종료하려면 -1 입력) : ");
      int num2 = in.nextInt();
      if(num2 < 0) {
        break;
      }
      System.out.printf("%d 과 %d 를 더한 결과는 %d 입니다. \n" ,num1, num2, add(num1, num2));
    } // end of while
  } // end of main method

  static int add(int num1, int num2){
    return num1 + num2;
  } // end of add method
} // end of class
