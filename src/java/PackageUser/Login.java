
package PackageUser;

import Classes.Users;
import helper.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    String  username , password ;
    String action ;
    int usertype;
    User a = new User();
    Users user = new Users();
    String URL , Massage ;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session = request.getSession();
           username = request.getParameter("username");
           password = request.getParameter("password");
           action   = request.getParameter("action");
           if (action.equalsIgnoreCase("LoginUser")){
           usertype =0 ;
           
           }else {
             usertype =1 ;
           }
           
     user=  a.Authentication(username, password, usertype);
          
          
          if (user!= null){
              session.setAttribute("UserName", username);
              session.setAttribute("user", user);              
              if (usertype==1 ){
              URL = "pageadmin.jsp";
              }else {
              
              URL = "DisplayOrder";
              }
          
          }  else {
          URL = "Login.jsp";
            Massage = "Entar Valid User Name & Password";
              request.setAttribute("Massage", Massage);  
          }
            
            
        }  catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             RequestDispatcher object = request.getRequestDispatcher(URL);
             object.include(request, response);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
