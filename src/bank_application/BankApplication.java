package bank_application;

import java.sql.*;
import java.util.Scanner;

public class BankApplication {
  static Scanner in = new Scanner(System.in);
  static Connection conn = makeConnection();
  public static void main(String[] args) throws SQLException {
    String header = """
            -----------------------------------------------------------------------
            1.고객 등록 | 2. 계좌생성 | 3.계좌목록 | 4.예금 | 5.출금 | 6.조회 | 0. 종료
            ------------------------------------------------------------------------
            선택> """;

    String input="";
    int menuNo = 0;
    boolean isNotFinished = true;
    while(isNotFinished) {
      System.out.print(header);
      input = in.nextLine();
      switch(input){
        case "1" -> customerCreate();
        case "2" -> accountCreate();
        case "3" -> accountList();
        case "4" -> accountDeposit();
        case "5" -> accountWithdraw();
        case "6" -> inquiry();
        case "0" -> {
          isNotFinished = false;
          finish();
        }
        default -> other();
      }
    }
  } // end of main method

  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/bank?serverTimezone=Asia/Seoul";
    Connection con = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중...");
      con = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
    //System.out.println(con);
    return con;
  }

  private static void inquiry() {
    System.out.println("조회완료");
  }

  private static void customerCreate() throws SQLException {
    System.out.print("고객명을 입력하세요 : ");
    String name = in.nextLine();
    Customer customer = new Customer(name); // custid=0, opendate=오늘
    String sql = "insert into customer (name, opendate) " +
        "values( ? , ? )";
    PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, customer.getName());
    ps.setDate(2,customer.getOpendate());
    ps.executeUpdate();
    ResultSet rs = ps.getGeneratedKeys();
    if(rs.next()) {
      System.out.println(rs.getInt(1));
    }
    //System.out.println("고객 등록 완료");
  }

  static void accountCreate() throws SQLException {
    System.out.println("account 생성 처리중");
    //System.out.print("주민번호 앞 6자리를 입력하세요 > ");         // 입력 --> 고객 정보
//    clientNo = in.nextLine();
//    if (clientNo != null &&
//        clientNo.length() == 6 &&
//        clientNo.chars().allMatch(Character::isDigit)) {
//      client = clientMap.get(clientNo);
//      if (client == null) { // 신규 고객
    System.out.print("고객명을 입력하세요 > ");
    String name = in.nextLine();
    Customer customer = new Customer(name); // custid 추가해주기
    String sql = "insert into customer (name, opendate) values (?,?) ";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, customer.getName());
    ps.setDate(2,customer.getOpendate());
    int i = ps.executeUpdate();
    ResultSet rs = ps.getGeneratedKeys();
    if(rs.next()) {
      customer.setCustid(rs.getInt(1));
      System.out.println(customer);
    }   // 고객 정보 생성 후 데이터베이스에 추가
    else { // 기존 고객

    }
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
  static void other(){
    System.out.println("메뉴 번호를 확인하고 다시 입력해주세요.");
  }






}   // end of class

//    accounts[0] = new Account("111-111", "홍길동");
//    accounts[0].setBalance(10000);
//
//    accounts[0].deposit(2000);
//    accounts[0].withdraw(11000);
//
//    System.out.println(accounts[0]);


