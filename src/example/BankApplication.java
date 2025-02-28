package example;

import java.util.Scanner;

public class BankApplication {
  public static void main(String[] args) {
    Account[] accounts = new Account[100];
    String header = """
            ----------------------------------------------
            1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
            ----------------------------------------------
            선택> """;
    Scanner in = new Scanner(System.in);
    String input="";
    int menuNo = 0;
    while(true) {
      System.out.print(header);
      input = in.nextLine();
      switch(input){
        case "1" -> accountCreate();
        case "2" -> accountList();
        case "3" -> accountDeposit();
        case "4" -> accountWithdraw();
        case "5" -> finish();
        default -> other();
      }
    }
  } // end of main method

  static void accountCreate(){
    System.out.println("account 생성 처리중");
  }
  static void accountList(){
    System.out.println("account 목록 출력중");
  }
  static void accountDeposit(){
    System.out.println("account 입금 처리중");
  }
  static void accountWithdraw(){
    System.out.println("account 출금 처리중");
  }
  static void finish(){
    System.out.println("프로그램 종료");
  }
  static void other(){}
}   // end of class

//    accounts[0] = new Account("111-111", "홍길동");
//    accounts[0].setBalance(10000);
//
//    accounts[0].deposit(2000);
//    accounts[0].withdraw(11000);
//
//    System.out.println(accounts[0]);


