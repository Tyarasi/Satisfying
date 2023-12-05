<%-- 
    Document   : hapus_pesanan
    Created on : Jan 26, 2021, 5:02:59 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            String id_pesanan = request.getParameter("id_pesanan");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying", "root", "");
                if(conn != null){
                    if(id_pesanan != null){
                        Statement st = conn.createStatement();
                        st.executeUpdate("DELETE FROM pesanan where id_pesanan = '"+ id_pesanan + "' ");
                        
                        response.sendRedirect("/Satisfying2/faces/AdminSatisfying/pesanan.jsp");
                    }
                } else {
                    response.sendRedirect("errorsave.jsp");
                }
            } catch (Exception e){
                out.println("Can't connect to database :"+e.getMessage());
            }
        %>
