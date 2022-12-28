import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;  


public class HS extends HttpServlet{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{

        PrintWriter pw= res.getWriter();
        Cookie ck[]=req.getCookies();  
        pw.print("<html><body>");  
        pw.print("<br>The name of cookie is: "+ck[0].getName()+" ");//printing name and value of cookie  
        pw.print("<br>The value  of cookie is: "+ck[0].getValue()+ "<br>");//printing name and value of cookie  

        pw.print("<h1>My first Http servlet</h1>");  
        pw.print("</body></html>");  
    }
    
}
