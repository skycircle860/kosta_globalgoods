/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-05 06:25:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.conf.*;
import java.util.*;

public final class adminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

System.out.println("adminPage도착");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"admin_wrap\">\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_001\">\r\n");
      out.write("\t\t<div class=\"button red\" style=\"margin-left:30px; margin-top:50px\">주문조회관리</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_009\">\r\n");
      out.write("\t\t<div class=\"button rosy\" style=\"margin-left:30px; margin-top:50px\">반품관리</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_024\">\r\n");
      out.write("\t\t<div class=\"button blue\" style=\"margin-left:30px; margin-top:50px\">상품관리</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_003\">\r\n");
      out.write("\t\t<div class=\"button white\" style=\"margin-left:30px; margin-top:50px\">상품등록</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_005\">\r\n");
      out.write("\t\t<div class=\"button orange\" style=\"margin-left:30px; margin-top:50px\">품목 추가/제거\t</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerOrderServlet.mo?func=managerOrder_008\">\r\n");
      out.write("\t\t<div class=\"button black\" style=\"margin-left:30px; margin-top:50px\">카테고리 추가/제거</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerUserServlet.mo?func=managerUser_001\">\r\n");
      out.write("\t\t<div class=\"button gray\" style=\"margin-left:30px; margin-top:50px\">사용자관리</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerSupportServlet.mo?func=managerSupport_001\">\r\n");
      out.write("\t\t<div class=\"button pink\" style=\"margin-left:30px; margin-top:50px\">게시판관리</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"/managerInterestServlet.mo?func=managerInterest_001\">\r\n");
      out.write("\t\t<div class=\"button green\" style=\"margin-left:30px; margin-top:50px\">(회원가입용)관심상품관리 리스트</div>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("</div>");
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
