package bank_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Account {
  // 필드 - 계좌번호, 계좌주, 초기입금액
  private int code;
  private Customer customer;
  private String password;
  private String opendate;
  private String closedate;
  private boolean active;
  private int balance;
  // 상수 선언- 0 , 1_000_000
  final int MIN_BALANCE = 0;
  final int MAX_BALANCE = 1_000_000;
  // 접근자(Getter)
  public int getCode() {
    return code;
  }

  public Customer getCustomer() {
    return customer;
  }

  public String getPassword() {
    return password;
  }

  public String getOpendate() {
    return opendate;
  }

  public String getClosedate() {
    return closedate;
  }

  public boolean isActive() {
    return active;
  }

  public int getBalance() {
    return balance;
  }
  // 생성자 - 계좌번호, 계좌주 ,(초기입금)
  public Account(Customer customer, String password, int balance) {
    this.customer = customer;
    this.password = password;
    this.opendate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
    this.balance = balance;
    System.out.println("계좌가 생성되었습니다.");
  }
  // 메서드
  // 입금 기능 추가
  public void deposit(int money) {
    balance += money;
  }
  // 출금 기능 추가
  public void withdraw(int money) {
    // 잔고보다 더 많이 인출할 수 없음
    if(balance < money) {
      System.out.println("잔액 부족");
    } else {
      balance -= money;
      System.out.println("출금이 성공되었습니다.");
    }
  }

  public int inquiry() {
    return balance;
  }

  public void cancelAccount() {
    this.closedate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
  }

  public void setActive() {
    this.active = !this.active;
  }
  // 계좌 정보 출력
  @Override
  public String toString() {
    return code + "\t" +
           customer.getName() + "\t" +
           balance ;
  }
}