<%@page import="Classes.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Classes.Order"%>


       <form  action="DisplayOrder" >
        <%  ArrayList<Order> lest = ( ArrayList<Order> )request.getSession().getAttribute("Item");
   Users user = (Users) request.getSession().getAttribute("user");
        int i =0 ;

%>

           <h1> Yor Order Items , <%= user.getUserName()  %></h1>
<% for (Order o : lest) { %>

    
<table border="1">
 <tr> 
         <%if (i<lest.size() ) { %>
 <tr> <td> <%= i+1 %> </td>
    <td> <image  src="images\<%= lest.get(i).getPro().getPhoto() %>"  >  </td> 
</tr>
<tr>
    <td>ID </td>
    <td>  <%= lest.get(i).getPro().getProductId()   %></td> 

</tr>
<tr>
    <td>Price </td>
     <td>  <%= lest.get(i).getPro().getPrice() %></td>
     

</tr>
   
   <tr>
    <td>Name </td>
     <td> <%= lest.get(i).getPro().getProductName()  %></td>

</tr>
<tr>
    <td> Date </td>
   
    <td>  <%=lest.get(i).getDate() %></td>
</tr>
<tr>
    <td></td>
   
    <td> <a href ="http://localhost:9999/module/removeitem?i=<%= i+1 %>">Delete Iteme</a></td>
</tr>


    <%i++;}%>
    
</tr>

</table>
<%}%>   
                     

<input type="submit" value="Continue Shopping" /> 

 </form>
<form action="InsertOrder">    
<input type="submit" value="Submit Order and Get Receipt" /> 
</form>
