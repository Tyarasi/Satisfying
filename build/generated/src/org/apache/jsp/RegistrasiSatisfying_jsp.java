package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrasiSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registrasi Satisfying</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images2/BackgroundSatisfying.png');\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("        <h1>Registrasi Account</h1>\n");
      out.write("        <p>Website Booking Lapangan Olahraga Rumbai dan sekitarnya</p>\n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"Backend/registrasi.jsp\" onsubmit=\"return validasi()\">\n");
      out.write("            <input type=\"text\" placeholder=\"Username\" style=\"width:250px \" name=\"username\" id=\"username\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" style=\"width:250px\" name=\"password\" id=\"password\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"password\" placeholder=\"Konfirmasi Password\" style=\"width:250px\" name=\"Konfirmasipassword\" id=\"Konfirmasipassword\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"email\" placeholder=\"Alamat Email\" style=\"width:250px\" name=\"alamat_email\" id=\"alamat_email\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" placeholder=\"No.Telepon\" style=\"width:250px\" name=\"no_telp\" id=\"no_telp\" pattern = \"^ \\ d {11} $\" required>\n");
      out.write("                <br><br>\n");
      out.write("                <button id=\"submit\">Daftarkan Diri Anda !</button>\n");
      out.write("                <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function () {\n");
      out.write("                        #submit.click function () {\n");
      out.write("                            var password = #password.val();\n");
      out.write("                            var confirmPassword = #KonfirmasiPassword.val();\n");
      out.write("                            if (password != confirmPassword){\n");
      out.write("                                alert(\"Tidak Sama TOT\");\n");
      out.write("                                return false;\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                            return true;;\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                    function validasi(){\n");
      out.write("                var username = document.getElementById('username');\n");
      out.write("                var password = document.getElementById('password');\n");
      out.write("                var alamat_email = document.getElementById('alamat_email');\n");
      out.write("                var no_telp = document.getElementById('no_telp');\n");
      out.write("\n");
      out.write("                if (harusDiisi(username, \"Username belum diisi\")) {\n");
      out.write("                    if (harusDiisi(password, \"Password belum diisi\")) {\n");
      out.write("                        if (harusDiisi(alamat_email, \"Alamat Email Harap diisi\")) {\n");
      out.write("                            if (harusDiisi(no_telp, \"No Telepon anda belum diisi\")) {\n");
      out.write("                            return true;\n");
      out.write("                        };\n");
      out.write("                    };\n");
      out.write("                };\n");
      out.write("            };\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("                   \n");
      out.write("            \n");
      out.write("\n");
      out.write("            function harusDiisi(att, msg){\n");
      out.write("                if (att.value.length == 0) {\n");
      out.write("                    alert(msg);\n");
      out.write("                    att.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("                    </script>\n");
      out.write("                <br>\n");
      out.write("                </center>\n");
      out.write("</form>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <p>Info lebih lanjut</p>\n");
      out.write("            <img src =\"images2/instagram.jpg\"  width =\"50\" height=\"30\">\n");
      out.write("            <img src =\"images2/twiter.png\"  width =\"50\" height=\"30\">\n");
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
