import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;  


public class GS extends GenericServlet{

    public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException{

        PrintWriter pw= res.getWriter();
        

        pw.print("<html><body>");  
        pw.print("<h1>My first Generic servlet</h1>");  
        pw.print("</body></html>");  
    }
    
}
