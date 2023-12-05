<%-- 
    Document   : registrasi
    Created on : Jan 19, 2021, 3:08:07 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nama_customer = request.getParameter("username");
    String password = request.getParameter("password");
    String no_telp = request.getParameter("no_telp");
    String alamat_email = request.getParameter("alamat_email");
    String hak_akses = "Pelanggan";
    
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into customer(nama_customer, password, no_telp, alamat_email, hak_akses) values "
            + "('" + nama_customer + "','"+ password + "','"+ no_telp +"','"+ alamat_email +"','"+ hak_akses +"')");
    
    String cek = Integer.toString(i);
    if (cek != null || cek != "" ) {
        
        response.sendRedirect("../LoginSatisfying.jsp");
        
    } else {
        response.sendRedirect("../RegistrasiSatisfying.jsp");
    }
%>
