package org.apache.jsp.AdminSatisfying;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pesanan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Halaman Admin Satisfying </title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- MORRIS CHART STYLES-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"pesanan.jsp\">Satisfying</a> \n");
      out.write("            </div>\n");
      out.write("  <div style=\"color: white;\n");
      out.write("padding: 15px 50px 5px 50px;\n");
      out.write("float: right;\n");
      out.write("font-size: 16px;\"><a href=\"Backend/logout.jsp\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"pesanan.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Pesanan</a>\n");
      out.write("                        <a href=\"customer.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Customer</a>\n");
      out.write("                        <a href=\"lapangan.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Lapangan</a>\n");
      out.write("                    </li>\n");
      out.write("                     \t\n");
      out.write("\t\t\t\t\t                   \n");
      out.write("                      \n");
      out.write("                  \t\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <h2>Data Pesanan</h2>\n");
      out.write("                ");

                                            try {
                                                String host = "jdbc:mysql://localhost:3306/satisfying";
                                                Connection connection = null;
                                                Statement statement = null;
                                                ResultSet rs = null;
                                                Class.forName("com.mysql.jdbc.Driver");
                                                connection = DriverManager.getConnection(host, "root", "");
                                                statement = connection.createStatement();
                                                String Data = "select * from pesanan";

                                                rs = statement.executeQuery(Data);
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <table class=\"table table-bordered\">\n");
      out.write("\t<thead>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tAtas Nama\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tTanggal Pesanan\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th>\n");
      out.write("\t\t\t\tWaktu\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tDurasi(Per Jam)\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tNo Handphone\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tLapangan Tujuan\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tTotal Pembayaran\n");
      out.write("\t\t\t</th>\n");
      out.write("                        <th>\n");
      out.write("\t\t\t\tAksi\n");
      out.write("\t\t\t</th> \n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead\n");
      out.write("                \n");
      out.write("\t\t<tbody>\n");
      out.write("                        ");
while (rs.next()) {
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString("Atas_nama"));
      out.write("</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString("tanggal_pesanan"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("waktu"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("durasi"));
      out.write("(Per Jam)</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("no_telp"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("lapangan_tujuan"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("total_pembayaran"));
      out.write("</td>\n");
      out.write("                                <td style=\"\">\n");
      out.write("                                    <a href=\"Backend/hapus_pesanan.jsp?id_pesanan=");
      out.print(rs.getString("id_pesanan"));
      out.write("\" class=\"btn btn-outline-danger\">Hapus</a>\n");
      out.write("                                    <a href=\"edit_pesanan.jsp?id_pesanan=");
      out.print(rs.getString("id_pesanan"));
      out.write("\" class=\"btn btn-group\">Edit Data</a>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("\t\t</tbody>\n");
      out.write("</table>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        ");

                                                rs.close();;
                                                statement.close();
                                                connection.close();
                                            } catch (SQLException e) {
                                                out.println("Can't connect to database. with error" + e.getMessage());
                                            }
                                        
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
