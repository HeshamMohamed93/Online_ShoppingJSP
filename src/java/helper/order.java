/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Classes.Order;
import Classes.Products;
import Classes.Users;
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 

public class order {
String query ;
   Connection conn;
   Statement stmt ;
   ResultSet res ;
   DatabaseConnection dbconn = new DatabaseConnection();
    List lst = new ArrayList();
    Order o = new  Order();
    
    public void insertorder ( Users User , Products Product , Date dateorder , String price){
        try {
            o.setDate(dateorder);
            o.setPro(Product);
            o.setUser(User);
             conn = dbconn.getConnection();
            stmt = conn.createStatement();
query="insert into onlineshopping.`order`  (UserID , ProductID ,Dateoforder, Noatem  , totalprice) values  ('"+o.getUser().getUserId()+"', '"+ o.getPro().getProductId()+"' ,'"+o.getDate()+"','1' ,'"+Integer.parseInt(price)+"')";
    dbconn.executeQuery(query, conn);
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    
   
   
   
}
