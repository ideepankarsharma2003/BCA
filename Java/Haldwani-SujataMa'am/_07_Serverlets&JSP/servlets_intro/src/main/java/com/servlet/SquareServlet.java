package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int sum = (int)req.getAttribute("sum"); // attribute from AddServlet

        res.getWriter().println("<html><body bgcolor=cyan><h1>");
        res.getWriter().println("<p>num1 is: "+ num1+ " and it's Square is: "+ (num1*num1)+ "<br></p>");
        res.getWriter().println("<p>num2 is: "+ num2+ " and it's Square is: "+ (num2*num2)+ "<br></p>");
        res.getWriter().println("<p>sum is: "+ sum+ " and it's Square is: "+ (sum*sum)+ "<br></p>");
        res.getWriter().println("</html></body></h1>");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        service(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        service(req, res);
    }
}
