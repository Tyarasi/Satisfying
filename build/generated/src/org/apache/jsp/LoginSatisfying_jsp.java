package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css2/Style.css\">\n");
      out.write("        <title>Login Satisfying</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images2/BackgroundSatisfying.png');\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("        <h1>Selamat Datang</h1>\n");
      out.write("        <p>Website Booking Lapangan Olahraga Rumbai dan sekitarnya</p>\n");
      out.write("        <br><br>\n");
      out.write("        <form method=\"post\" action=\"MultiLogingSatisfying?proses=login\"  onsubmit=\"validasi()\">\n");
      out.write("                <input type=\"text\" placeholder=\"username\" style=\"width:250px \" name=\"nama_customer\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"password\" placeholder=\"password\" style=\"width:250px\" name=\"password\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <button>Login</button>\n");
      out.write("            <br>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("            <p><a href=\"RegistrasiSatisfying.jsp\">Belum terdaftar ? Klik disini</a></p>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <p>Info lebih lanjut</p>\n");
      out.write("            <a href=\"https://www.instagram.com/accounts/login/\"><img src =\"images2/instagram.jpg\"  width =\"50\" height=\"30\"></a>\n");
      out.write("            <a href=\"https://twitter.com/login?lang=id\"><img src =\"images2/twiter.png\"  width =\"50\" height=\"30\"></a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
