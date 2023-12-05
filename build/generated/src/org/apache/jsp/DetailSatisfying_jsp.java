package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class DetailSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderSatisfying.jsp", out, false);
      out.write("\n");
      out.write("        <section class=\"konten\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\t");

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
            
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t<h3>Username</h3>\n");
      out.write("\t\t\t\t<strong>Nama : ");
      out.print(rs.getString("nama_customer"));
      out.write("</strong>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tNomor Hp :");
      out.print(rs.getString("no_telp"));
      out.write("<br>\n");
      out.write("\t\t\t\t\tAlamat Email: ");
      out.print(rs.getString("alamat_email"));
      out.write(" \n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("                ");
}
                    rs.close();;
                    statement.close();
                    connection.close();
                    } catch (SQLException e){
                    out.println("Can't connect to database. with Error = "+e.getMessage());
                    }
                
      out.write("  \n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("        ");

            
            try {

            String id_customer1 = (String)session.getAttribute("id_customer");String host = "jdbc:mysql://localhost:3306/satisfying";
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
            
      out.write("\t\n");
      out.write("<table class=\"table table-bordered\">\n");
      out.write("\t<thead>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tNo\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tAtas nama\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tTanggal Pesanan\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tWaktu start booking\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tLama durasi permainan\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tNo Kontak yang dihubungi\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tLapangan Tujuan\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tKeterangan Hal lainnya\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tTotal Pembayaran\n");
      out.write("\t\t\t</th> \n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead\n");
      out.write("        \n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>");
      out.print(nomor);
      out.write("</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs1.getString("Atas_nama"));
      out.write("</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs1.getString("tanggal_pesanan"));
      out.write("</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs1.getString("waktu"));
      out.write("</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs1.getString("durasi"));
      out.write(" (per jam)</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs1.getString("no_telp"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs1.getString("lapangan_tujuan"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs1.getString("keterangan"));
      out.write("</td>\n");
      out.write("                                <td style=\"\">");
      out.print(rs1.getString("total_pembayaran"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("</table>\n");
      out.write("                 \n");
      out.write("<p>\n");
      out.write("\t<strong>Jumlah  : <?php echo $detail['jumlah_pesanan'];?></strong><br>\n");
      out.write("\t<strong>Total Keseluruhan : Rp. ");
      out.print(rs1.getString("total_pembayaran"));
      out.write("  </strong>\n");
      out.write("</p><br>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-7\">\n");
      out.write("\t\t\t<div class=\"alert alert-info\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tSilahkan Melakukan Pembayaran Rp.");
      out.print(rs1.getString("total_pembayaran"));
      out.write(".00- Ke <br>\n");
      out.write("\t\t\t\t\t<strong>BANK BCA 6428-9213-23 || AN.TEGUH AMANAH PUTRA</strong>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                         <label for=\"alamat_email\" class=\"form-label\">Alamat Email</label>\n");
      out.write("                         <input type=\"email\" class=\"form-control\" id=\"alamat_email\" placeholder=\"Ex:Budisantoso@gmail.com\" name=\"alamat_email\">\n");
      out.write("                    </div>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("            ");

            }nomor++;
                rs1.close();;
                    statement.close();
                    connection.close();
                    } catch (SQLException e){
                    out.println("Can't connect to database. with Error = "+e.getMessage());
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterSatisfying.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
