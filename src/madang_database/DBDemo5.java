package madang_database;

import java.sql.*;
import java.util.Scanner;

public class DBDemo5 {
    public static void main(String[] args) throws SQLException {
        // 책의 판매가격이 20000 원 이상인 주문내역을 출력하되,
        // 고객명과 책목록(도서 이름, 출판사, 가격) , 주문일자, 판매가
        Connection conn = makeConnection();
        Scanner in = new Scanner(System.in);
        String sql = "select name, bookname, publisher, price, orderdate, saleprice " +
            "from orders o join customer c join book b " +
            "on o.custid = c.custid and o.bookid = b.bookid " +
            "where saleprice >= ?";

        System.out.print("주문내역을 조회하려 합니다. 책 가격이 얼마 이상인 주문만 보시겠습니까 : ");
        int saleprice = in.nextInt();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,saleprice);

        ResultSet rs = ps.executeQuery();

        System.out.println(rs);

        //"select name, bookname, publisher, price, orderdate, saleprice " +
        while(rs.next()) {
            System.out.print("name : " + rs.getString(1) + ", ");
            System.out.print("bookname : " + rs.getString(2) + ", ");
            System.out.print("publisher : " + rs.getString(3) + ", ");
            System.out.print("price : " + rs.getInt(4) + ", ");
            System.out.print("orderdate : " + rs.getDate(5) + ", ");
            System.out.println("saleprice: " + rs.getInt(6));
        }
    }


    private static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
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


}
