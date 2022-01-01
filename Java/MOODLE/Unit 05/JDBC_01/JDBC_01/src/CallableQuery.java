import java.sql.*;

public class CallableQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "000000000000");

            CallableStatement cst=  con.prepareCall("{call ageBelow(?)}");
            int age= 50;

            cst.setInt(1, age);
            ResultSet rs= cst.executeQuery();

            System.out.println("The people below age of 50 are: ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + ":   " + rs.getInt(3));
            }


            cst.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
