/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageProduct;


import Classes.Products;
import helper.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateProduct extends HttpServlet {
   Products a = new Products();
   Product helper = new Product(); 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            a.setProductName(request.getParameter("name"));
            a.setDescription(request.getParameter("describtion"));
            a.setPhoto( request.getParameter("pic"));
            a.setPrice(request.getParameter("price"));
            a.setProductId(request.getParameter("Id"));
            a.setProductType(request.getParameter("type")); 
            helper.CreateProduct(a.getProductId(), a.getProductName(), a.getProductType() , a.getPrice(), a.getDescription(), a.getPhoto());
            out.println("ya rab");
        } finally {            
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
