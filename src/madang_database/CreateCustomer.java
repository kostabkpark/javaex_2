package madang_database;

import java.sql.*;
import java.util.Scanner;

public class CreateCustomer {
    public static void main(String[] args) throws SQLException {
        // 고객명, 주소, 전화번호 를 입력받은 후 customer table 에 고객 자료를 추가하시오.
        Connection conn = makeConnection();
        Scanner in = new Scanner(System.in);
        String sql = "insert into customer " +
             "values (?,?,?,?)";
        String sql1 = "select max(custid) from customer";
        int custid = 0;
        System.out.println("고객 정보를 등록하세요 > ");
        System.out.print("고객명 : ");
        String name = in.nextLine();
        System.out.print("주소 : ");
        String address = in.nextLine();
        System.out.print("전화번호 : ");
        String phone = in.nextLine();

        PreparedStatement ps = conn.prepareStatement(sql1);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        custid = resultSet.getInt(1);

        ps = conn.prepareStatement(sql);
        ps.setInt(1,++custid);
        ps.setString(2,name);
        ps.setString(3,address);
        ps.setString(4,phone);

        int rs = ps.executeUpdate();
        if(rs == 1) {
            System.out.println("정상적으로 등록되었습니다.");
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

