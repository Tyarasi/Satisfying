<%-- 
    Document   : HeaderSatisfying
    Created on : Jan 18, 2021, 9:52:13 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Satisfying</title>
    </head>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <body>
        <nav class="navbar navbar-inverse" style="background-color: black">
            <div class="container">
                <div class="logo">

                </div>
                <ul class="nav navbar-nav">
                    <li><a href="HomeSatisfying.jsp">Home</a></li>
                    <li><a href="TutorialSatisfying.jsp">Tutorial Pemesanan</a></li>
                    <li><a href="AboutSatisfying.jsp">About Us</a></li>
                    <%
   if ((session.getAttribute("nama_customer") == null) || (session.getAttribute("nama_customer") == "")) {
       %>
                    
                   <%}else{%>
                   <li><a href="Backend/logout.jsp" onclick="logout()">Logout</a></li>
                   <script>
                                    function logout(){
                                    var logout = confirm("Yakin ingin keluar ?");
                                    }
                    </script>
                    <%}%>
                </ul>
            </div>
        </nav>
    </body>
</html>

