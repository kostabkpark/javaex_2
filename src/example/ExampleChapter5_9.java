package example;

import java.util.Scanner;

public class ExampleChapter5_9 {
  public static void main(String[] args) {
    // 학생들의 점수를 분석하는 프로그램을 만들려고 합니다. 키보드로부터 학생 수와 각 학생들의
    // 점수를 입력받고 while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 총점 및 평균 점수를
    // 출력하는 코드를 작성해보세요.
    //------------------------------------------------------
    //    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
    //------------------------------------------------------

    String menu = """
        ------------------------------------------------------
            1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        ------------------------------------------------------    
        """;
    Scanner in = new Scanner(System.in);
    String menuItem = "";
    int numOfStudents = 0 ;
    int[] scores = {}; // ""
    int total = 0 ;
    float avg = 0.0f;
    while(true){
      System.out.print(menu);
      System.out.print("선택> ");  //   5
      menuItem = in.nextLine();
      if(menuItem.equals("5")){
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (menuItem.equals("1")) {
        System.out.print("학생수> ");
        numOfStudents = Integer.parseInt(in.nextLine());
        //System.out.println(Arrays.toString(scores));
      } else if (menuItem.equals("2")) {
        scores = new int[numOfStudents];
        for (int i = 0; i < numOfStudents ; i++) {
          System.out.printf("score[%d] : ", i);
          scores[i] = Integer.parseInt(in.nextLine()) ;
        }
      } else if (menuItem.equals("3")) {
        for (int score : scores) {
          System.out.println(score);
        }
      } else if (menuItem.equals("4")) {
        total = 0;
        for (int score : scores) {
          total += score;
        }
        avg = total / (float)numOfStudents;
        System.out.println("전체 학생 점수 합계: " + total);
        System.out.println("평균 점수 : " + avg);
      } else {
        System.out.println("메뉴 번호를 확인하세요.");
      }
    }
  }
}
