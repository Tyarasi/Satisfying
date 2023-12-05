<%-- 
    Document   : pemesanan
    Created on : Jan 23, 2021, 12:12:25 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String nama_customer = request.getParameter("nama_customer");
    String id_lapangan = request.getParameter("id_lapangan");
    String tanggal_pesanan = request.getParameter("tanggal_pesanan");
    String alamat_email = request.getParameter("alamat_email");
    String no_telp = request.getParameter("no_telp");
    String nama_lapangan = request.getParameter("nama_lapangan");
    String durasi = request.getParameter("durasi");
    String waktu  = request.getParameter("waktu");
    String keterangan = request.getParameter("keterangan");
    
    
    
    String id_customer = (String) session.getAttribute("id_customer");
    
    
    
      
   
    
    if(nama_customer == null){
        nama_customer = "";
    }
    
    int bayar = 100000;
    int total_durasi = Integer.parseInt(durasi);
    int totalbayar = bayar*total_durasi;
    
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into pesanan(id_customer, Atas_nama, tanggal_pesanan, waktu, durasi, no_telp, lapangan_tujuan, "
            + "keterangan, total_pembayaran) values "
            + "('"+ id_customer + "','"+ nama_customer + "','"+ tanggal_pesanan + "','"+ waktu +"','"+ durasi +"','"+ no_telp +"','"
            + nama_lapangan +"','"+ keterangan +"','"+ totalbayar +"')");
    if (i > 0) { 
        try {   
                String id_customer1 = (String)session.getAttribute("id_customer");
                String host ="jdbc:mysql://localhost:3306/satisfying";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(host, "root", "");
                statement = connection.createStatement();
                String Data = "select * from pesanan where id_customer =" + id_customer;
                rs = statement.executeQuery(Data);
                    if (rs.next()) {
                                            
                        response.sendRedirect("../DetailSatisfying.jsp?id_customer="+rs.getString("id_customer"));                    
                                    }
                    rs.close();;
                    statement.close();
                    connection.close();
                    } catch (SQLException e){
                    out.println("Can't connect to database. with Error = "+e.getMessage());
            }
        
    } else {
        response.sendRedirect("../DetailpesananSatisfying.jsp");
    }
%>