/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.42
 * Generated at: 2017-04-07 18:07:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Librarian_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--Home.html-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\t<center>\n");
      out.write("\t\t<h1>Library Management System</h1>\n");
      out.write("\t</center>\n");
      out.write("\t<table border=\"1\" width=\"100%\" height=\"100%\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<!--<td width=\"15%\" valign=\"top\" align=\"center\"><br /> -->\n");
      out.write("\t\t\t<!--<a href=\"Login.html\">Login</a><br /> <br />\n");
      out.write("\t\t\t<a href='Books.html'>Books Details</a> <br />\n");
      out.write("\t\t\t<a href='Fee.html'>Membership Fee</a> <br />\n");
      out.write("\t\t\t<a href='due.html'>Due</a> <br />\n");
      out.write("\t\t\t<a href='Allbooks.html'>Books</a> <!-- <br/><a href=\"registration.html\">Register</a><br/>-->\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td valign=\"top\" align=\"center\"><br />\n");
      out.write("\t\t\t\t<form action=\"Login\" method=\"post\">\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><b>Login Page</b></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><b>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Librarian Name</td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"lname\" /></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"lpassword\" /></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Login\" /></td>\n");
      out.write("\t\t\t\t\t\t\t<!--<td colspan=\"2\" align=\"left\"><input type=\"button\" onclick='window.location.assign(\"registration.jsp\")'\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Signup\" /></td>-->\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<!--<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><br><br><a href=\"Books.html\">Users can click here to browse the books!</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>-->\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</form></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
