/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-04 23:45:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Cancle1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

			System.out.println("Cancle1.jsp 진입. =====");
		
		String code = (String)outputTable.get("code");

		System.out.println("Cancle1.jsp =====");
			


      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction myInfopageGo()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.location.href=\"/memberServlet.mo?func=member_014\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction cancleUpdateAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"주문이 취소되었습니다.\");\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar f = document.cancleForm;\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("function Limit(obj)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar maxLength = parseInt(obj.getAttribute(\"maxlength\"));\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(obj.value.length > maxLength)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\talert(\"내용은 25자를 초과할 수 없습니다. 초과된 내용은 삭제됩니다.\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tobj.value = obj.value.substring(0,maxLength);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("<FORM name=\"cancleForm\" action =\"/memberServlet.mo\" >\r\n");
      out.write("<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print(code);
      out.write("\">\r\n");
      out.write("<INPUT type=\"hidden\" name=\"from\" value=\"cancle1\">\r\n");
      out.write("<INPUT type=\"hidden\" name=\"func\" value=\"member_016\">\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#FFFFFF\" width=\"700\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#74c900\" width=\"700\" colspan=\"6\">\r\n");
      out.write("\t\t\t\t<FONT color=\"white\" size=\"3\"><B>주문 취소</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\">\r\n");
      out.write("\t\t\t<IMG src=\"/images/button/List.png\" onclick=\"myInfopageGo()\"><IMG src=\"/images/button/List.png\" onclick=\"\">\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"4\" bgcolor=\"#74c900\" width=\"700\">\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"200\" height=\"30\"><B><FONT color=\"white\">취소 사유를 적어주세요 (25자 이내로)</B>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TR ><TD > \r\n");
      out.write("\t\t\t<textarea name=\"comment\"   cols=\"80\" rows=\"5\" maxlength=\"25\" onblur=\"Limit(this)\"></textarea></TD></TR>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--\t -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD><IMG src=\"/images/button/ok.png\" onclick=\"cancleUpdateAction()\" style=\"cursor:hand\">&nbsp;&nbsp;<IMG src=\"/images/button/cancle.png\" onclick=\"\" style=\"cursor:hand\"></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</FORM>\t \r\n");
      out.write("\r\n");
      out.write("</CENTER>\r\n");
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
