/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-05 01:31:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class MiddleCategoryInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList MiddleInfoList = (ArrayList)outputTable.get("MiddleInfoList");
	Hashtable categoryTable = (Hashtable)MiddleInfoList.get(0);

	//String from = (String)inputTable.get("from");

	String code = (String)categoryTable.get("CODE");
	String useYn = (String)categoryTable.get("USEYN");
	String maincategory = (String)categoryTable.get("MAIN_CATEGORY");
	String name = (String)categoryTable.get("NAME");

	String useMainText = "";
	if(maincategory.equals("F"))
	{
		useMainText ="식품";
	}
	else
	{
		useMainText="잡화";
	}

	
	
	String useKor = "사용중";
	if(useYn.equals("N"))
	{
		useKor = "미사용";
	}

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  td\r\n");
      out.write("  {\r\n");
      out.write("\t height:25px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" </style>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\t// 직업 목록 페이지 가기\r\n");
      out.write("\tfunction goList()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/managerOrderServlet.mo?func=managerOrder_005\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 직업 수정 취소 버튼\r\n");
      out.write("\tfunction cancelAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/managerOrderServlet.mo?func=managerOrder_005\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 직업 수정\r\n");
      out.write("\tfunction updateAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"adsf\");\r\n");
      out.write("\t\tvar f = document.infoForm;\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#74c900\" width=\"250\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#74c900\" width=\"250\">\r\n");
      out.write("\t\t\t\t<FONT color=\"white\" size=\"3\"><B><FONT color=\"#183265\">품목 상세정보</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"600\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"right\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/button_all_list.gif\" border=\"0\" onclick=\"goList();\" style=\"cursor:hand\" align=\"absmiddle\" onClick=\"goList();\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR><TD height=\"3\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"4\" bgcolor=\"#74c900\" width=\"600\">\r\n");
      out.write("\t\t<FORM name=\"infoForm\" method=\"post\" action=\"/managerOrderServlet.mo\" onSubmit=\"updateAction(); return false;\">\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"func\" value=\"managerOrder_012\">\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print( code);
      out.write("\">\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"yn\" value=\"");
      out.print( useYn);
      out.write("\">\r\n");
      out.write("\t\t\t<INPUT type=\"hidden\" name=\"name\" value=\"");
      out.print( name);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD width=\"150\" bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">CODE</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( code);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">상품 분류</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( useMainText);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">NAME</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( name);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">사용 여부</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( useKor);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">작성자 (IP)</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( categoryTable.get("REG_ID"));
      out.write(' ');
      out.write('(');
      out.print( categoryTable.get("REG_IP"));
      out.write(")</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">작성일</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( categoryTable.get("REG_DATE"));
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">최종 수정자 (IP)</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( categoryTable.get("UPD_ID"));
      out.write(' ');
      out.write('(');
      out.print( categoryTable.get("UPD_IP"));
      out.write(")</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><B><FONT color=\"#183265\">최종 수정일</FONT></B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\">&nbsp;&nbsp;");
      out.print( categoryTable.get("UPD_DATE"));
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</FORM>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR><TD height=\"5\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_update.gif\" border=\"0\" align=\"absmiddle\" alt=\"수정\" style=\"cursor:hand\" onClick=\"updateAction();\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_cancel1.gif\" border=\"0\" align=\"absmiddle\" alt=\"취소\" style=\"cursor:hand\" onClick=\"cancelAction();\">\r\n");
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
