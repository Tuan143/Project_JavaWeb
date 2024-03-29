package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <title>Trang chủ</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <!--End Header-->\n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"margin-top:30px\">\n");
      out.write("                <!-- Icons Grid -->\n");
      out.write("                <section class=\"features-icons bg-light text-center\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("                                    <div class=\"features-icons-icon d-flex\">\n");
      out.write("                                        <i class=\"icon-screen-desktop m-auto text-primary\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h3>Fully Responsive</h3>\n");
      out.write("                                    <p class=\"lead mb-0\">This theme will look great on any device, no matter the size!</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("                                    <div class=\"features-icons-icon d-flex\">\n");
      out.write("                                        <i class=\"icon-layers m-auto text-primary\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h3>Bootstrap 4 Ready</h3>\n");
      out.write("                                    <p class=\"lead mb-0\">Featuring the latest build of the new Bootstrap 4 framework!</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"features-icons-item mx-auto mb-0 mb-lg-3\">\n");
      out.write("                                    <div class=\"features-icons-icon d-flex\">\n");
      out.write("                                        <i class=\"icon-check m-auto text-primary\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h3>Easy to Use</h3>\n");
      out.write("                                    <p class=\"lead mb-0\">Ready to use with your own content, or customize the source files!</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--Footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--End footer-->\n");
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
