import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class SC extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        PrintWriter pw= res.getWriter();
        String name= req.getParameter("username");
        Cookie c= new Cookie("c1", name);
        res.addCookie(c);


        pw.print("<html><body>");  
        
        pw.print("<form action='httpservlet' method='post'>");
        pw.print("<input type='submit' value='Go ahead..'>");
        pw.print("</form>");
        pw.print("</body></html>");  
    }

}
