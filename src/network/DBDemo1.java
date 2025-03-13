package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo1 {
    public static void main(String[] args) throws SQLException {
        // 접속하려는 db 정보
        Connection con = makeConnection();
        String sql = "insert into person values ('김연아', '010-444-4444', 'lim@a.com'); ";
                    // "insert into person values ('김연아', '010-555-5555', 'kimya@a.com'); ";

        Statement stmt = con.createStatement();
        int rows = stmt.executeUpdate(sql);
        if(rows == 1) {
            System.out.println("정상적으로 추가되었습니다.");
        } else {
            System.out.println("추가 실패");
        }

        stmt.close();
        con.close();
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
