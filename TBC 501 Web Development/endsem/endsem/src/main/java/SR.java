import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SR extends HttpServlet{  
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{  
        String name= req.getParameter("username");
        PrintWriter pw= res.getWriter();

        if (name.equals("deepankar")){
                    pw.print("<html><body>");
                    pw.print("Aur deepankar bhai !!");
                    pw.print("</body></html>");  
            res.sendRedirect("RDinclude");
        }
        else{
            res.sendRedirect("RDforward");
        }
    }
}  