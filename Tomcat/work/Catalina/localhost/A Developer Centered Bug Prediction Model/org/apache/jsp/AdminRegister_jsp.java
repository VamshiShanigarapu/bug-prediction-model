/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2023-08-18 06:02:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Admin Register</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">      \r\n");
      out.write("function valid()\r\n");
      out.write("{\r\n");
      out.write("var na3=document.s.cname.value;\r\n");
      out.write("if(na3==\"--Select--\")\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please Select Company Name\");\r\n");
      out.write("document.s.cname.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #000000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t<h1><a href=\"#\">A Developer Centered Bug Prediction Model</a></h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #header -->\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"AdminLogin.jsp\">Admin</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"ManagerLogin.jsp\">Manager</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"DeveloperLogin.jsp\">Developers</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #menu -->\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\"><a href=\"#\">Welcome To Admin Registration..</a></h2>\r\n");
      out.write("\t\t\t\t<div class=\"entry\">\r\n");
      out.write("\t\t\t\t<p><img src=\"images/Register.jpg\" alt=\"\" width=\"293\" height=\"155\" /></p>\r\n");
      out.write("\t\t\t\t\t<form name=\"s\" action=\"AdminRegisterStatus.jsp\" enctype=\"multipart/form-data\" method=\"post\" onsubmit=\"return valid()\"  >\r\n");
      out.write("\t\t\t\t\t<span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"gender\">Select Company Name (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t\t\t <p class=\"style1\">\r\n");
      out.write("                      <select id=\"s2\" name=\"cname\" style=\"width:150px;\" class=\"text\">\r\n");
      out.write("                        <option>--Select--</option>\r\n");
      out.write("                        <option>Infosys</option>\r\n");
      out.write("\t\t\t\t\t    <option>IBM</option>\r\n");
      out.write("\t\t\t\t\t\t<option>Accenture</option>\r\n");
      out.write("\t\t\t\t\t\t<option>Oracle</option>    \r\n");
      out.write("\t\t\t\t\t\t<option>TCS</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <label for=\"name\"><span class=\"style1\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tUser Name (required)</span></label>\r\n");
      out.write("                    <p class=\"style1\">\r\n");
      out.write("                      <input id=\"name\" name=\"userid\" class=\"text\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"password\">Password (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <input type=\"password\" id=\"password\" name=\"pass\" class=\"text\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"email\">Email Id (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <input id=\"email\" name=\"email\" class=\"text\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"mobile\">Mobile Number (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <input id=\"mobile\" name=\"mobile\" class=\"text\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"address\">Your Address</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <textarea id=\"address\" name=\"address\" rows=\"3\" cols=\"22\"></textarea>\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"dob\">Date of Birth (required)<br />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <input id=\"dob\" name=\"dob\" class=\"text\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\t\t\t        <span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"gender\">Select Gender (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <select id=\"s1\" name=\"gender\" style=\"width:150px;\" class=\"text\">\r\n");
      out.write("                        <option>--Select--</option>\r\n");
      out.write("                        <option>MALE</option>\r\n");
      out.write("                        <option>FEMALE</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </p>\t\r\n");
      out.write("\t\t\t\t\t<span class=\"style1\">\r\n");
      out.write("\t\t\t        <label for=\"pic\">Select Profile Picture (required)</label>\r\n");
      out.write("                    </span>\r\n");
      out.write("\t\t\t        <p class=\"style1\">\r\n");
      out.write("                      <input type=\"file\" id=\"pic\" name=\"pic\" class=\"text\" />\r\n");
      out.write("                    </p>\t\t\t\t\r\n");
      out.write("\t\t\t       <br />\r\n");
      out.write("                      <input name=\"submit\" type=\"submit\" value=\"REGISTER\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>&nbsp;</p>\r\n");
      out.write("\t\t\t        <p align=\"left\" class=\"style14\"><a href=\"SellerLogin.jsp\" class=\"style11\">Back</a></p>\r\n");
      out.write("\t\t          </form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"clear: both;\">&nbsp;</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end #content -->\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<h2>Categories</h2>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><span></span><a href=\"index.html\">Home</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end #sidebar -->\r\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #page -->\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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