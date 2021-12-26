import java.sql.*;
public class DemoClass {
    public static void main(String[] args) throws Exception {
        String url= "jdbc:mysql://localhost:3306//test";
        String user= "root";
        String password= "000000000000";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, user, password);
    }
}
