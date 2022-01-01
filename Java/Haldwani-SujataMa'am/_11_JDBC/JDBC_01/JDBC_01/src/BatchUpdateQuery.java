import java.sql.*;
public class BatchUpdateQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "000000000000");

            String sql1= "INSERT INTO people VALUES('Munna', 'Tripathi', 30)";
            String sql2= "INSERT INTO people VALUES('Tushar', 'Jeena', 25)";
            String sql3= "INSERT INTO people VALUES('Munna', 'Bhaiya', 30)";
            String sql4= "DELETE FROM people WHERE FirstName='Chota'";
            String sql5= "INSERT INTO people VALUES('Karan', 'Jeena', 19)";

            Statement st= con.createStatement();
            st.addBatch(sql1);
            st.addBatch(sql2);
            st.addBatch(sql3);
            st.addBatch(sql4);
            st.addBatch(sql5);

            int[] n= st.executeBatch();
            for (int i : n) {
                if (i>=0) {
                    System.out.println("Query Performed Successfully !!!!");
                } else {
                    
                    System.out.println("Query Not Performed Successfully !!!!");
                }
            }

            st.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
