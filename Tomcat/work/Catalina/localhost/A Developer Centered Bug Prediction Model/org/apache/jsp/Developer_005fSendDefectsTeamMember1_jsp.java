/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2023-08-18 06:28:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.util.*;

public final class Developer_005fSendDefectsTeamMember1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/connect.jsp", Long.valueOf(1692339074578L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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
      out.write("\r\n");
      out.write("<title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");


		Connection connection = null;
		try{
		
		
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bug_prediction","root","password");
		
		
			}
			catch(Exception e)
			{
			System.out.println(e);
			}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Send Defects to Team Member</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">      \r\n");
      out.write("function valid()\r\n");
      out.write("{\r\n");
      out.write("var na3=document.s.dfct.value;\r\n");
      out.write("if(na3==\"\")\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please Enter Defects\");\r\n");
      out.write("document.s.dfct.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var na4=document.s.tmbr.value;\r\n");
      out.write("if(na4==\"--Select--\")\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("alert(\"Please Select Team Member\");\r\n");
      out.write("document.s.tmbr.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style3 {color: #000000; font-weight: bold; }\r\n");
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
      out.write("\t\t\t\t<h2 class=\"title\"><a href=\"#\">Send Defects by selecting corresponding Team Member..</a></h2>\r\n");
      out.write("\t\t\t\t<div class=\"entry\">\r\n");
      out.write("\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t<form action=\"Developer_SendDefectsTeamMember2.jsp\" method=\"post\" name=\"s\" onsubmit=\"return valid()\">\r\n");
      out.write("\t\t\t        \r\n");
      out.write("                    ");

							
					String prjname= request.getParameter("prjname");
					String manager= request.getParameter("manager");					
      				String company= (String)application.getAttribute("dcname");
					String developer= (String)application.getAttribute("dname");
					

      	try 
	{
      		
      		 ArrayList a1=new ArrayList();
      		
      		 
           
        String query="select developer from developer_project where (prjname='"+prjname+"' and company='"+company+"') and developer!='"+developer+"' "; 
        Statement st=connection.createStatement();
        ResultSet rs=st.executeQuery(query);
          
	   while ( rs.next() )
	   {
			a1.add(rs.getString(1));
			
		
	   }
	   
		
		

      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <table width=\"575\" border=\"0\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("                        <td height=\"36\"><div align=\"justify\"><span class=\"style3\">Project Name :</span> </div></td>\r\n");
      out.write("                        <td><label>\r\n");
      out.write("                         <input type=\"text\" id=\"prjname\" name=\"prjname\" value=\"");
      out.print(prjname);
      out.write("\" readonly />\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("                        <td height=\"36\"><div align=\"justify\"><span class=\"style3\">Enter Defects :</span> </div></td>\r\n");
      out.write("                        <td><label>\r\n");
      out.write("                          <textarea name=\"dfct\" cols=\"16\" rows=\"2\" id=\"textarea\"></textarea>\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td width=\"175\" height=\"33\"><div align=\"justify\"><span class=\"style3\">Select Team Member :</span></div></td>\r\n");
      out.write("                        <td width=\"390\"><label>\r\n");
      out.write("                          <select id=\"s1\" name=\"tmbr\" style=\"width:150px\">\r\n");
      out.write("                            <option>--Select--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                            ");
 
							for(int i=0;i<a1.size();i++)
							{
							 
								 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>");
      out.print( a1.get(i));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							
      out.write("\r\n");
      out.write("                          </select>\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      \t\t\t\t\t \t\t\t\t\t                        \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>&nbsp;</td>\r\n");
      out.write("                        <td>&nbsp;</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td height=\"26\">&nbsp;</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                          \r\n");
      out.write("                          <div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"hidden\" name=\"manager\" value=\"");
      out.print(manager);
      out.write("\" />\r\n");
      out.write("                            <input type=\"submit\" name=\"Submit\" value=\"Send\" style=\"background-color:#006633; color:#FFFFFF; width:60px; height:26px;\" />\r\n");
      out.write("                          </div></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                  </table>\r\n");
      out.write("\t\t            <p>\r\n");
      out.write("\t\t              ");


	   

           connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
          }

      out.write("\r\n");
      out.write("\t\t            </p>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t      <p>&nbsp;</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t  <p align=\"center\"><a href=\"Developer_SendDefectsTeamMember.jsp\" class=\"style11\">Back</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
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
      out.write("\t\t\t\t\t\t<li><span></span><a href=\"DeveloperMain.jsp\">Home</a></li>\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><span></span><a href=\"DeveloperLogin.jsp\">Logout</a></li>\t\t\t\t\r\n");
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
