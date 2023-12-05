<%-- 
    Document   : LoginSatisfying
    Created on : Jan 18, 2021, 8:14:32 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css2/Style.css">
        <title>Login Satisfying</title>
    </head>
    <body style="background-image: url('images2/BackgroundSatisfying.png');">
        <div class="container">
            <center>
        <h1>Selamat Datang</h1>
        <p>Website Booking Lapangan Olahraga Rumbai dan sekitarnya</p>
        <br><br>
        <form method="post" action="MultiLogingSatisfying?proses=login"  onsubmit="validasi()">
                <input type="text" placeholder="username" style="width:250px " name="nama_customer">
        <br>
        <br>
        <input type="password" placeholder="password" style="width:250px" name="password">
            <br>
            <br>
            <button>Login</button>
            <br>
            </center>
        </form>
            
            <p><a href="RegistrasiSatisfying.jsp">Belum terdaftar ? Klik disini</a></p>
            <br>
            <hr>
            <p>Info lebih lanjut</p>
            <a href="https://www.instagram.com/accounts/login/"><img src ="images2/instagram.jpg"  width ="50" height="30"></a>
            <a href="https://twitter.com/login?lang=id"><img src ="images2/twiter.png"  width ="50" height="30"></a>
        </div>
        </div>
    </body>
</html>
