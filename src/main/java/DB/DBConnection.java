package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String user = "root";
    private final static String url = "jdbc:mysql://localhost:3306/quanlysinhvien01";
    private final static String password = "root";
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(url, "root", "root");
                return conn;
                
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
              e.printStackTrace();
        }
        return null;
    }
}
