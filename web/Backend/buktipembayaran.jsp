<%-- 
    Document   : buktipembayaran
    Created on : Jan 26, 2021, 1:50:18 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%
    String bukti_pembayaran = request.getParameter("alamat_email");
    String id_customer = (String) session.getAttribute("id_customer");
    
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into bukti_pembayaran(id_customer ,bukti_pembayaran ) values "
            + "('" + id_customer +"','"+ bukti_pembayaran + "')");
    
    String cek = Integer.toString(i);
    if (cek != null || cek != "" ) {
        
        response.sendRedirect("../DetailSatisfiyng.jsp");
        
    } else {
        
    }
%>
</html>
