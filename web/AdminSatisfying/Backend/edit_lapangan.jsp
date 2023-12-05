<%-- 
    Document   : edit_lapangan
    Created on : Jan 26, 2021, 5:00:21 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            String id_lapangan = request.getParameter("id_lapangan");
            String nama_lapangan = request.getParameter("nama_lapangan");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying?", "root", "");
                if (conn != null){
                    if (id_lapangan != null){
                        PreparedStatement pst = conn.prepareStatement("update lapangan set id_lapangan = ?, nama_lapangan = ?"
                                + "where id_lapangan='"+id_lapangan+"' ");
                        pst.setString(1, id_lapangan);
                        pst.setString(2, nama_lapangan);
                        pst.executeUpdate();
                        response.sendRedirect("/Satisfying2/faces/AdminSatisfying/lapangan.jsp");
                    }
                }else {
                    response.sendRedirect("/Satisfying2/faces/AdminSatisfying/edit_lapangan.jsp");
                }
            }catch (Exception e){
                out.println("Can't connect to database :"+e.getMessage());
            }
        %>
