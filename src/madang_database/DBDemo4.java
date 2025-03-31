package madang_database;

import java.sql.*;

public class DBDemo4 {
    public static void main(String[] args) throws SQLException {
        // 전화번호가 있는 고객 정보만 가져와서 출력하기
        Connection conn = makeConnection();
        String sql = "select * from customer where phone is not null";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println(rs);

        while(rs.next()) {
            System.out.print("custid : " + rs.getInt(1) + ", ");
            System.out.print("name : " + rs.getString(2) + ", ");
            System.out.print("address : " + rs.getString(3) + ", ");
            System.out.print("phone : " + rs.getString(4) + "\n");
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
