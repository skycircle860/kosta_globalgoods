/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-01 20:54:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class SearchId_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      java.util.Hashtable outputTable = null;
      outputTable = (java.util.Hashtable) _jspx_page_context.getAttribute("outputTable", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (outputTable == null){
        outputTable = new java.util.Hashtable();
        _jspx_page_context.setAttribute("outputTable", outputTable, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

	if(outputTable.get("idSearchList")!= null && ((ArrayList)outputTable.get("idSearchList")).size() >0)
	{
	ArrayList idSearchList = (ArrayList)outputTable.get("idSearchList");
	Hashtable idTable = (Hashtable)idSearchList.get(0);
	String id = (String)idTable.get("ID");
	String name = (String)idTable.get("NAME");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin:10px;\">\r\n");
      out.write("<img src=\"/images/common/5.gif\">&nbsp;<B>아이디 검색 결과</B>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"nomal_radius searchIdPwDiv\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"center\"><b>");
      out.print( name );
      out.write(" 님의 아이디는<font color=\"blue\"> ");
      out.print( id );
      out.write("</font> 입니다.</b></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");

	}
	else
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin:10px;\">\r\n");
      out.write("<img src=\"/images/common/5.gif\">&nbsp;<B>아이디 검색 결과</B>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"nomal_radius searchIdPwDiv\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"center\"><b>찾으시는 아이디가 없습니다.</b></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<div>\r\n");

	}

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
