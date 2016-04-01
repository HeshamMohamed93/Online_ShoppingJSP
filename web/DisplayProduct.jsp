

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
                 <td><h4>Image</h4></td>
                 <td><h4>ID </h4></td>
                 <td><h4>Product Name </h4></td>
                 <td><h4>Product type </h4></td>             
                 <td><h4>description </h4></td>
                 <td><h4>Price</h4></td>             
                 <td><h4>Edit</h4></td>
                 <td><h4>Delete </h4></td>
             </tr>
        <% Iterator itr=null ;%>
        <% List data = (List) request.getAttribute("ProData");
       for (itr = data.iterator(); itr.hasNext(); ){
         %>
         <tr> 
                <td><image src="images\<%= itr.next()%>" height="142" width="142" > </td>
         
             <% String s =null;
             s= (String) itr.next();%>
              <td><%=s%></td>
              <td><%= itr.next() %></td>
              <td><%= itr.next() %></td>
              <td><%= itr.next() %></td> 
              <td><%= itr.next() %></td>
             <td> <a href="http://localhost:8080/module/EditeProduct?Id=<%=s%>" >Update</a></td>
             <td> <a href="http://localhost:8080/module/DeleteProduct?Id=<%=s%>" >Delete</a></td>
           <%}%>
        </tr>   
        </table>
     
        
    </body>
</html>
