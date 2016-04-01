/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Classes.Order;
import Classes.Products;
import Classes.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fatma
 */
public class addchart extends HttpServlet {
    Order a = new Order();
  
   Products c = null;

    Users user = new Users();
    ArrayList<Order> Lis ;  
    String productId ;
    int userID;
    Date d = new Date();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
       HttpSession session=request.getSession();
            
            user = (Users) request.getSession().getAttribute("user");
            c = new Products();
            c.setProductName(request.getParameter("name"));
            c.setDescription(request.getParameter("describtion"));
            c.setPhoto( request.getParameter("pic"));
            c.setPrice(request.getParameter("price"));
            c.setProductId(request.getParameter("ID"));
            c.setProductType(request.getParameter("type")); 
             
           if (session.getAttribute("Item")==null){
            Lis= new ArrayList<Order>()  ;
            a = new Order();
             a.setPro(c);
            
             a.setDate(d);
             a.setUser(user);  
            Lis.add(a);
            session.setAttribute("Item", Lis);  
            }else {
         
             a = new Order();
            
             a.setPro(c);
             a.setUserId(userID);
             a.setDate(d);
             a.setUser(user);  
            Lis.add(a);
            session.setAttribute("Item", Lis);  
            }
            
                    
            
        } finally {
             RequestDispatcher re = request.getRequestDispatcher("ShowCart.jsp");
             re.forward(request, response);    
          
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
