/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-04 05:50:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.interest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class InterestInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList interestInfoList = (ArrayList)outputTable.get("interestInfoList");
	Hashtable interestInfoTable = (Hashtable)interestInfoList.get(0);

	String code = (String)interestInfoTable.get("CODE");

	String useYn = (String)interestInfoTable.get("USEYN");
	String useKor = "사용중";
	if(useYn.equals("N"))
	{
		useKor = "미사용";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\t// 취미 목록 페이지 가기\r\n");
      out.write("\tfunction goList()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/managerInterestServlet.mo?func=managerInterest_001\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 취미 수정 페이지 가기\r\n");
      out.write("\tfunction goUpdate()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href='/managerInterestServlet.mo?func=managerInterest_004&from=info&code=");
      out.print( code);
      out.write("';\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<style>\r\n");
      out.write("td{\r\n");
      out.write("\theight:25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#74c900\" width=\"750\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#74c900\" width=\"750\">\r\n");
      out.write("\t\t\t\t<FONT color=\"white\" size=\"3\"><B>관심사 상세 정보</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"750\">\r\n");
      out.write("\t\t<TR><TD height=\"10\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"4\" bgcolor=\"#74c900\" width=\"750\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD width=\"150\" bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>CODE</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( code);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>NAME</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( interestInfoTable.get("NAME"));
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>사용 여부</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( useKor);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>작성자 (IP)</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( interestInfoTable.get("REG_ID"));
      out.write(' ');
      out.write('(');
      out.print( interestInfoTable.get("REG_IP"));
      out.write(")</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>작성일</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( interestInfoTable.get("REG_DATE"));
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>최종 수정자 (IP)</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( interestInfoTable.get("UPD_ID"));
      out.write(' ');
      out.write('(');
      out.print( interestInfoTable.get("UPD_IP"));
      out.write(")</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><FONT color=\"white\"><B>최종 수정일</B></TD></font>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( interestInfoTable.get("UPD_DATE"));
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR><TD height=\"5\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_update.gif\" border=\"0\" align=\"absmiddle\" alt=\"수정\" style=\"cursor:hand\" onClick=\"goUpdate();\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_ok.gif\" border=\"0\" align=\"absmiddle\" alt=\"취소\" style=\"cursor:hand\" onClick=\"goList();\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR><TD height=\"20\"></TD></TR>\r\n");
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
