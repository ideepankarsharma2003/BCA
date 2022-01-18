package com.preet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactTest extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) {
        int num = Integer.parseInt(req.getParameter("n"));
        int n= num;
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        PrintWriter out;
        try {
            out = res.getWriter();
            out.println("<html><body bgcolor='yellow'><h1>");
            out.println("Factorial of a number "+ num + " is: " + f);
            out.println("</html></body></h1>");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
