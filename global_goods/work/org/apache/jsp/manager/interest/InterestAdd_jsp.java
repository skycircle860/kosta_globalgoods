/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-05-30 12:06:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.interest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class InterestAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\t// 관심사 추가\r\n");
      out.write("\tfunction addAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.addForm;\r\n");
      out.write("\t\tif(trim(f.name.value)==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twindow.alert(\"관심사의 이름을 입력하세요.\");\r\n");
      out.write("\t\t\tf.name.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tf.name.value = trim(f.name.value);\r\n");
      out.write("\t\tf.target = \"listWin\";\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t\twindow.close();\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"15\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"3\" bgcolor=\"#7682EB\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#E4F2FC\" width=\"150\">\r\n");
      out.write("\t\t\t\t<FONT color=\"#1115AA\" size=\"3\"><B>관심사 추가</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"15\" width=\"350\"></TD></TR>\r\n");
      out.write("\t\t<TR><TD> ** 추가할 관심사의 이름을 입력하세요.</TD></TR>\r\n");
      out.write("\t\t<TR><TD height=\"5\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"4\" bgcolor=\"#7682EB\" width=\"350\">\r\n");
      out.write("\t\t<FORM name=\"addForm\" method=\"post\" action=\"/managerInterestServlet.mo\" onSubmit=\"addAction(); return false;\">\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"func\" value=\"managerInterest_007\">\r\n");
      out.write("\t\t\t<TR><TD bgcolor=\"#CFDDFA\" align=\"center\"><B>관 심 사 이 름</B></TD></TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\" align=\"center\"><INPUT type=\"text\" name=\"name\" size=\"46\"></TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</FORM>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"5\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_reg.gif\" border=\"0\" align=\"absmiddle\" alt=\"등록\" style=\"cursor:hand\" onClick=\"addAction();\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_cancel1.gif\" border=\"0\" align=\"absmiddle\" alt=\"취소\" style=\"cursor:hand\" onClick=\"window.close();\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"10\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</CENTER>");
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
