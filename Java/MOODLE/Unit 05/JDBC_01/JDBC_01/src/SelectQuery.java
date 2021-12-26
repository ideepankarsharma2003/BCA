import java.sql.*;
public class SelectQuery {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "000000000000";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();

            String sqlQuery = "select* from people";

            ResultSet rs = st.executeQuery(sqlQuery);
            // System.out.println(rs.getString(1)+" "+ rs.getString(2)+ " "+
            // rs.getString(3)); // -----> not the actual data !!!!
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + ":   " + rs.getInt(3));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
