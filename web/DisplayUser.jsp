<%-- 
    Document   : DisplayUser
    Created on : Apr 18, 2015, 1:27:25 AM
    Author     : fatma
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align ="center" border="1px" width="80%" >
 
                  <tr>
                  <td><h4>User ID </h4></td>
                 <td><h4> UserName </h4></td>
                 <td><h4>Password </h4></td>
                  <td><h4>Gender</h4></td>
                 <td><h4>Email</h4></td>
                
                 <td><h4>Edit</h4></td>
                 <td><h4>Delete </h4></td>
             </tr>
        <% Iterator itr=null ;%>
        <% List data = (List) request.getAttribute("UserData");
       for (itr = data.iterator(); itr.hasNext(); ){
         %>
         <tr> 
             <% String s =null;
             s= (String) itr.next();%>
             <td><%=s%></td>
             <td><%= itr.next() %></td>
             <td><%= itr.next() %></td>
             <td><%= itr.next() %></td>
             <td><%= itr.next() %></td>
             
             <td> <a href="http://localhost:8080/module/EditUser?Id=<%=s%>" >Update</a></td>
             <td> <a href="http://localhost:8080/module/DeleteUser?Id=<%=s%>" >Delete</a></td>
           <%}%>
        </tr>   
        </table>
    </body>
</html>
