<%-- 
    Document   : updateProduct
    Created on : Apr 17, 2015, 4:53:11 PM
    Author     : Koki Yehia
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
      <form action="updateProductInDatabase">
        <table align ="center" border="1px" width="80%" >
            <tr>
             <% Iterator itr=null ;%>
        <% List data = (List) request.getAttribute("Editdata");
       for (itr = data.iterator(); itr.hasNext(); ){
         %>
         <tr> 
             <% String s =null;
             s= (String) itr.next();%>
                    <td>ID</td>
                    <td><input type="text" name="ID" value="<%=s%>" /></td>
            </tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="<%= itr.next() %>" /></td> 
            <tr>
                    <td>Type</td>
                    <td><input type="text" name="type" value="<%= itr.next() %>" /></td>
            </tr>
             <tr>
                    <td>Pirc</td>
                    <td><input type="text" name="price" value="<%= itr.next() %>" /></td>
            </tr>
             <tr>
                    <td>photo</td>
                    <td><input type="file" name="pic"  />
                     <input type="text" name="pic" value="<%= itr.next() %>" />
                    </td>
                   
            </tr>
             <tr>
                    <td>discribtion</td>
                    <td><textarea  name="describtion" rows="4" cols="20" value="" placeholder ="">
                         <%= itr.next()%>
                        </textarea>
                    </td>
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
