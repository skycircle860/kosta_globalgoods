/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-05-15 12:51:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Step_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      java.util.Hashtable inputTable = null;
      inputTable = (java.util.Hashtable) _jspx_page_context.getAttribute("inputTable", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (inputTable == null){
        inputTable = new java.util.Hashtable();
        _jspx_page_context.setAttribute("inputTable", inputTable, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

	if(request.getAttribute("message")!=null && ((String)request.getAttribute("message")).length()>0)
	{
		String message = (String)request.getAttribute("message");

      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">window.alert(\"");
      out.print( message);
      out.write("\");</SCRIPT>\r\n");

	}

	String stepUrl = "/commonServlet.mo";
	if(request.getAttribute("stepUrl") != null && ((String)request.getAttribute("stepUrl")).length() > 0)
	{
		stepUrl = (String)request.getAttribute("stepUrl");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<BODY>\r\n");
      out.write("\t\t<FORM name=\"stepForm\" method=\"post\">\r\n");

	if(inputTable!=null && inputTable.size()>0)
	{
		Enumeration inKeys = inputTable.keys();
		while(inKeys.hasMoreElements())
		{
		String key = (String)inKeys.nextElement();
		String value = (String)inputTable.get(key);

      out.write("\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"");
      out.print( key);
      out.write("\" value=\"");
      out.print( value);
      out.write("\">\r\n");

		}
	}

      out.write("\r\n");
      out.write("\t\t</FORM>\r\n");
      out.write("\r\n");
      out.write("\t\t<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\t\t\tdocument.stepForm.action=\"");
      out.print( stepUrl);
      out.write("\";\r\n");
      out.write("\t\t\tdocument.stepForm.submit();\r\n");
      out.write("\t\t</SCRIPT>\r\n");
      out.write("\t</BODY>\r\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
