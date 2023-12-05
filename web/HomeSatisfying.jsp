<%--
    Document   : HomeSatisfying
    Created on : Jan 8, 2021, 8:14:04 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*, java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Satisfying</title>
    </head>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <body>
        <jsp:include page="HeaderSatisfying.jsp" />
        <%--Isi Konten--%>

        <section class="konten">
            <div class="container">
                <div class="row">
                    <div class="col-md-auto">
                        <div class="thumbnail" style="background-image: url('images2/BackgroundSatisfying.png');">
                            <center><h1 style="color: black ">Satisfying</h1></center><br>
                            <%
                            
                                            try {
                                                String host = "jdbc:mysql://localhost:3306/satisfying";
                                                Connection connection = null;
                                                Statement statement = null;
                                                ResultSet rs = null;
                                                Class.forName("com.mysql.jdbc.Driver");
                                                connection = DriverManager.getConnection(host, "root", "");
                                                statement = connection.createStatement();
                                                String Data = "select * from lapangan ";

                                                rs = statement.executeQuery(Data);
                                        %>
                            <div class="row">
                                
                                
                                
                                
                                
                                <div class="col-md-6">
                                    <div class="thumbnail" style="background-color: #8fd19e">
                                        <div class="panel-body  " style="text-align: center; overflow: hidden; padding: 0">
                                            <img style="max-height: 200px;" src="img/Futsal.jpg">
                                        </div>
                                        <%if (rs.next()) {%>
                                        <div class="caption">
                                            <center><h4><a href="AboutLapangan.jsp?id_lapangan=<%=rs.getString("id_lapangan")%>" 
                                                           name="id_lapangan" value="1"><font color="black"><%=rs.getString("nama_lapangan")%></a></h4></center>
                                            <h5>Ini adalah lapangan yang berada di lokasi Rumbai di dekat Kampus PCR
                                                <br>
                                                Informasi Tentang Lapangan: <br>
                                                - <%=rs.getString("jenis_olahraga")%> <br>
                                                - <%=rs.getString("nama_lapangan")%> <br>
                                                <center><a href="PemesananSatisfying.jsp?id_lapangan=<%=rs.getString("id_lapangan")%>" 
                                                           name="id_lapangan" value="1" class="btn btn-primary">Booking Sekarang !</a></center>
                                            </h5>
                                        </div>
                                        <%}%>
                                        <%
                                                rs.close();;
                                                statement.close();
                                                connection.close();
                                            } catch (SQLException e) {
                                                out.println("Can't connect to database. with error" + e.getMessage());
                                            }
                                        %>
                                    </div>
                                </div>            
                            <%
                                            try {
                                                String host = "jdbc:mysql://localhost:3306/satisfying";
                                                Connection connection = null;
                                                Statement statement = null;
                                                ResultSet rs = null;
                                                Class.forName("com.mysql.jdbc.Driver");
                                                connection = DriverManager.getConnection(host, "root", "");
                                                statement = connection.createStatement();
                                                String Data = "select * from lapangan";

                                                rs = statement.executeQuery(Data);
                                        %>

                            <div class="col-md-6">
                                    <div class="thumbnail" style="background-color: #8fd19e">
                                        <div class="panel-body  " style="text-align: center; overflow: hidden; padding: 0">
                                            <img style="max-height: 200px;" src="img/GorWira.jpg">
                                        </div>
                                        <%if (rs.last()) {%>
                                        <div class="caption">
                                            <center><h4><a href="AboutLapangan.jsp?id_lapangan=<%=rs.getString("id_lapangan")%>">
                                                        <font color="black"><%=rs.getString("nama_lapangan")%></a></h4></center>
                                            <h5>Ini adalah lapangan yang berada di lokasi Rumbai di dekat Kampus PCR
                                                <br>
                                                Informasi Tentang Lapangan: <br>
                                                - <%=rs.getString("jenis_olahraga")%> <br>
                                                - <%=rs.getString("nama_lapangan")%> <br>
                                                <center><a href="PemesananSatisfying.jsp?id_lapangan=<%=rs.getString("id_lapangan")%>" 
                                                           class="btn btn-primary">Booking Sekarang !</a></center>
                                            </h5>
                                        </div>
                                        <%}%>
                                        <%
                                                rs.close();;
                                                statement.close();
                                                connection.close();
                                            } catch (SQLException e) {
                                                out.println("Can't connect to database. with error" + e.getMessage());
                                            }
                                        %>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                    </div>  
                </div>
        </section>
                <br>
                <br>
                <br>
        <%--Footer--%>
        <div class="footer" style="background-color: black">
        <jsp:include page="FooterSatisfying.jsp" /> 
    </body>
</html>

