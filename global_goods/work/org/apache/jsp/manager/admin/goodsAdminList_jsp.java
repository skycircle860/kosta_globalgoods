/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-05 06:34:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import support.*;
import java.util.*;

public final class goodsAdminList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("\tfunction goodsModify(formName)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = eval(\"document.\"+formName);\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t// 사용 or 삭제 하기\r\n");
      out.write("\tfunction goodsDisp_YnUpdate(code, disp_yn)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar alertStr = \"선택하신 상품을 사용하지 못하게 하시겠습니까?\";\r\n");
      out.write("\t\tif(disp_yn=='Y')\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talertStr = \"선택하신 상품을 사용 하시겠습니까?\"; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(confirm(alertStr))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.location.href=\"/managerOrderServlet.mo?func=managerOrder_025&disp_yn=\"+disp_yn+\"&code=\"+code;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<div><!-- 리스트 화면 상단 바 -->\r\n");
      out.write("\t<img src=\"/images/common/t_admin.png\">\r\n");
      out.write("</div>\r\n");
      out.write("<font color=\"#000000\"><span style=\"margin-left:30px;\">현제 페이지 : <A href=\"/goodsServlet.mo?func=goods_001\">홈</A>>관리자페이지</font>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE style=\"margin-left : 50px;\" border=\"0\" cellspacing=\"1\" bgcolor=\"#000000\">\r\n");
      out.write("\t<TR bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t<TD width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\tNo.\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"50\">\r\n");
      out.write("\t\t\t이미지\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"80\">\r\n");
      out.write("\t\t\tCode\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"150\">\r\n");
      out.write("\t\t\t이름\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"50\">\r\n");
      out.write("\t\t\t재고\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"70\">\r\n");
      out.write("\t\t\t원가\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"70\">\r\n");
      out.write("\t\t\t판매가\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"100\">\r\n");
      out.write("\t\t\t버튼\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");

	ArrayList ReturnGoodsSimpleList = (ArrayList)outputTable.get("ReturnGoodsSimpleList");

	Hashtable ReturnGoodsSimpleTable = new Hashtable();
	for (int i = 0; i<ReturnGoodsSimpleList.size(); i++)
	{
		ReturnGoodsSimpleTable = (Hashtable)ReturnGoodsSimpleList.get(i);
		
		String sub_category = (String)ReturnGoodsSimpleTable.get("SUB_CATEGORY");
		String main_category = (String)ReturnGoodsSimpleTable.get("MAIN_CATEGORY");
		String middle_category = (String)ReturnGoodsSimpleTable.get("MIDDLE_CATEGORY");
		String rownum = (String)ReturnGoodsSimpleTable.get("ROWNUM");
		String code = (String)ReturnGoodsSimpleTable.get("CODE");
		String name = (String)ReturnGoodsSimpleTable.get("NAME");
		String goods_amount = (String)ReturnGoodsSimpleTable.get("GOODS_AMOUNT");
		String org_price = (String)ReturnGoodsSimpleTable.get("ORG_PRICE");
		String par_price = (String)ReturnGoodsSimpleTable.get("PAR_PRICE");
		ArrayList file_list = (ArrayList)ReturnGoodsSimpleTable.get("FILE_LIST");

		Hashtable imgTable = (Hashtable)file_list.get(0);
		String path = (String)imgTable.get("PATH");
		String save_name = (String)imgTable.get("SAVE_NAME");

		String disp_yn = (String)ReturnGoodsSimpleTable.get("DISP_YN");

		path = path+"/"+save_name;
		path = path.substring(path.indexOf("upfile"));

		
		String bgcolor = "#FFFFFF";

		if(disp_yn.equals("N"))
		{
			bgcolor = "#666666";
		}


      out.write("\r\n");
      out.write("<FORM name=\"goodsItem");
      out.print(i);
      out.write("\" action=\"/managerOrderServlet.mo\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"func\" value=\"managerOrder_019\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"subcategory\" value=\"");
      out.print(sub_category);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"maincategory\" value=\"");
      out.print(main_category);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"middlecategory\" value=\"");
      out.print(middle_category);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print(code);
      out.write("\">\t\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"disp_yn\" value=\"");
      out.print(disp_yn);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"from\" value=\"simpleList\">\t\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<TR bgcolor=\"");
      out.print( bgcolor);
      out.write("\">\r\n");
      out.write("\t\t<TD width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\t");
      out.print(i);
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(path);
      out.write("\" width=\"50\" height=\"50\">\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"100\" align=\"center\">\r\n");
      out.write("\t\t\t");
      out.print(code);
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"200\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;<b>");
      out.print(name);
      out.write("</b>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\t");
      out.print(goods_amount);
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"70\" align=\"center\">\r\n");
      out.write("\t\t\t");
      out.print(org_price);
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"70\" align=\"center\">\r\n");
      out.write("\t\t\t");
      out.print(par_price);
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD width=\"100\" align=\"center\">\r\n");
      out.write("\t\t\t<DIV class=\"button blue small\" onclick=\"goodsModify('goodsItem");
      out.print(i);
      out.write("')\">수정</DIV>\r\n");

		
		if(disp_yn.equals("Y"))//게시판 사용 비사용 토글
		{

      out.write("\r\n");
      out.write("\t\t\t<DIV class=\"button blue small\" onclick=\"goodsDisp_YnUpdate('");
      out.print( code);
      out.write("', 'N');\">삭제</DIV>\r\n");

		}
		else if(disp_yn.equals("N"))
		{

      out.write("\r\n");
      out.write("\t\t\t<DIV class=\"button blue small\" onclick=\"goodsDisp_YnUpdate('");
      out.print( code);
      out.write("', 'Y')\">사용</DIV>\r\n");

		}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");

	}

      out.write("\r\n");
      out.write("</TABLE>");
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
