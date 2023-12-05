<%-- 
    Document   : edit_pesanan
    Created on : Jan 26, 2021, 5:02:01 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Halaman Admin Satisfying </title>
        <!-- BOOTSTRAP STYLES-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- MORRIS CHART STYLES-->
        <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>
    <body>
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="pesanan.jsp">Satisfying</a> 
                </div>
                <div style="color: white;
                     padding: 15px 50px 5px 50px;
                     float: right;
                     font-size: 16px;"><a href="Backend/logout.jsp" class="btn btn-danger square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/find_user.png" class="user-image img-responsive"/>
                        </li>


                        <li>
                            <a href="pesanan.jsp"><i class="glyphicon glyphicon-shopping-cart"></i> Pesanan</a>
                            <a href="customer.jsp"><i class="glyphicon glyphicon-user"></i> Customer</a>
                            <a href="lapangan.jsp"><i class="glyphicon glyphicon-folder-open"></i> Lapangan</a>
                        </li>




                    </ul>

                </div>


            </nav>  
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <h2>Data Pesanan</h2>
                   <%
                        try {
                            String id_pesanan = request.getParameter("id_pesanan");
                            String host = "jdbc:mysql://localhost:3306/satisfying";
                            Connection connection = null;
                            Statement statement = null;
                            ResultSet rs = null;
                            Class.forName("com.mysql.jdbc.Driver");
                            connection = DriverManager.getConnection(host, "root", "");
                            statement = connection.createStatement();
                            String Data = "select * from pesanan where id_pesanan="+id_pesanan;

                            rs = statement.executeQuery(Data);
                    %>
                    <%if (rs.next()) {%>
                    <form method="post" enctype="multipart/form-data" action="Backend/edit_pesanan.jsp?id_pesanan=<%=rs.getString("id_pesanan")%>">
                       
                        <div class="form-group">
                            <label>Atas Nama</label>
                            <input type="text" class="form-control" name="Atas_nama" value="<%=rs.getString("Atas_nama")%>">
                        </div>
                        <div class="form-group">
                            <label>Tanggal Pesanan</label>
                            <input type="date" class="form-control" name="tanggal_pesanan" value="<%=rs.getString("tanggal_pesanan")%>">
                        </div>
                        <div class="form-group">
                            <label>No Handphone</label>
                            <input type="text" class="form-control" name="no_telp" value="<%=rs.getString("no_telp")%>">
                        </div>
                        
                        <button class="btn btn-danger" name="button">Ubah</button>
                        <button class="btn btn-primary" ><a href="pesanan.jsp" style="color:#FFFFFF">Cancel</a></button> 
                       
                    </form>
                        
                        
                    
                    
                    <%}
                rs.close();;
                statement.close();
                connection.close();
                } catch (SQLException e){
                out.println("Can't connect to database. with error"+ e.getMessage());
                }
                %>

                </div>

                <!-- /. PAGE INNER  -->
            </div>
            <!-- /. PAGE WRAPPER  -->
        </div>
        <!-- /. WRAPPER  -->
        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
        <!-- JQUERY SCRIPTS -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- BOOTSTRAP SCRIPTS -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- METISMENU SCRIPTS -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- MORRIS CHART SCRIPTS -->
        <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
        <script src="assets/js/morris/morris.js"></script>
        <!-- CUSTOM SCRIPTS -->
        <script src="assets/js/custom.js"></script>


    </body>
</html>
