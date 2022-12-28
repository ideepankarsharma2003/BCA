import java.io.*;
import javax.servlet.*;
public class RDforward extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        PrintWriter pw= res.getWriter();
        pw.print("<html><body>");  
        
        pw.print("Chal Bhag ....");
        pw.print("</body></html>");  
    }
}
