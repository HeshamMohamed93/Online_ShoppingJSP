
package helper;

import Classes.Users;
import Database.DatabaseConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User {
   String query ;
   Connection conn;
   Statement stmt ;
   ResultSet res ;
  // ResultSet re;
   boolean invalid;
   DatabaseConnection dbconn = new DatabaseConnection();
    List lst = new ArrayList();
    Users x =new Users();

public void AddUser(String Id ,String Name,String Password,String Gender,String Email , int usertype){

try {

    x.setUserId(Id);
    x.setUserName(Name);
    x.setPassword(Password);
    x.setGender(Gender);
    x.setEmail(Email);

    conn = dbconn.getConnection();
    stmt = conn.createStatement();
    query="insert into user values('"+x.getUserId()+"','"+x.getUserName()+"','"+x.getPassword()+"','"+x.getEmail()+"','"+x.getGender()+"' , '"+usertype+"') ";
    dbconn.executeQuery(query, conn);


} catch (SQLException ex) {
    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
}


        }  
public List display(){
try {
    conn = dbconn.getConnection();
    stmt = conn.createStatement();
    query = "select * from user " ;
    res = dbconn.Select(query, conn);
    while (res.next()==true){ 
                lst.add(res.getString("Id"));
                    lst.add(res.getString("UserName"));
                    lst.add(res.getString("Password"));
                    lst.add(res.getString("Gender"));
                    lst.add(res.getString("Email")); 
    } res.close();


} catch (SQLException ex) {
    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
}
return lst;
}
public List getData(int id ){
try {
    conn = dbconn.getConnection();
                stmt = conn.createStatement();
                query = "select * from user where Id ="+id ;
                res = dbconn.Select(query, conn);
                while (res.next()==true){ 
                lst.add(res.getString("Id"));
                lst.add(res.getString("UserName"));
                lst.add(res.getString("Password"));
                lst.add(res.getString("Gender"));
                lst.add(res.getString("Email")); 



                }
            res.close(); 
} catch (SQLException ex) {
    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);

}
return  lst ;
}
public void updateUser( String Id ,String Name,String Password,String Gender,String Email ){
try {
    x.setUserId(Id);
    x.setUserName(Name);
    x.setPassword(Password);
    x.setGender(Gender);
    x.setEmail(Email);

                conn = dbconn.getConnection();
                stmt = conn.createStatement();
                query = "update  user set Id='"+x.getUserId()+"', UserName ='"+x.getUserName()+"',Password ='"+x.getPassword()+"',Gender='"+x.getGender()+"',Email ='"+x.getEmail()+"' where Id = '"+x.getUserId()+"'  " ;
                dbconn.executeQuery(query, conn);
} catch (SQLException ex) {
    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
}

}
public void DeleteUser(int id){
        try {
            conn = dbconn.getConnection();
            stmt = conn.createStatement();
            query = "delete from user where Id="+id  ;
               dbconn.executeQuery(query, conn);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
 }
       
public  Users Authentication(String username , String password , int usertype) throws SQLException {
 // Users x = new Users();
   conn =  dbconn.getConnection(); 
   PreparedStatement prestament = (PreparedStatement) conn.prepareStatement("select * from user where UserName =? and Password = ? and usertyep = ? ");
   prestament.setString(1, username ); 
   prestament.setString(2, password );
   prestament.setInt(3, usertype );
   res =prestament.executeQuery();
if (res!=null){
      while(res.next()){
    x.setUserId(res.getString("Id"));
    x.setUserName(res.getString("UserName"));
    x.setPassword(res.getString("Password"));
    x.setGender(res.getString("Gender"));
    x.setEmail(res.getString("Email"));

               
     return x ;
      }
}else {
 
 return null;
 
 }
return null;

}
    

}
    




