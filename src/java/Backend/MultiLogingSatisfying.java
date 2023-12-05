/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Backend.Customer;
import Backend.Control;

/**
 *
 * @author Satisfying
 */
@WebServlet(name = "MultiLogingSatisfying", urlPatterns = {"/MultiLogingSatisfying"})
public class MultiLogingSatisfying extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        PrintWriter out = response.getWriter();
        String proses = request.getParameter("proses");
        
        if (proses.equals("login")) {
            String nama_customer = request.getParameter("nama_customer");
            String password = request.getParameter("password");
            Customer customer = null;
            Customer customer1 = null;
            Customer[] dataCustomer = new Control().getDataUser(nama_customer, password);
            HttpSession session = request.getSession(true);
            
            for (int i=0; i < dataCustomer.length; i++){
                customer = dataCustomer[i];
                session.setAttribute("id_customer", customer.getId_customer());
                session.setAttribute("nama_customer", customer.getNama_customer());
                session.setAttribute("hak_akses", customer.getHak_akses());
                
                if(customer.getHak_akses().equals("Pelanggan")) {
                    response.sendRedirect("HomeSatisfying.jsp");
                }
                if(customer.getHak_akses().equals("Admin")) {
                    response.sendRedirect("../AdminSatisfying/pesanan.jsp");
                }
                
            }
            response.sendRedirect("CekLogin.jsp");
        }
        out.close();
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
