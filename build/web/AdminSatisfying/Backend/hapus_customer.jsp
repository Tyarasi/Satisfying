<%-- 
    Document   : hapus_customer
    Created on : Jan 26, 2021, 3:58:59 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            String id_customer = request.getParameter("id_customer");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying", "root", "");
                if(conn != null){
                    if(id_customer != null){
                        Statement st = conn.createStatement();
                        st.executeUpdate("DELETE FROM customer where id_customer = '"+ id_customer + "' ");
                        
                        response.sendRedirect("/Satisfying2/faces/AdminSatisfying/customer.jsp");
                    }
                } else {
                    response.sendRedirect("errorsave.jsp");
                }
            } catch (Exception e){
                out.println("Can't connect to database :"+e.getMessage());
            }
        %>

