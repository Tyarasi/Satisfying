package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class PemesananSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

   if ((session.getAttribute("nama_customer") == null) || (session.getAttribute("nama_customer") == "")) {

response.sendRedirect("LoginSatisfying.jsp");
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert ('Silahkan Belanja Terlebih Dahulu');\n");
      out.write("</script>\n");
      out.write("    ");
}else{
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

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
            while (rs.next()) {
        
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderSatisfying.jsp", out, false);
      out.write("\n");
      out.write("        <section class=\"konten\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><h1 style=\"color: black \">Silahkan isi data Terlebih dahulu</h1></center><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-offset-11\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <form action=\"Pemesanan.jsp\">\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"nama_customer\" class=\"form-label\">Atas Nama</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"nama_customer\" placeholder=\"Ex:Budi Santoso\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"tanggal_pesanan\" class=\"form-label\">Tanggal Booking</label>\n");
      out.write("                                    <input type=\"time\" name=\"waktu_mulai_masuk\" id=\"waktu_mulai_masuk\"  class=\"form-control\" onkeyup=\"Waktumasuk();\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"alamat_email\" class=\"form-label\">Alamat Email</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"alamat_email\" placeholder=\"Ex:Budisantoso@gmail.com\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"no_telp\" class=\"form-label\">No Handphone</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"tanggal_pesanan\" placeholder=\"Kontak yang bisa dihubungi\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"nama_lapangan\" class=\"form-label\">Lapangan tujuan</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"nama_lapangan\" value=\"");
      out.print(rs.getString("nama_lapangan"));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"durasi\" class=\"form-label\">Durasi</label>\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" id=\"durasi\" placeholder=\"Durasi Permainan(per jam)\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"keterangan\" class=\"form-label\">Keterangan Hal lain</label>\n");
      out.write("                                    <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                                    ");

            }
                            rs.close();;
                            statement.close();
                            connection.close();
                            } catch (SQLException e){
                                out.println("Can't connect to database. with Error = "+e.getMessage());
                            }
                            
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterSatisfying.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
}
      out.write('\n');
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
