<%-- 
    Document   : edit_customer
    Created on : Jan 26, 2021, 3:59:08 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            String id_customer = request.getParameter("id_customer");
            String nama_customer = request.getParameter("nama_customer");
            String password = request.getParameter("password");
            String no_telp = request.getParameter("no_telp");
            String alamat_email = request.getParameter("alamat_email");
            String hak_akses = request.getParameter("hak_akses");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying?", "root", "");
                if (conn != null){
                    if (id_customer != null){
                        PreparedStatement pst = conn.prepareStatement("update customer set id_customer = ?, nama_customer = ?,"
                                + "password = ?, no_telp = ?, alamat_email = ?, hak_akses = ? where id_customer='"+id_customer+"' ");
                        pst.setString(1, id_customer);
                        pst.setString(2, nama_customer);
                        pst.setString(3, password);
                        pst.setString(4, no_telp);
                        pst.setString(5, alamat_email);
                        pst.setString(6, hak_akses);
                        pst.executeUpdate();
                        response.sendRedirect("/Satisfying2/faces/AdminSatisfying/customer.jsp");
                    }
                }else {
                    response.sendRedirect("/Satisfying2/faces/AdminSatisfying/edit_customer.jsp");
                }
            }catch (Exception e){
                out.println("Can't connect to database :"+e.getMessage());
            }
        %>
