import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/test";
            Connection con= DriverManager.getConnection(url, "root", "000000000000");

            String sql= "DELETE FROM people WHERE FirstName IS NULL OR LastName IS NULL OR Age IS NULL";
            PreparedStatement pst= con.prepareStatement(sql);
            int c=pst.executeUpdate();
            if (c != 0) {
                System.out.println("Null Values Deleted");
            } else {
                System.out.println("Null Values Not Deleted");
            }

            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
