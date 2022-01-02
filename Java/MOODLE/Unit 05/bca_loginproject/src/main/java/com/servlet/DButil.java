package com.servlet;

import java.sql.*;

public class DButil {
    static Connection con= null;
    static PreparedStatement pst= null;
    static ResultSet rs= null;

    public static Connection getConnection(){
        
        try {
            String url= "jdbc:mysql//localhost:3306/bca";
            String user= "root";
            String pass= "000000000000";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }


    public static ResultSet getData(){
        con= getConnection();
        String sql= "SELECT* FROM user";
        try {
            pst= con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public static int addData(UserBean b){
        int i=0;
        con=getConnection();
        String sql= "INSERT INTO user VALUES(?, ?, ?, ?)";
        try {
            pst= con.prepareStatement(sql);
            pst.setString(1, b.getName());
            pst.setString(2, b.getPassword());
            pst.setInt(3, b.getAge());
            pst.setString(4, b.getPhone());
            i= pst.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return i;
    }
}
