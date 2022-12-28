<%@ page errorPage="error.jsp" %>  
<%  
    String username=request.getParameter("username");  
    String password=request.getParameter("password");  
    if (username.equals("deepankar") && password.equals("1234"))
        out.println("Right , Kya haal ....");
    else
        out.println("Wrong , Chal Bhaag ....");

    // using JSP implicit objets 
    /**
        out        ------->     JspWriter
        request    ------->     HttpServletRequest
        response   ------->     HttpServletResponse
        config     ------->     ServletConfig
        application------->     ServletContext
        session    ------->     HttpSession
        pageContext------->     PageContext
        page       ------->     Object
        exception  ------->     Throwable
    * 
    */


%>  