/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-05-26 06:04:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class JoinCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');
      java.util.Hashtable inputTable = null;
      inputTable = (java.util.Hashtable) _jspx_page_context.getAttribute("inputTable", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (inputTable == null){
        inputTable = new java.util.Hashtable();
        _jspx_page_context.setAttribute("inputTable", inputTable, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

	ArrayList checkIdList = (ArrayList)outputTable.get("checkIdList");
	String name = (String)inputTable.get("name");
	String jumin1 = (String)inputTable.get("jumin1");
	String jumin2 = (String)inputTable.get("jumin2");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\tfunction joinCheckConfirm()\r\n");
      out.write("\t{\r\n");

	if(checkIdList.size()==0)
	{

      out.write("\r\n");
      out.write("\t\t\t\topener.joinCheckForm.joinCheckYn.value=\"Y\";\r\n");
      out.write("\t\t\t\topener.agreeForm.name.value=\"");
      out.print( name);
      out.write("\";\r\n");
      out.write("\t\t\t\topener.agreeForm.jumin1.value=\"");
      out.print( jumin1);
      out.write("\";\r\n");
      out.write("\t\t\t\topener.agreeForm.jumin2.value=\"");
      out.print( jumin2);
      out.write("\";\r\n");
      out.write("\t\t\t\topener.joinCheckForm.checkJumin1.value=\"");
      out.print( jumin1);
      out.write("\";\r\n");
      out.write("\t\t\t\topener.joinCheckForm.checkJumin2.value=\"");
      out.print( jumin2);
      out.write("\";\r\n");

	}

      out.write("\r\n");
      out.write("\t\twindow.self.close();\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<TR><TD height=\"45\"></TD></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE width=\"100%\">\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"center\" width=\"100%\">\r\n");

	if(checkIdList.size()==0)
	{

      out.write("\r\n");
      out.write("\t\t\t<FONT size=\"3\" color=\"#339999\"><B>회원 가입이 가능합니다.</B></FONT>\r\n");

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t\t<FONT size=\"3\" color=\"#CC0066\"><B>이미 회원으로 가입되어 있습니다.</B></FONT>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<CENTER><IMG src=\"/images/button/but_ok.gif\" border=\"0\" onclick=\"joinCheckConfirm();\" style=\"cursor:hand\" align=\"absmiddle\"></CENTER>");
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
