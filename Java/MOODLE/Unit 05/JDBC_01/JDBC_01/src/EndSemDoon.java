import java.sql.*;
import java.util.Scanner;

public class EndSemDoon {
    static Scanner sc = new Scanner(System.in);
    static int id;
    static String vechicle_name;
    static double price;

    static public void setValues() {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter Vechicle name: ");
        vechicle_name = sc.next();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    public static void main(String[] args) {
        int n;
        System.err.print("Enter the value of n: ");
        n=sc.nextInt();

        try {
            /**
             * Step 2: Load and Register the Driver
             */
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/futureautodehradun";
            String username = "root";
            String password = "000000000000";

            /**
             * Step 3: Establish the Connection
             */
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "insert into automobile values(?, ?, ?)";
            
            /**
             * Step 4: Create Statement
             */
            PreparedStatement pst = con.prepareStatement(sql);

            for (int i = 0; i < n; i++) {
                setValues();

                pst.setInt(1, id);
                pst.setString(2, vechicle_name);
                pst.setDouble(3, price);

                /**
                 * Step 5: Execute Statement
                 */
                int c = pst.executeUpdate();

                /**
                 * Step 6: Process Results
                 */
                if (c != 0) {
                    System.out.println("Data Inserted");
                } else {
                    System.out.println("Data Not Inserted");
                }
            }
            

            /**
             * Step 7: Close Connection
             */
            pst.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
