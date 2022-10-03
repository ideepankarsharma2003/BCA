package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int t1 = Integer.parseInt(req.getParameter("t1"));
        int t2 = Integer.parseInt(req.getParameter("t2"));
        int sum = t1 + t2;
        PrintWriter out = res.getWriter();
        out.println(sum);
        out.close();
    }
}