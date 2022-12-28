import java.io.*;
import javax.servlet.*;
public class RDinclude extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        PrintWriter pw= res.getWriter();
        pw.print("<html><body>");  
        pw.print("Kya haal chaal?");
        pw.print("</body></html>");  
    }
}
