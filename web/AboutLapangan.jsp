<%-- 
    Document   : AboutSatisfying
    Created on : Jan 8, 2021, 10:15:48 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Lapangan</title>
    </head>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <body>
        <jsp:include page="HeaderSatisfying.jsp" />
        <h1></h1>
        <%
    
    String id_lapangan = request.getParameter("id_lapangan");
        int id_lapangan1 = Integer.parseInt(id_lapangan);
            if (id_lapangan1 == 1 ) {  
        %>
        <section class="konten">
            <div class="container">
                <div class="row" style="background-image: url('images2/BackgroundSatisfying.png');">
                     <center><h1 style="color: black ">Planet Futsal</h1></center><br>
                     <center> <h3> KEGIATAN LAPANGAN PLANET FUTSAL </h3></center>
                     <center> <img src="images2/kegiatan1.jpg">
                         <img src="images2/kegiatan2.jpg">  <br> <br>
                          <img src="images2/kegiatan3.jpg">
                          <img src="images2/kegiatan4.jpg"> </center> <br>
                </div>
                
            </div>
        </section>
        <%}else if (id_lapangan1 == 2){
                    
            %>
            <section class="konten">
            <div class="container">
                <div class="row" style="background-image: url('images2/BackgroundSatisfying.png');">
                     <center><h1 style="color: black ">Gor Wira</h1></center><br>
                     <center> <h3> KEGIATAN BULU TANGKIS GOR WIRA </h3></center>
                     <center> <img src="images2/gor1.jpg">
                         <img src="images2/gor2.jpg">  <br> <br>
                          <img src="images2/gor3.jpg">
                          <img src="images2/gor4.jpg"> </center> <br>
                </div>
            </div>
            </section>
            <%}%>

        <%--Footer--%>
        <jsp:include page="FooterSatisfying.jsp" />
    </body>
</html>
