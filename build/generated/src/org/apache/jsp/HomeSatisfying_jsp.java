package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class HomeSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Satisfying</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderSatisfying.jsp", out, false);
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"konten\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-auto\">\n");
      out.write("                        <div class=\"thumbnail\" style=\"background-image: url('images2/BackgroundSatisfying.png');\">\n");
      out.write("                            <center><h1 style=\"color: black \">Satisfying</h1></center><br>\n");
      out.write("                            ");

                            
                                            try {
                                                String host = "jdbc:mysql://localhost:3306/satisfying";
                                                Connection connection = null;
                                                Statement statement = null;
                                                ResultSet rs = null;
                                                Class.forName("com.mysql.jdbc.Driver");
                                                connection = DriverManager.getConnection(host, "root", "");
                                                statement = connection.createStatement();
                                                String Data = "select * from lapangan ";

                                                rs = statement.executeQuery(Data);
                                        
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"thumbnail\" style=\"background-color: #8fd19e\">\n");
      out.write("                                        <div class=\"panel-body  \" style=\"text-align: center; overflow: hidden; padding: 0\">\n");
      out.write("                                            <img style=\"max-height: 200px;\" src=\"img/Futsal.jpg\">\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
if (rs.next()) {
      out.write("\n");
      out.write("                                        <div class=\"caption\">\n");
      out.write("                                            <center><h4><a href=\"AboutLapangan.jsp?id_lapangan=");
      out.print(rs.getString("id_lapangan"));
      out.write("\" \n");
      out.write("                                                           name=\"id_lapangan\" value=\"1\"><font color=\"black\">");
      out.print(rs.getString("nama_lapangan"));
      out.write("</a></h4></center>\n");
      out.write("                                            <h5>Ini adalah lapangan yang berada di lokasi Rumbai di dekat Kampus PCR\n");
      out.write("                                                <br>\n");
      out.write("                                                Informasi Tentang Lapangan: <br>\n");
      out.write("                                                - ");
      out.print(rs.getString("jenis_olahraga"));
      out.write(" <br>\n");
      out.write("                                                - ");
      out.print(rs.getString("nama_lapangan"));
      out.write(" <br>\n");
      out.write("                                                <center><a href=\"PemesananSatisfying.jsp?id_lapangan=");
      out.print(rs.getString("id_lapangan"));
      out.write("\" \n");
      out.write("                                                           name=\"id_lapangan\" value=\"1\" class=\"btn btn-primary\">Booking Sekarang !</a></center>\n");
      out.write("                                            </h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                                rs.close();;
                                                statement.close();
                                                connection.close();
                                            } catch (SQLException e) {
                                                out.println("Can't connect to database. with error" + e.getMessage());
                                            }
                                        
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>            \n");
      out.write("                            ");

                                            try {
                                                String host = "jdbc:mysql://localhost:3306/satisfying";
                                                Connection connection = null;
                                                Statement statement = null;
                                                ResultSet rs = null;
                                                Class.forName("com.mysql.jdbc.Driver");
                                                connection = DriverManager.getConnection(host, "root", "");
                                                statement = connection.createStatement();
                                                String Data = "select * from lapangan";

                                                rs = statement.executeQuery(Data);
                                        
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"thumbnail\" style=\"background-color: #8fd19e\">\n");
      out.write("                                        <div class=\"panel-body  \" style=\"text-align: center; overflow: hidden; padding: 0\">\n");
      out.write("                                            <img style=\"max-height: 200px;\" src=\"img/GorWira.jpg\">\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
if (rs.last()) {
      out.write("\n");
      out.write("                                        <div class=\"caption\">\n");
      out.write("                                            <center><h4><a href=\"AboutLapangan.jsp?id_lapangan=");
      out.print(rs.getString("id_lapangan"));
      out.write("\">\n");
      out.write("                                                        <font color=\"black\">");
      out.print(rs.getString("nama_lapangan"));
      out.write("</a></h4></center>\n");
      out.write("                                            <h5>Ini adalah lapangan yang berada di lokasi Rumbai di dekat Kampus PCR\n");
      out.write("                                                <br>\n");
      out.write("                                                Informasi Tentang Lapangan: <br>\n");
      out.write("                                                - ");
      out.print(rs.getString("jenis_olahraga"));
      out.write(" <br>\n");
      out.write("                                                - ");
      out.print(rs.getString("nama_lapangan"));
      out.write(" <br>\n");
      out.write("                                                <center><a href=\"PemesananSatisfying.jsp?id_lapangan=");
      out.print(rs.getString("id_lapangan"));
      out.write("\" \n");
      out.write("                                                           class=\"btn btn-primary\">Booking Sekarang !</a></center>\n");
      out.write("                                            </h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");

                                                rs.close();;
                                                statement.close();
                                                connection.close();
                                            } catch (SQLException e) {
                                                out.println("Can't connect to database. with error" + e.getMessage());
                                            }
                                        
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("        </section>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"footer\" style=\"background-color: black\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterSatisfying.jsp", out, false);
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
