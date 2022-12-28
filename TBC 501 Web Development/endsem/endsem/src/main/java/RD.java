import java.io.*;
import javax.servlet.*;
public class RD extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        String name= req.getParameter("username");
        PrintWriter pw= res.getWriter();

        if (name.equals("deepankar")){
                    pw.print("<html><body>");  
                    
                    pw.print("Aur deepankar bhai !!");
                    pw.print("</body></html>");  
            RequestDispatcher rd= req.getRequestDispatcher("RDinclude");
            rd.include(req, res);
        }
        else{
            RequestDispatcher rd= req.getRequestDispatcher("RDforward");
            rd.forward(req, res);
        }
        
        
        
    }
}
