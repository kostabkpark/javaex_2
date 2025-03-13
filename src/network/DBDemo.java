package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDemo {
    public static void main(String[] args) {
        // 접속하려는 db 정보
        String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("데이터베이스 연결 중...");
            DriverManager.getConnection(url, "root", "1111");
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다.");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
        }

    }
}
