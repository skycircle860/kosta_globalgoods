/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-04 23:32:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ReturnOrderInfoList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

		ArrayList ReturnOrderInfoList = (ArrayList)outputTable.get("ReturnOrderInfoList");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write(" //반품정보 업데이트\r\n");
      out.write("\tfunction updateAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.infoForm;\r\n");
      out.write("\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction listAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/managerOrderServlet.mo?func=managerOrder_009\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("<FORM name=\"infoForm\" method=\"post\" action=\"/managerOrderServlet.mo\">\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#74c900\" width=\"550\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#74c900\" width=\"300\" colspan=\"6\">\r\n");
      out.write("\t\t\t\t<FONT color=\"white\" size=\"3\"><B>반품 품목 정보</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("<style>\r\n");
      out.write("  td\r\n");
      out.write("  {\r\n");
      out.write("\t height:25px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" </style>\r\n");
      out.write("\r\n");
      out.write("\t");

	
		Hashtable returnTable = (Hashtable)ReturnOrderInfoList.get(0);
		
		String code = (String)returnTable.get("CODE");
		String orderId = (String)returnTable.get("MEMBER_ID");
		String orderDate = (String)returnTable.get("REQUEST_DATE");
		String name = (String)returnTable.get("NAME");
		String price = (String)returnTable.get("PRICE");
		String state = (String)returnTable.get("RETURN_STATE");
		String returnComment = (String)returnTable.get("RETURN_COMMENT");
		String bankname = (String)returnTable.get("BANKNAME");
		String midname = (String)returnTable.get("MIDNAME");
		String subname = (String)returnTable.get("SUBNAME");
		String addr1 = (String)returnTable.get("ADDR1");
		String addr2 = (String)returnTable.get("ADDR2");
		String zipcode1 = (String)returnTable.get("ZIPCODE1");
		String zipcode2 = (String)returnTable.get("ZIPCODE2");
		String home1 = (String)returnTable.get("HOME1");
		String home2 = (String)returnTable.get("HOME2");
		String home3 = (String)returnTable.get("HOME3");
		String office1 = (String)returnTable.get("OFFICE1");
		String office2 = (String)returnTable.get("OFFICE2");	 
		String office3 = (String)returnTable.get("OFFICE3");
		String mobile1 = (String)returnTable.get("MOBILE1");
		String mobile2 = (String)returnTable.get("MOBILE2");
		String mobile3 = (String)returnTable.get("MOBILE3");
		String returnDate = (String)returnTable.get("RETURN_GOODS_DATE");
		String refundDate = (String)returnTable.get("REFUND_DATE");
		String goodsquantity = (String)returnTable.get("GOODS_AMOUNT");

		String account = (String)returnTable.get("ACCOUNT_NUM");
		String goodsGroup = (String)returnTable.get("GOODS_GROUP");



	
		String useState ="";

		if(state.equals("E"))
		{
			useState="반품요청";
		}
		else if(state.equals("T"))
		{
			useState="반품확인";
		}
		else if(state.equals("B"))
		{
			useState="반품완료";
		}

		else if(state.equals("F"))
		{
			useState="환불완료";
		}

		String maincategory = "";
		
		if(goodsGroup.startsWith("F"))
		{
			maincategory ="식품";
			System.out.println("maintest=="+maincategory);

		}

		 if(goodsGroup.startsWith("E"))
		{
			maincategory ="잡화";
			System.out.println("maintest=="+maincategory);
		} 



      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"4\" bgcolor=\"white\" width=\"550\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name =\"code\" value=\"");
      out.print(code);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name =\"func\" value=\"managerOrder_021\">\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>주문자 ID</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" colspan=\"7\">");
      out.print( orderId);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>반품신청날짜</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">");
      out.print( orderDate);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>상품 이름</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">");
      out.print( name);
      out.write("&nbsp;(");
      out.print(maincategory);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(midname);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(subname);
      out.write(")</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>상품 가격</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\"  align=\"left\" colspan=\"7\">");
      out.print(price);
      out.write(' ');
      out.write('(');
      out.print(goodsquantity);
      out.write("개)</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>주문자 주소</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">(");
      out.print(zipcode1);
      out.write('-');
      out.print(zipcode2);
      out.write(") &nbsp;");
      out.print(addr1);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(addr2);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>휴대폰 번호</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">\r\n");

	if(!mobile1.equals("000"))
	{

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( mobile1);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( mobile2);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( mobile3);
      out.write('\r');
      out.write('\n');

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t\t\t<FONT color='red'>미입력</FONT>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>집 전화번호</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">\r\n");

	if(!home1.equals("000"))
	{

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( home1);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( home2);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( home3);
      out.write('\r');
      out.write('\n');

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t\t\t<FONT color='red'>미입력</FONT>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>사무실 번호</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">\r\n");

	if(!office1.equals("000"))
	{

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( office1);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( office2);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( office3);
      out.write('\r');
      out.write('\n');

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t\t\t<FONT color='red'>미입력</FONT>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t</TD>\t\t\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>계좌번호</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" align=\"left\" colspan=\"7\">(");
      out.print(bankname);
      out.write(')');
      out.print(account);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>환불여부</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" align=\"left\" colspan=\"7\">\r\n");
      out.write("\t\t\t물품확인\r\n");
      out.write("\t\t\t<INPUT value=\"T\" type=\"radio\"  name=\"state\" \r\n");
      out.write("\t\t\t");
if(state.equals("T")){
      out.write("checked");
}
      out.write("> \r\n");
      out.write("\r\n");
      out.write("\t\t\t반품완료\r\n");
      out.write("\t\t\t<INPUT value=\"B\" type=\"radio\"  name=\"state\" \r\n");
      out.write("\t\t\t");
if(state.equals("B")){
      out.write("checked");
}
      out.write("> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t환불완료 \r\n");
      out.write("\t\t\t<INPUT value=\"F\" type=\"radio\" name=\"state\" \r\n");
      out.write("\t\t\t");
if(state.equals("F")){
      out.write("checked");
}
      out.write("></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\" >\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>주문상태</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" >");
      out.print(useState);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD  width=\"100\"><font color=\"white\"><B>반품사유</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" colspan=\"7\">");
      out.print(returnComment);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>부가요청</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" colspan=\"7\">");
      out.print(returnComment);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>반품날짜</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" colspan=\"3\">");
      out.print(returnDate);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD width=\"100\"><font color=\"white\"><B>환불날짜</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"100\" align=\"left\" colspan=\"3\">");
      out.print(refundDate);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t</TABLE> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"3\" width=\"750\" >\r\n");
      out.write("\t\t<TR><TD height=\"5\"></TD></TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/Update.png\" border=\"0\" onclick=\"updateAction();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/List.png\" border=\"0\" onclick=\"listAction();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/Delete.png\" border=\"0\" onclick=\"checkAction();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR><TD height=\"3\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR><TD height=\"20\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t</FORM>\r\n");
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
