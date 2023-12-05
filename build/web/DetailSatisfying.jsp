<%-- 
    Document   : DetailSatisfying
    Created on : Jan 25, 2021, 2:40:24 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Pesanan</title>
    </head>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <body>
        <jsp:include page="HeaderSatisfying.jsp" />
        <section class="konten">
		<div class="container">

                   
	<%
            String id_customer = (String)session.getAttribute("id_customer");
            try {
            String host = "jdbc:mysql://localhost:3306/satisfying";
            Connection connection = null;
            Statement statement = null;
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(host, "root", "");
            statement = connection.createStatement();
            String Data = "select * from customer where id_customer =" + id_customer;

            rs = statement.executeQuery(Data);
            if (rs.next()) {
            %>		

	<div class="row">
		
                <%}
                    rs.close();;
                    statement.close();
                    connection.close();
                    } catch (SQLException e){
                    out.println("Can't connect to database. with Error = "+e.getMessage());
                    }
                %>  
	</div>
	<br>
	<br>
        <%
            
            try {

            String id_customer1 = (String)session.getAttribute("id_customer");
            int id_customer2 = Integer.parseInt(id_customer);
            String host = "jdbc:mysql://localhost:3306/satisfying";
            Connection connection = null;
            Statement statement = null;
            ResultSet rs1 = null;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(host, "root", "");
            statement = connection.createStatement();
            String Data = "select * from pesanan where id_customer =" + id_customer1;

            rs1 = statement.executeQuery(Data);
            int nomor =1;
            if (rs1.next()) {
            %>	
<table class="table table-bordered">
	<thead>
		<tr>
			<th>
				No
			</th>
			<th>
				Atas nama
			</th>
			<th>
				Tanggal Pesanan
			</th>
			<th>
				Waktu start booking
			</th>
			<th>
				Lama durasi permainan
			</th>
			<th>
				No Kontak yang dihubungi
			</th>
                        <th>
				Lapangan Tujuan
			</th>
                        <th>
				Keterangan Hal lainnya
			</th>
                        <th>
				Total Pembayaran
			</th> 
		</tr>
	</thead
        
		<tbody>
			<tr>
				<td><%=nomor%></td>
				<td><%=rs1.getString("Atas_nama")%></td>
				<td><%=rs1.getString("tanggal_pesanan")%></td>
				<td><%=rs1.getString("waktu")%></td>
				<td><%=rs1.getString("durasi")%> (per jam)</td>
				<td><%=rs1.getString("no_telp")%></td>
                                <td><%=rs1.getString("lapangan_tujuan")%></td>
                                <td><%=rs1.getString("keterangan")%></td>
                                <td style=""><%=rs1.getString("total_pembayaran")%></td>
                        </tr>
		</tbody>
</table>
                 
<p>
	<strong>Durasi Permainan(Booking)  : <%=rs1.getString("durasi")%> (jam)</strong><br>
	<strong>Total Keseluruhan : Rp. <%=rs1.getString("total_pembayaran")%>  </strong>
</p><br>
	<div class="row">
		<div class="col-md-7">
			<div class="alert alert-info">
				<p>
					Silahkan Melakukan Pembayaran Rp.<%=rs1.getString("total_pembayaran")%>.00- Ke <br>
					<strong>BANK BCA 6428-9213-23 || AN.TEGUH AMANAH PUTRA</strong>
				</p>
			</div>			
		</div>
        </div>
        <form action="Backend/buktipembayaran.jsp?id_customer=<%=rs1.getString("id_customer")%>" onsubmit="return validasi()">
                    <div class="mb-3">
                         <label for="bukti_pembayaran" class="form-label">Upload Bukti Pembayaran</label>
                         <input type="file" class="form-control" id="bukti_pembayaran" placeholder="Ex:Budisantoso@gmail.com" name="bukti_pembayaran">
                    </div>
        <br>
        <button type="submit" class="btn btn-primary"  onclick="konfirmasiDulu()" >Submit</button>
        <br>
        <br>
        <script>
            function konfirmasiDulu(){
                                    var konfirmasi = confirm("Anda yakin bukti pembayaran ini sah ? ");
                                    }
            function validasi(){
                                    var bukti_pembayaran = document.getElementById('bukti_pembayaran');
                                        if (harusDiisi(bukti_pembayaran, "Harap Dimasukkan bukti pembayaran")) {
                                        return true;
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
        </form>
        
            <%
            }nomor++;
                rs1.close();;
                    statement.close();
                    connection.close();
                    } catch (SQLException e){
                    out.println("Can't connect to database. with Error = "+e.getMessage());
                    }
                %>

        
		</div>
	</section>
                <br><br>
                <br><br>
                <br><br>
                <br><br>
        
        <%--Footer--%>
         <jsp:include page="FooterSatisfying.jsp" />
    </body>
</html>
