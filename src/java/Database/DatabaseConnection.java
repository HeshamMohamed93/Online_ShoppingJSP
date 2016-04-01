
package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
        private  Connection conn;
        private  ResultSet res;
        private   Statement stmt ;
        public  Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineShopping","root","1234");
           
               
               
          
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
          return conn;
         }
    
    public ResultSet Select(String sql , Connection conn){
        this.conn = conn;
    try {
      stmt = conn.createStatement();
      res = stmt.executeQuery(sql);
    }catch(Exception ex ){
    
    }
    return  res ;
    }
       
      public ResultSet executeQuery(String sql , Connection conn){
            try {
                this.conn = conn;
                
                stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                
               
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
       return  res ;
      }
    
  
    
    
    
}
