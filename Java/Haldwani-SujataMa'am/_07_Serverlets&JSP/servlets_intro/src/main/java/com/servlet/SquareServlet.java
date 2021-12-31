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

        res.getWriter().println("num1 is: "+ num1+ " and it's Square is: "+ (num1*num1));
        res.getWriter().println("num2 is: "+ num2+ " and it's Square is: "+ (num2*num2));
        res.getWriter().println("sum is: "+ sum+ " and it's Square is: "+ (sum*sum));
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
