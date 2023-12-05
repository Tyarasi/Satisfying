<%-- 
    Document   : edit_pesanan
    Created on : Jan 26, 2021, 5:03:11 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            String id_pesanan = request.getParameter("id_pesanan");
            String Atas_nama = request.getParameter("Atas_nama");
            String tanggal_pesanan = request.getParameter("tanggal_pesanan");
            String no_telp = request.getParameter("no_telp");
                
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying?", "root", "");
                if (conn != null){
                    if (id_pesanan != null){
                        PreparedStatement pst = conn.prepareStatement("update pesanan set id_pesanan = ?, Atas_nama = ?,"
                                + "tanggal_pesanan = ?, no_telp = ? where id_pesanan='"+id_pesanan+"' ");
                        pst.setString(1, id_pesanan);
                        pst.setString(2, Atas_nama);
                        pst.setString(3, tanggal_pesanan);
                        pst.setString(4, no_telp);
                        pst.executeUpdate();
                        response.sendRedirect("/Satisfying2/faces/AdminSatisfying/pesanan.jsp");
                    }
                }else {
                    response.sendRedirect("/Satisfying2/faces/AdminSatisfying/edit_pesanan.jsp");
                }
            }catch (Exception e){
                out.println("Can't connect to database :"+e.getMessage());
            }
        %>
