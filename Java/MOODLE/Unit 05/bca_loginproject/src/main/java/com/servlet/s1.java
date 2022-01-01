package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s1 extends HttpServlet {
    static PrintWriter out;

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) {
        String name= req.getParameter("t1");
        String str= "Hello , Welcome "+ name;
        try{
            out = res.getWriter();
            out.println("<html><body bgcolor=orange><h1>");
            out.println(str);
            out.println("</html></body></h1>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{ out.close();}
    }
}