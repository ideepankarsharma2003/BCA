import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * @author deepankar sharma
 *         {@code} https://github.com/ideepankarsharma2003
 */
public class MockServer extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter ab = resp.getWriter();
        String Name = req.getParameter("Name");
        ab.println(" Welcome User " + Name);
        ab.close();
    }
}