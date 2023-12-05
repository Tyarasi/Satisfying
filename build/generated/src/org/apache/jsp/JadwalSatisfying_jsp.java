package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class JadwalSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        ");

            String host = "jdbc:mysql://localhost:3306/satisfying";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(host, "root", "");
                String query = "select *from jadwal";
                Statement stmt = conn.createStatement();
                ResultSet rs = null;
                rs = stmt.executeQuery(query);

        
      out.write("\n");
      out.write("        <section class=\"konten\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-auto\">\n");
      out.write("                        <div class=\"thumbnail\" style=\"background-image: url('images2/BackgroundSatisfying.png'); text-align: center;\">\n");
      out.write("                            <center><h1 style=\"color: black \">Satisfying</h1></center><br>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("        <div class=\"thumbnail\" style=\"background-color: #8fd19e\">\n");
      out.write("            <div class=\"panel-body  \" style=\"text-align: center; overflow: hidden; padding: 0\">\n");
      out.write("                    <h1>Booking</h1>\n");
      out.write("                    <center><table border=\"1\" style=\"\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>id_jadwal</td>\n");
      out.write("                                <td>Tanggal</td>\n");
      out.write("                                <td>Jam</td>\n");
      out.write("                                <td>Durasi</td>\n");
      out.write("                                <td>Harga</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 while (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(rs.getString("id_jadwal"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getDate("Tanggal"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getInt("Jam"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getInt("Durasi"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getInt("Harga"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                <td><a href=\"edit_jadwal.jsp?id_jadwal=");
      out.print(rs.getString("id_jadwal"));
      out.write("\"\n");
      out.write("                                       >Booking</a> \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </table></center>\n");
      out.write("                        ");

                                rs.close();
                                stmt.close();
                                conn.close();
                            } catch (SQLException ex) {
                                out.println("Gagal Koneksi");
                            } catch (Exception ex) {
                                out.println(ex.getMessage());
                            }
                        
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterSatisfying.jsp", out, false);
      out.write("\n");
      out.write("            </body>\n");
      out.write("            </html>\n");
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
