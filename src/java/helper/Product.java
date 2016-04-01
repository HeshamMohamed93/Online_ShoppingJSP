/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Classes.Products;
import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Koki Yehia
 */
public class Product {
   String query ;
   Connection conn;
   Statement stmt ;
   ResultSet res ;
   DatabaseConnection dbconn = new DatabaseConnection();
    List lst = new ArrayList();
    Products a = new Products();
    
    public void CreateProduct(  String Id,String name , String type ,String price ,String describtion ,String photo ){
        try {
            a.setProductName(name);
            a.setDescription(describtion);
            a.setPhoto(photo );
            a.setPrice(price);
            a.setProductId(Id);
            a.setProductType(type);
            
            
                    conn = dbconn.getConnection();
                    stmt = conn.createStatement();
                    query = "insert into product values('"+a.getProductId()+"','"+a.getProductName()+"','"+a.getProductType()+"','"+a.getPrice()+"' ,'"+a.getPhoto()+"' , '"+a.getDescription()+"')" ;
                    dbconn.executeQuery(query, conn)  ;
                     
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }
  
public List display(){
        try {
            conn = dbconn.getConnection();
                       stmt = conn.createStatement();
                       query = "select * from product " ;
                       res = dbconn.Select(query, conn);
                       while (res.next()==true){ 
                    lst.add(res.getString("Photo")); 
                           lst.add(res.getString("ProductId"));
                         lst.add(res.getString("ProductName"));
                          lst.add(res.getString("ProductType"));
                           lst.add(res.getString("Description")); 
                          lst.add(res.getString("Price"));
                            
                            
                           
                  
                      }
                    res.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        
        }
return  lst ;
 }

public List getData(int id ){
        try {
            conn = dbconn.getConnection();
                       stmt = conn.createStatement();
                       query = "select * from product where ProductId ="+id ;
                       res = dbconn.Select(query, conn);
                       while (res.next()==true){ 
                        lst.add(res.getString("ProductId"));
                         lst.add(res.getString("ProductName"));
                          lst.add(res.getString("ProductType"));
                           lst.add(res.getString("Price"));
                            lst.add(res.getString("Photo")); 
                            
                            lst.add(res.getString("Description"));
                  
                      }
                    res.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        
        }
return  lst ;
 }

public void updateProduct( String Id,String name , String type ,String price ,String describtion ,String photo ){
        try {
                     a.setProductName(name);
                     a.setDescription(describtion);
                     a.setPhoto(photo );
                     a.setPrice(price);
                     a.setProductId(Id);
                     a.setProductType(type);
                     conn = dbconn.getConnection();
                     stmt = conn.createStatement();
                     query = "update  product set ProductId='"+a.getProductId()+"', ProductName ='"+a.getProductName()+"',ProductType ='"+a.getProductType()+"',Price='"+a.getPrice()+"',photo ='"+a.getPhoto()+"' ,Description ='"+a.getDescription()+"'where ProductId = '"+a.getProductId()+"'  " ;
                     dbconn.executeQuery(query, conn);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

}

public void DeleteProduct(int id){
        try {
            conn = dbconn.getConnection();
                     stmt = conn.createStatement();
                      query = "delete from product where ProductId="+id  ;
               dbconn.executeQuery(query, conn);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }


}


}



