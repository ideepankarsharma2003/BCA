<%@page import= "com.servlet.UserBean" %>
<%@page import= "com.servlet.DButil" %>
<%@page import= "java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%! UserBean u= null; ResultSet rs= null; %>
    <%
        RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
        String id= request.getParameter("t1");
        String psw= request.getParameter("t2");
        rs= DButil.getData();

        boolean status= false;
        while(rs.next()){
            if( id.equals(rs.getString(1) && psw.equals(rs.getString(2)))  ){
                status= true;
            }
        }
        if(status){
            rd.forward(request, response);
        }else{
            out.println("Invalid user-id and password !!!");
        }

    %>
</body>
</html>