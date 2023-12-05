package org.apache.jsp.AdminSatisfying;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fpesanan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Halaman Admin Satisfying </title>\n");
      out.write("        <!-- BOOTSTRAP STYLES-->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- FONTAWESOME STYLES-->\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- MORRIS CHART STYLES-->\n");
      out.write("        <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- GOOGLE FONTS-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"pesanan.jsp\">Satisfying</a> \n");
      out.write("                </div>\n");
      out.write("                <div style=\"color: white;\n");
      out.write("                     padding: 15px 50px 5px 50px;\n");
      out.write("                     float: right;\n");
      out.write("                     font-size: 16px;\"><a href=\"Backend/logout.jsp\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("            </nav>   \n");
      out.write("            <!-- /. NAV TOP  -->\n");
      out.write("            <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("                        <li class=\"text-center\">\n");
      out.write("                            <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"pesanan.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Pesanan</a>\n");
      out.write("                            <a href=\"customer.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Customer</a>\n");
      out.write("                            <a href=\"lapangan.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Lapangan</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>  \n");
      out.write("            <!-- /. NAV SIDE  -->\n");
      out.write("            <div id=\"page-wrapper\" >\n");
      out.write("                <div id=\"page-inner\">\n");
      out.write("                    <h2>Data Pesanan</h2>\n");
      out.write("                   ");

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
                    
      out.write("\n");
      out.write("                    ");
if (rs.next()) {
      out.write("\n");
      out.write("                    <form method=\"post\" enctype=\"multipart/form-data\" action=\"Backend/edit_pesanan.jsp\">\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Atas Nama</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"Atas_nama\" value=\"");
      out.print(rs.getString("Atas_nama"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Tanggal Pesanan</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"tanggal_pesanan\" value=\"");
      out.print(rs.getString("tanggal_pesanan"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>No Handphone</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"no_telp\" value=\"");
      out.print(rs.getString("no_telp"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Keterangan</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"keterangan\" value=\"");
      out.print(rs.getString("keterangan"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-primary\" name=\"button\">Ubah</button>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");
}
                rs.close();;
                statement.close();
                connection.close();
                } catch (SQLException e){
                out.println("Can't connect to database. with error"+ e.getMessage());
                }
                
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /. WRAPPER  -->\n");
      out.write("        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("        <!-- JQUERY SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("        <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- METISMENU SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("        <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("        <!-- CUSTOM SCRIPTS -->\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
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
