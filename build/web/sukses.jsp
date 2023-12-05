<%-- 
    Document   : sukses
    Created on : Jan 11, 2021, 7:53:37 PM
    Author     : Acer
--%>

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String id_customer = request.getParameter("id_customer");
      String nama_customer = request.getParameter("nama_customer");
        String password = request.getParameter("password");
       
                String no_telp = request.getParameter("no_telp");
                 String host = "jdbc:mysql://localhost:3306/satisfying";
              try{
                   Class.forName("com.mysql.jdbc.Driver");
           Connection  conn = DriverManager.getConnection(host,"root","");
           if(conn != null){
               if(id_customer != null){
                   PreparedStatement pst = conn.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
              pst.setString(1,id_customer);
              pst.setString(2,nama_customer);
              pst.setString(3,password);
              
              pst.setString(4,no_telp);
              pst.executeUpdate();
              
              response.sendRedirect("input_kurikulum.jsp");
 }
           }else{
               response.sendRedirect("gagalSimpanKurikulum.jsp");
           }
              }catch(SQLException ex){
                  out.println("Gagal Koneksi");
              }
             catch(Exception ex){
                    out.println(ex.getMessage());
             }
%>