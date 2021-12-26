package com.database.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.jdbc.Driver"); // -----> deprecated
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/test";
			String username= "root";
			String password= "000000000000";
			Connection con= DriverManager.getConnection(url, username, password);
			Statement st= con.createStatement();
			
			String sqlQuery= "insert into employee values('Lucifer', 21, 50000)";
			int c= st.executeUpdate(sqlQuery);
			if(c!=0) {
				System.out.println("Data Inserted !!!");
			}else System.out.println("Data not inserted !!!!");
			
			sqlQuery= "insert into employee values('Dean', 34, 100000)";
			c= st.executeUpdate(sqlQuery);
			if(c!=0) {
				System.out.println("Data Inserted !!!");
			}else System.out.println("Data not inserted !!!!");
			
			sqlQuery= "insert into employee values('Oliver', 36, 40000)";
			c= st.executeUpdate(sqlQuery);
			if(c!=0) {
				System.out.println("Data Inserted !!!");
			}else System.out.println("Data not inserted !!!!");
			
			sqlQuery= "insert into employee values('Amenadiel', 39, 54000)";
			c= st.executeUpdate(sqlQuery);
			if(c!=0) {
				System.out.println("Data Inserted !!!");
			}else System.out.println("Data not inserted !!!!");
			
		 }catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
