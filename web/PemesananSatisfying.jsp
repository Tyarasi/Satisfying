<%-- 
    Document   : PemesananSatisfying
    Created on : Jan 8, 2021, 10:09:12 PM
    Author     : Satisfying
--%>

<%@page import="java.sql.*" %>
<%@page language="java"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
   if ((session.getAttribute("nama_customer") == null) || (session.getAttribute("nama_customer") == "")) {

response.sendRedirect("BelanjaDahulu.jsp");%>
    <%}else{%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pemesanan Satisfying</title>
    </head>
    
    <link rel="stylesheet" href="css/bootstrap.css" />
    <body>
        <jsp:include page="HeaderSatisfying.jsp" />
        <section class="konten">
            <div class="container">
                <center><h1 style="color: black ">Silahkan isi data Terlebih dahulu</h1></center><br>
                <div class="row">
                    <div class="col-lg-offset">
                        <div class="thumbnail">
                            <%
                                    try {   
                                        String id_lapangan = request.getParameter("id_lapangan");
                                        String nama_lapangan = request.getParameter("nama_lapangan");
                                        String host ="jdbc:mysql://localhost:3306/satisfying";
                                        Connection connection = null;
                                        Statement statement = null;
                                        ResultSet rs = null;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        connection = DriverManager.getConnection(host, "root", "");
                                        statement = connection.createStatement();
                                        String Data = "select * from lapangan where id_lapangan =" + id_lapangan;
                                            
                                        rs = statement.executeQuery(Data);
                                        
                                %>
                            <form action="Backend/pemesanan.jsp" onsubmit="return validasi()">
                                
                                <div class="mb-3">
                                    <label for="nama_customer" class="form-label">Atas Nama</label>
                                    <input type="text" class="form-control" id="nama_customer" placeholder="Ex:Budi Santoso" name="nama_customer" >
                                </div>
                                <div class="mb-3">
                                    <label for="tanggal_pesanan" class="form-label">Tanggal Booking</label>
                                    <input type="date" class="form-control" id="tanggal_pesanan" name="tanggal_pesanan">
                                </div>
                                <div class="mb-3">
                                    <label for="alamat_email" class="form-label">Alamat Email</label>
                                    <input type="email" class="form-control" id="alamat_email" placeholder="Ex:Budisantoso@gmail.com" name="alamat_email">
                                </div>
                                <div class="mb-3">
                                    <label for="no_telp" class="form-label">No Handphone</label>
                                    <input type="number" class="form-control" id="no_telp" placeholder="Kontak yang bisa dihubungi" name="no_telp">
                                </div>
                                
                                <%while (rs.next()) {%>
                                <div class="mb-3">
                                    <label for="nama_lapangan" class="form-label">Lapangan tujuan</label>
                                    <input type="text" class="form-control" id="nama_lapangan" value="<%=rs.getString("nama_lapangan")%>" name="nama_lapangan">
                                </div>
                                <%}
                                    rs.close();;
                                    statement.close();
                                    connection.close();
                                    } catch (SQLException e){
                                    out.println("Can't connect to database. with Error = "+e.getMessage());
                                     }
                                     %>
                                <div class="mb-3">
                                    <label for="durasi" class="form-label">Durasi</label>
                                    <input type="number" class="form-control" id="durasi" placeholder="Durasi Permainan(per jam)" name="durasi">
                                </div>
                                <div class="mb-3">
                                    <label for="waktu" class="form-label">Waktu mulai pesanan</label>
                                    <input type="time" name="waktu" id="waktu"  class="form-control" onkeyup="waktu();" name="waktu"/>
                                </div>
                                <div class="mb-3">
                                    <label for="keterangan" class="form-label">Keterangan Hal lain</label>
                                    <textarea class="form-control" id="keterangan" rows="3" name="keterangan"></textarea>
                                </div>
                                <br> 
                                <button type="submit" class="btn btn-primary" onclick="konfirmasiDulu()">Submit</button>
                                
                                		<script>
                                    function konfirmasiDulu(){
                                    var konfirmasi = confirm("Apakah anda sudah yakin");
                                    }
                                    function konfirmasicancel(){
                                    var konfirmasi = confirm("Yakin nih ga mau mesan ?? :)");    
                                    }
                                    
                                    function validasi(){
                                    var nama_customer = document.getElementById('nama_customer');
                                    var tanggal_pesanan = document.getElementById('tanggal_pesanan');
                                    var alamat_email = document.getElementById('alamat_email');
                                    var no_telp = document.getElementById('no_telp');
                                    var nama_lapangan = document.getElementById('nama_lapangan');
                                    var durasi = document.getElementById('durasi');
                                    var waktu = document.getElementById('waktu');

                                        if (harusDiisi(nama_customer, "Atas nama pesanan harus diisi")) {
                                            if (harusDiisi(tanggal_pesanan, "Tanggal pesanan belum diisi")) {
                                                if (harusDiisi(alamat_email, "Alamat Email Harap diisi")) {
                                                    if (harusDiisi(no_telp, "No Telepon anda belum diisi")) {
                                                        if (harusDiisi(nama_lapangan, "Lapangan tujuan anda belum diisi")) {
                                                            if (harusDiisi(durasi, "Anda belum mengisi durasi booking")) {
                                                                if (harusDiisi(waktu, "Waktu mulai booking anda belum diisi")) {
                                        return true;
                                                    };
                                                };
                                            };
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
                                                <button class="btn btn-primary" ><a href="HomeSatisfying.jsp" onclick="konfirmasicancel()" style="color:#FFFFFF">Cancel</a></button>    
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
                                
                                
                                    
        <%--Footer--%>
        <jsp:include page="FooterSatisfying.jsp" />
    </body>
</html>
<%}%>
