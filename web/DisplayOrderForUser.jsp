<%-- 
    Document   : DisplayOrderForUser
    Created on : Apr 21, 2015, 2:21:39 PM
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
                 <td><h4>Product Id</h4></td>
                 <td><h4>Product Name</h4></td>
                 <td><h4>Product Type</h4></td>
                 <td><h4>Price  </h4></td>
                 <td><h4>Image </h4></td>
                 <td><h4>description </h4></td>
                 <td><h4>Date </h4></td>
                 <td><h4>Quntatiy </h4></td>
                 <td><h4>Edit Order</h4></td>
                 <td><h4>cancel order</h4></td>
             </tr>
        <% Iterator itr=null ;%>
        <% List data = (List) request.getAttribute("chart");
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
             <td><image src="images\<%= itr.next()%>" height="142" width="142" > </td>
             <td><%= itr.next() %></td>
             <td><%= itr.next() %></td>
             <td><%= itr.next() %></td>
             <td> <a href="" >Edit Order</a></td>
             <td> <a href="" >cancel order</a></td>
           <%}%>
        </tr> 
        <td><h4>make another order</h4></td>
        </table>
    </body>
</html>
