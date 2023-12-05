<%-- 
    Document   : RegistrasiSatisfying
    Created on : Jan 19, 2021, 2:58:02 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css2/Style.css">
        <title>Registrasi Satisfying</title>
    </head>
    <body style="background-image: url('images2/BackgroundSatisfying.png');">
        <div class="container">
            <center>
        <h1>Registrasi Account</h1>
        <p>Website Booking Lapangan Olahraga Rumbai dan sekitarnya</p>
        <br><br>
        <form action="Backend/registrasi.jsp" onsubmit="return validasi()">
            <input type="text" placeholder="username" style="width:250px " name="username" id="username">
                <br>
                <input type="password" placeholder="Password" style="width:250px" name="password" id="password">
                <br>
                <input type="email" placeholder="Alamat Email" style="width:250px" name="alamat_email" id="alamat_email">
                <br>
                <input type="text" placeholder="No.Telepon" style="width:250px" name="no_telp" id="no_telp">
                <br><br>
                <button id="submit">Daftarkan Diri Anda !</button>
                <script>
                    function validasi(){
                var username = document.getElementById('username');
                var password = document.getElementById('password');
                var alamat_email = document.getElementById('alamat_email');
                var no_telp = document.getElementById('no_telp');

                if (harusDiisi(username, "Username belum diisi")) {
                    if (harusDiisi(password, "Password belum diisi")) {
                        if (harusDiisi(alamat_email, "Alamat Email Harap diisi")) {
                            if (harusDiisi(no_telp, "No Telepon anda belum diisi")) {
                            return true;
                        };
                    };
                };
            };
                return false;
            }
            

            function harusDiisi(att, msg){
                if (att.value.length == 0) {
                    alert(msg);
                    att.focus();
                    return false;
                }

                return true;
            }
                    </script>
                <br>
                </center>
</form>
            <br>
            <hr>
            <p>Info lebih lanjut</p>
            <img src ="images2/instagram.jpg"  width ="50" height="30">
            <img src ="images2/twiter.png"  width ="50" height="30">
        </div>
        </div>
    </body>
</html>
