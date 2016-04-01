<%-- 
    Document   : updateUser
    Created on : Apr 18, 2015, 7:06:08 PM
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
        <form action="updateUserInDatabase">
        <table align ="center" border="1px" width="80%" >
            <tr>
             <% Iterator itr=null ;%>
        <% List data = (List) request.getAttribute("EditData");
       for (itr = data.iterator(); itr.hasNext(); ){
         %>
         <tr> 
             <% String s =null;
             s= (String) itr.next();%>
                    <td>User ID :</td>
                    <td><input type="text" name="UserId" value="<%=s%>" /></td>
            </tr>
             <td>UserName :</td>
             <td><input type="text" name="UserName" value="<%= itr.next() %>" /></td> 
            <tr>
                    <td>Password :</td>
                    <td><input type="text" name="Password" value="<%= itr.next() %>" /></td>
            </tr>
             <tr>
                    <td>Gender :</td>
                    <td><input type="text" name="Gender" value="<%= itr.next() %>"  /><br>
                    </td>
            </tr>
             <tr>
                    <td>Email</td>
                    <td><input type="text" name="Email" value="<%= itr.next() %>" /></td>
            </tr>
             
            
                    <%}%>
                
                
            </tr>
            
            <tr> 
                <td></td>
                <td> <input type="submit" value="Update" />  </td>
            </tr>
            
            
        </table>
        
        
        </form>
    </body>
</html>
