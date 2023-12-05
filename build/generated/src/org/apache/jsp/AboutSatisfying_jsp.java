package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutSatisfying_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderSatisfying.jsp", out, false);
      out.write("\n");
      out.write("        <h1></h1>\n");
      out.write("        <form class=\"row g-3 needs-validation\" novalidate>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <label for=\"validationCustom01\" class=\"form-label\">First name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"validationCustom01\" value=\"Mark\" required>\n");
      out.write("                <div class=\"valid-feedback\">\n");
      out.write("                    Looks good!\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <label for=\"validationCustom02\" class=\"form-label\">Last name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"validationCustom02\" value=\"Otto\" required>\n");
      out.write("                <div class=\"valid-feedback\">\n");
      out.write("                    Looks good!\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <label for=\"validationCustomUsername\" class=\"form-label\">Username</label>\n");
      out.write("                <div class=\"input-group has-validation\">\n");
      out.write("                    <span class=\"input-group-text\" id=\"inputGroupPrepend\">@</span>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"validationCustomUsername\" aria-describedby=\"inputGroupPrepend\" required>\n");
      out.write("                    <div class=\"invalid-feedback\">\n");
      out.write("                        Please choose a username.\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <label for=\"validationCustom03\" class=\"form-label\">City</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"validationCustom03\" required>\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                    Please provide a valid city.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <label for=\"validationCustom04\" class=\"form-label\">State</label>\n");
      out.write("                <select class=\"form-select\" id=\"validationCustom04\" required>\n");
      out.write("                    <option selected disabled value=\"\">Choose...</option>\n");
      out.write("                    <option>...</option>\n");
      out.write("                </select>\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                    Please select a valid state.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <label for=\"validationCustom05\" class=\"form-label\">Zip</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"validationCustom05\" required>\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                    Please provide a valid zip.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck\" required>\n");
      out.write("                    <label class=\"form-check-label\" for=\"invalidCheck\">\n");
      out.write("                        Agree to terms and conditions\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"invalid-feedback\">\n");
      out.write("                        You must agree before submitting.\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\">Submit form</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
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
