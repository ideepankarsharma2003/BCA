import java.sql.*;

public class CallableQuery_IN_OUT {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "000000000000");

            CallableStatement cst = con.prepareCall("{call nn(?, ?)}");
            String firstName = "Lucifer";
            firstName= "Deepankar";

            cst.setString(1, firstName);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.execute();

            System.out.println("Surname of "+ firstName+ " is: "+ cst.getString(2));


            cst.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
