package network;

import java.sql.*;

public class DBDemo3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = makeConnection();
        String sql = "select * from person";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println(rs);

        while(rs.next()) {
            System.out.print("name : " + rs.getString(1) + ", ");
            System.out.print("phone : " + rs.getString("phone") + ", ");
            System.out.print("email : " + rs.getString(3) + '\n');
        }

    }


    private static Connection makeConnection() {
        String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
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
