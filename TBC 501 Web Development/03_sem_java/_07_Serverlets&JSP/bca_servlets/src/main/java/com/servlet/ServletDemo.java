package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet{
    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out= res.getWriter();
        try {
            out.println("<html>");
            out.println("<h1>Hello Detective !!!</h1>");
            out.println("<h2>Entered name is: "+ req.getParameter("user")+ "</h2>");
            out.println("<h2>This is Deepankar's Servlet </h2>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            out.close();
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        processRequest(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        processRequest(req, res);
    }
    
}
