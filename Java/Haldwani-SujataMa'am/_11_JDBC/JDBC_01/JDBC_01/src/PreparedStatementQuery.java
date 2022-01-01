/**
 * Step 1: Import the packages
 */
import java.sql.*;
import java.util.Scanner;
public class PreparedStatementQuery {
    static Scanner sc= new Scanner(System.in);
    static String firstName;
    static String lastName;
    static int age;

    static public void setValues(){
        System.out.print("Enter First Name: ");
        firstName= sc.next();
        System.out.print("Enter Second Name: ");
        lastName= sc.next();
        System.out.print("Enter Age: ");
        age= sc.nextInt();
    }


    public static void main(String[] args) {
        try {
            /**
             * Step 2: Load and Register the Driver
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            

            String url= "jdbc:mysql://localhost:3306/test";
            String username= "root";
            String password= "000000000000";
            
            /**
             * Step 3: Establish the Connection
             */
            Connection con= DriverManager.getConnection(url, username, password);

            String sql="insert into people values(?, ?, ?)";
            setValues();

            /**
             * Step 4: Create Statement
             */
            PreparedStatement pst= con.prepareStatement(sql);

            pst.setString(1, firstName); // set firstName in place of first '?'
            pst.setString(2, lastName); // set lastName in place of second '?'
            pst.setInt(3, age); // set age in place of third '?'

            /**
             * Step 5: Execute Statement
             */
            int c= pst.executeUpdate();
            
            /**
             * Step 6: Process Results
             */
            if (c!=0) {
                System.out.println("Data Inserted"); 
            } else {
                System.out.println("Data Not Inserted"); 
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
