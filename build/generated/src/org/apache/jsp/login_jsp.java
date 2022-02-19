package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <script src=\"js/login.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <section>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"user signinBx\">\n");
      out.write("        <div class=\"imgBx\"><img src=\"https://beedesign.com.vn/wp-content/uploads/2020/08/Thiet-ke-logo-dien-thoai-apple-123-14.jpg\" alt=\"\" /></div>\n");
      out.write("        <div class=\"formBx\">\n");
      out.write("          <form action=\"\" onsubmit=\"return false;\">\n");
      out.write("            <h2>Sign In</h2>\n");
      out.write("            <input type=\"text\" name=\"\" placeholder=\"Username\" />\n");
      out.write("            <input type=\"password\" name=\"\" placeholder=\"Password\" />\n");
      out.write("            Remember me <input type=\"checkbox\">\n");
      out.write("            <input type=\"submit\" name=\"\" value=\"Login\" />\n");
      out.write("            <p class=\"signup\">\n");
      out.write("              Don't have an account ?\n");
      out.write("              <a href=\"#\" onclick=\"toggleForm();\">Sign Up.</a>\n");
      out.write("            </p>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"user signupBx\">\n");
      out.write("        <div class=\"formBx\">\n");
      out.write("          <form action=\"\" onsubmit=\"return false;\">\n");
      out.write("            <h2>Create an account</h2>\n");
      out.write("            <input type=\"text\" name=\"\" placeholder=\"Username\" />\n");
      out.write("            <input type=\"email\" name=\"\" placeholder=\"Email Address\" />\n");
      out.write("            <input type=\"password\" name=\"\" placeholder=\"Create Password\" />\n");
      out.write("            <input type=\"password\" name=\"\" placeholder=\"Confirm Password\" />\n");
      out.write("            <input type=\"submit\" name=\"\" value=\"Sign Up\" />\n");
      out.write("            <p class=\"signup\">\n");
      out.write("              Already have an account ?\n");
      out.write("              <a href=\"#\" onclick=\"toggleForm();\">Sign in.</a>\n");
      out.write("            </p>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"imgBx\"><img src=\"https://kenh14cdn.com/thumb_w/660/203336854389633024/2021/10/22/dscf1124-16325653550902087974601-1634894507412617869306.jpeg\" alt=\"\" /></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
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
