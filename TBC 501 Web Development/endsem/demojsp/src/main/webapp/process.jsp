<%@ page errorPage="error.jsp" %>  
<%  
    String num1=request.getParameter("n1");  
    String num2=request.getParameter("n2");  
    
    int a=Integer.parseInt(num1);  
    int b=Integer.parseInt(num2);  
    int c=a/b;  
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


    out.print("division of numbers is: "+c);    
%>  