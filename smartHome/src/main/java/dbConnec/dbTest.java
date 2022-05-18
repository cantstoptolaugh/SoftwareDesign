package dbConnec;

import java.sql.*;

/**
 *
 * @author 이주혁
 */
public class dbTest {

    public Connection con;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/joohyeok2";
    static final String USERNAME = "root";
    static final String PASSWORD = "5118";

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            if (con != null) {
                System.out.println("접속 성공");
            }

        } catch (Exception e) {
            System.out.println("접속 실패");
        }
    }
}
