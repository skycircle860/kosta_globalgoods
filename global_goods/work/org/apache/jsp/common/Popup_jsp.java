/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-05-26 06:04:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Popup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String mainUrl = "/common/Progress.jsp";
	if(request.getAttribute("mainUrl") != null && ((String)request.getAttribute("mainUrl")).length() > 0)
	{
		System.out.println("popup에넘어온 mainUrl 값 : "+mainUrl);
		mainUrl = (String)request.getAttribute("mainUrl");
	}

	String message = "";
	if(request.getAttribute("message")!=null && ((String)request.getAttribute("message")).length()>0)
	{
		message = (String)request.getAttribute("message");
	}
	if(session.getAttribute("message")!=null && ((String)session.getAttribute("message")).length()>0)
	{
		message = (String)session.getAttribute("message");
		session.setAttribute("message", null);
	}

	if(message.length()>0)
	{

      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">window.alert(\"");
      out.print( message);
      out.write("\");</SCRIPT>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<HEAD>\r\n");
      out.write("\t\t<TITLE>노력하십니까?</TITLE>\r\n");
      out.write("\t\t<Link href=\"/css/common.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t\t<SCRIPT language=\"JavaScript\" type=\"text/JavaScript\" src=\"/js/common.js\"></SCRIPT>\r\n");
      out.write("\t</HEAD>\r\n");
      out.write("\r\n");
      out.write("\t<BODY bgcolor=\"#FFFFFF\" text=\"#000000\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\t\t<TABLE width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD width=\"100%\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t<!-- Main 화면 관련 시작 ------------------->\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  mainUrl, out, true);
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Main 화면 관련 끝 --------------------->\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TABLE>\r\n");
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
