import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

/**
 * @author deepankar sharma
 *         {@code} https://github.com/ideepankarsharma2003
 */

public class DemoServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");// setting the content type
        PrintWriter pw = res.getWriter();// get the stream to write the data
        // writing html in the stream
        pw.println("<html><body>");
        pw.println("<h1>Welcome to servlet</h1>");
        pw.println("</body></html>");
        pw.close();// closing the stream
    }
}
