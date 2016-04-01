<%-- 
    Document   : CreateProduct
    Created on : Apr 17, 2015, 3:26:38 PM
    Author     : Koki Yehia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="CreateProduct">
        <table >
                
             <tr>
                    <td>Product ID:</td>
                    <td><input type="text" name="Id" value="" /></td>
                </tr>
            <tr>
                    <td>Product Name :</td>
                    <td><input type="text" name="name" value="" /></td>
                </tr>
            
            
                <tr>
                    <td>Product Type :</td>
                    <td><input type="text" name="type" value="" /></td>
                </tr>
                <tr>
                    <td>Price :</td>
                    <td><input type="text" name="price" value="" /></td>
                </tr>
                <tr>
                    <td> Upload image:</td>
                    <td><input type="file" name="pic" value="" /></td>
                </tr>
                 <tr>
                    <td>Description :</td>
                    <td><textarea name="describtion" rows="4" cols="20">
                        </textarea> </td>
                </tr>
                <tr>
                   
                    <td><input type="submit" value="Insert" /></td>
                </tr>
          
        </table>
        </form>
    </body>
</html>
