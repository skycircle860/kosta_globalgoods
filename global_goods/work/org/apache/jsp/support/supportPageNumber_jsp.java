/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-05-27 06:05:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.support;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import support.*;
import java.util.*;

public final class supportPageNumber_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      java.util.Hashtable inputTable = null;
      inputTable = (java.util.Hashtable) _jspx_page_context.getAttribute("inputTable", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (inputTable == null){
        inputTable = new java.util.Hashtable();
        _jspx_page_context.setAttribute("inputTable", inputTable, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

	String code = (String)inputTable.get("code");
	System.out.println("inputTable1 : "+inputTable);
	
	SupportInfomation si = new SupportInfomation(code);
	System.out.println("inputTable2 : "+inputTable);

	int pageNum = ((Integer)inputTable.get("pageNum")).intValue();									//사용자가 선택한 페이지 번호
	int pageTotalNum = ((Integer)inputTable.get("pageTotalNum")).intValue();				// 전체 페이지 번호
	int pageStartNum = ((Integer)inputTable.get("pageStartNum")).intValue();				// 시작페이지 번호
	int pageEndNum = ((Integer)inputTable.get("pageEndNum")).intValue();					// 끝페이지 번호

	int articleTotalNum = ((Integer)inputTable.get("articleTotalNum")).intValue();				// 전체 글 수
	int articleStartNum = ((Integer)inputTable.get("articleStartNum")).intValue();				// 시작 글 번호
	int articleEndNum = ((Integer)inputTable.get("articleEndNum")).intValue();				// 끝 글 번호

	String pageType = (String)inputTable.get("pageType");
	String sort = (String)inputTable.get("sort");

	String section = "TC";
	if(inputTable.containsKey("section"))
	{
		section = (String)inputTable.get("section");
	}

	String word = "";
	if(inputTable.containsKey("word"))
	{
		word = (String)inputTable.get("word");
	}

      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("\tfunction goPage(pgNum)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.goPageForm;\r\n");
      out.write("\t\tf.pageNum.value=pgNum;\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<TABLE width=\"750\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
      out.write("\t<TR valign=\"top\">\r\n");
      out.write("\t\t<TD align=\"center\" width=\"750\">\r\n");

	if(articleTotalNum>0)
	{
		if(pageNum > 1)
		{

      out.write("\r\n");
      out.write("\t\t\t<A href=\"javascript:goPage('1')\"><FONT color=\"#7C0722\"><B>처음페이지</B></FONT></A>&nbsp;&nbsp;\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t<FONT color=\"gray\">처음페이지</FONT>&nbsp;&nbsp;\r\n");

		}

      out.write("\r\n");
      out.write("\r\n");

		if(pageStartNum > 1)
		{

      out.write("\r\n");
      out.write("\t\t\t<A href=\"javascript:goPage('");
      out.print( pageStartNum-1);
      out.write("')\"><FONT color=\"#F32957\"><B>이전</B></FONT></A>&nbsp;&nbsp;\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t<FONT color=\"gray\">이전</FONT>&nbsp;&nbsp;\r\n");

		}

      out.write("\r\n");
      out.write("\r\n");

		for(int i=pageStartNum; i<=pageEndNum; i++)
		{
			if(i==pageNum)
			{

      out.write("\r\n");
      out.write("\t\t\t<B><FONT color=\"blue\">");
      out.print( i);
      out.write("</FONT></B>&nbsp;&nbsp;\r\n");

			}
			else
			{

      out.write("\r\n");
      out.write("\t\t\t<A href=\"javascript:goPage('");
      out.print( i);
      out.write("')\">");
      out.print( i);
      out.write("</A>&nbsp;&nbsp;\r\n");

			}
		}

      out.write("\r\n");
      out.write("\r\n");

		if(pageTotalNum > pageEndNum)
		{

      out.write("\r\n");
      out.write("\t\t\t<A href=\"javascript:goPage('");
      out.print( pageEndNum+1);
      out.write("')\"><FONT color=\"#29BA43\"><B>다음</B></FONT></A>&nbsp;&nbsp;\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t<FONT color=\"gray\">다음</FONT>&nbsp;&nbsp;\r\n");

		}

      out.write("\r\n");
      out.write("\r\n");

		if(pageNum < pageTotalNum)
		{

      out.write("\r\n");
      out.write("\t\t\t<A href=\"javascript:goPage('");
      out.print( pageTotalNum);
      out.write("')\"><FONT color=\"#3C6F4A\"><B>끝페이지</B></FONT></A>\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t<FONT color=\"gray\">끝페이지</FONT>\r\n");

		}
	}

      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<FORM name=\"goPageForm\" method=\"post\" action=\"/supportServlet.mo\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"func\" value=\"support_002\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"pageNum\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print( code);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"section\" value=\"");
      out.print( section);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"word\" value=\"");
      out.print( word);
      out.write("\">\r\n");
      out.write("</FORM>");
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
