/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageUser;

import Classes.Users;
import helper.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Koki Yehia
 */
public class validation extends HttpServlet {
   Users x =new Users();
            User help=new User();
              String url , Massage;
            boolean IsValid=true;
            int usertype;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            x.setUserId(request.getParameter("UserId"));
            x.setUserName(request.getParameter("UserName"));
            x.setPassword(request.getParameter("Password"));
            x.setGender(request.getParameter("Gender"));
            x.setEmail(request.getParameter("Email"));
            String action = request.getParameter("action");
            if(x.getUserName()==null || x.getUserName().isEmpty()){
              IsValid=false; 
              Massage = "Entar Valid User Name";
             } else if(x.getEmail()==null || x.getEmail().isEmpty()){
                   Massage = "Entar Valid Email";
              IsValid=false; 
             } else if(x.getPassword()==null || x.getPassword().isEmpty()){
                   Massage = "Entar Valid Password";
              IsValid=false; 
             }
              
            
             if(IsValid){
                 if (action.equalsIgnoreCase("Add user")) {
                 usertype = 1 ; 
                 
                 } else {
                 
                 usertype = 0;
                 }
                 
                 
                 request.setAttribute("ValidationUser", x);
                 request.setAttribute("UserType", usertype);
                 url="AddUser";
         }else
             {
     
       request.setAttribute("Massage", Massage);  
                 url="AddUser.jsp";
           
             }
        } finally {  
             RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
