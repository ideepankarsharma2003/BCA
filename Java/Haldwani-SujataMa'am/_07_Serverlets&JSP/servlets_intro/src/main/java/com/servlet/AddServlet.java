package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));

        int sum= num1+num2;
        req.setAttribute("sum", sum);
        // res.getWriter().println("The sum is: "+ sum);

        RequestDispatcher rd= req.getRequestDispatcher("sq");
        rd.forward(req, res);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            service(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            service(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
