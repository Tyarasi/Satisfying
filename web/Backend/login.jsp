<%-- 
    Document   : login
    Created on : Jan 18, 2021, 8:23:27 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*" %>
 
<%
    String nama_customer = request.getParameter("username");    
    String password= request.getParameter("password");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying","root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from customer where nama_customer='" + nama_customer + "' and password='" + password + "'");
    
     
    
    if (rs.next()){
       
        String id_customer1 = rs.getString("id_customer");
        int id_customer2 = Integer.parseInt(id_customer1);
        if(id_customer2 <= 3){
        session.setAttribute("nama_customer", nama_customer );
        String nama =rs.getString("nama_customer");
        String id_customer=rs.getString("id_customer");
       
        session.setAttribute("id_customer", id_customer);
        session.setAttribute("nama", nama);
         
        response.sendRedirect("../AdminSatisfying/pesanan.jsp"); 
        }else{
        session.setAttribute("nama_customer", nama_customer );
        String nama =rs.getString("nama_customer");
        String id_customer=rs.getString("id_customer");
       
        session.setAttribute("id_customer", id_customer);
        session.setAttribute("nama", nama);
         
        response.sendRedirect("../HomeSatisfying.jsp");
        }
    } else  {
        %>
        
        <%
        
        response.sendRedirect("../CekLogin.jsp");
    }
%>
