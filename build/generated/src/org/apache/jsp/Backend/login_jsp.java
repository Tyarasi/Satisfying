package org.apache.jsp.Backend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write(" \n");

    String nama_customer = request.getParameter("username");    
    String password= request.getParameter("password");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisfying","root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from customer where nama_customer='" + nama_customer + "' and password='" + password + "'");
    
     
    
    if (rs.next()){
        String id_customer1 = rs.getString("id_customer");
        int id_customer2 = Integer.parseInt(id_customer1);
        if(id_customer2 == 1){
        session.setAttribute("nama_customer", nama_customer );
        String nama =rs.getString("nama_customer");
        String id_customer=rs.getString("id_customer");
       
        session.setAttribute("id_customer", id_customer);
        session.setAttribute("nama", nama);
         
        response.sendRedirect("../AdminSatisfying.jsp"); 
        }else{
        session.setAttribute("nama_customer", nama_customer );
        String nama =rs.getString("nama_customer");
        String id_customer=rs.getString("id_customer");
       
        session.setAttribute("id_customer", id_customer);
        session.setAttribute("nama", nama);
         
        response.sendRedirect("../HomeSatisfying.jsp");
        }
    } else  {
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        
        response.sendRedirect("../LoginSatisfying.jsp");
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
