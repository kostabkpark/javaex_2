package network;

import java.sql.*;

public class DBDemo2 {
    public static void main(String[] args) throws SQLException {
        // 접속하려는 db 정보
        Connection con = makeConnection();
        String sql = "update person set email =?   where phone =?  and name =? ;";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, "aaa");
        pstmt.setObject(2, "010-444-4444");
        pstmt.setObject(3, "임꺽정");

        int rows = pstmt.executeUpdate();
        if(rows == 1) {
            System.out.println("정상적으로 수정되었습니다.");
        } else {
            System.out.println("수정 실패");
        }

        if (pstmt != null) {
            pstmt.close();
        }
        if(con != null) {
            con.close();
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
