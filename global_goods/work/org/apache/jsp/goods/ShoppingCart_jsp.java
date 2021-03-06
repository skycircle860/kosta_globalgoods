/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-05 05:46:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ShoppingCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList shoppingCartList = (ArrayList)outputTable.get("shoppingCartList");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("\t//결재금액 계산\r\n");
      out.write("\tfunction resumePrice(amount, parPrice, totalPrice)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.shoppingCart;\r\n");
      out.write("\t\tvar amountVal = amount.value;\r\n");
      out.write("\t\tvar parPriceVal = parPrice.innerText;\r\n");
      out.write("\t\ttotalPrice.innerText = amountVal * parPriceVal;\r\n");
      out.write("\t\tvar totalPriceVal = totalPrice.innerText;\r\n");
      out.write("\r\n");
      out.write("\t\tvar chklen = f.checkItem.length;\r\n");
      out.write("\r\n");
      out.write("\t\tvar sum = 0;\r\n");
      out.write("\r\n");
      out.write("\t\tfor(var i = 0; i<chklen; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(document.getElementsByName(\"checkItem\")[i].checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar totalPrice_sum = document.getElementById(\"totalPrice\"+i);\r\n");
      out.write("\t\t\t\tvar totalPrice_value= totalPrice_sum.innerText;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tsum = sum + Number(totalPrice_value)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar wholPrice = document.getElementById(\"wholPrice\");\r\n");
      out.write("\t\twholPrice.innerText = insertComma(sum);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction deleteAction(code)\r\n");
      out.write("\t{\r\n");
      out.write("\t//\tvar f = document.shoppingCart;\r\n");
      out.write("\t//\tf.code.value = code;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.location.href=\"/goodsServlet.mo?func=goods_006&code=\"+code;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction buyAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t//체크박스의 갯수를 변수에 담는다.\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar f = document.shoppingCart;\r\n");
      out.write("\t\tvar chklen = f.checkItem.length;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar flag = true;\r\n");
      out.write("\t\t//체크박스 갯수만큼 for 문을 돌려 체크된 넘의 value값을 가져온다.\r\n");
      out.write("\t\tfor(var i = 0; i<chklen; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar f = document.shoppingCart;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar amount = f.amount[i].value;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar code = document.getElementsByName(\"checkItem\")[i].value;\r\n");
      out.write("\t\t\tdocument.getElementsByName(\"checkItem\")[i].value = amount + code;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(document.getElementsByName(\"checkItem\")[i].checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\t//alert(flag);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (flag)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tf.func.value = \"goods_003\";\r\n");
      out.write("\t\t\tf.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"구매하실 상품을 선택해 주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//체크박스 전체선택\r\n");
      out.write("\tfunction allCheck()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.shoppingCart;\r\n");
      out.write("\t\tvar check = true;\r\n");
      out.write("\t\tif (f.selectAll.checked ==true)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcheck = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcheck = false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar chklen = f.checkItem.length;\r\n");
      out.write("\r\n");
      out.write("\t\t// 체크박스 갯수만큼 for 문을 돌려 체크된 넘의 value값을 가져온다.\r\n");
      out.write("\t\tfor(i=0; i<chklen; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tf.checkItem[i].checked = check;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//상품 상세보기\r\n");
      out.write("\tfunction viewAction(code)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href = \"/goodsServlet.mo?func=goods_002&code=\"+code;\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<div><!-- 관심상품 화면 상단 바 -->\r\n");
      out.write("\t<img src=\"/images/cart_wish/t_cart.png\">\r\n");
      out.write("</div>\r\n");
      out.write("<span style=\"margin-left:30px;\">현재 페이지 : <A href=\"/goodsServlet.mo?func=goods_001\">홈</A>>장바구니\r\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr><td colspan=\"2\" height=\"20\"></td></tr>\r\n");
      out.write("\t<tr> \r\n");
      out.write("\t\t<td width=\"10\"><img src=\"/images/common/bul_02_01.gif\"></td>\r\n");
      out.write("\t\t<td class=\"font16_title\"><font color=\"333333\"><B>장바구니</B></font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr color=\"#eeeeee\" noshade>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"cartWrap\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD>\r\n");
      out.write("\t\t\t<TABLE width=\"900\" cellspacing=\"0\" >\r\n");
      out.write("\t\t\t\t<FORM name=\"shoppingCart\" method=\"POST\" action=\"goodsServlet.mo\">\r\n");
      out.write("\t\t\t\t<INPUT type=\"hidden\" name=\"from\" value=\"cart_list\">\r\n");
      out.write("\t\t\t\t<INPUT type=\"hidden\" name = \"func\" value=\"goods_003\">\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=\"30px\" bgcolor=\"#eeeeee\" height= \"40px\"  style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0;\"><INPUT type=\"checkbox\" name=\"selectAll\" id=\"selectAll\" onclick=\"allCheck();\" checked></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">상품 이미지</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"200px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">상품명</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">수량</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">단품 가격</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">구매 금액</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100px\" bgcolor=\"#eeeeee\" height= \"40px\" style=\"border-bottom: 1px solid #c0c0c0;border-top: 1px solid #c0c0c0\">삭제</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");

	if (shoppingCartList.size() == 0)
	{

      out.write("\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD colspan=\"7\" align=\"center\" valign=\"middle\" height=\"50\"> 장바구니에 등록된 물품이 없습니다.</TD>\r\n");
      out.write("\t\t</TR>\r\n");

	}
	else
	{

		int wholPrice = 0;
		for (int i = 0; i < shoppingCartList.size(); i++)
		{
			Hashtable goodsTable = (Hashtable)shoppingCartList.get(i);

			String id = (String)goodsTable.get("MEMBER_ID");
			String code = (String)goodsTable.get("GOODS_CODE");
			String input_amount = (String)goodsTable.get("SELECT_GOODS_AMOUNT");//입력한 양
			String amount = (String)goodsTable.get("GOODS_AMOUNT");//재고양
			String parPrice = (String)goodsTable.get("PAR_PRICE");//판매가


			ArrayList img_list = (ArrayList)goodsTable.get("FILE_LIST");
			Hashtable img_table = (Hashtable)img_list.get(0);

			String imgPath = (String)img_table.get("PATH");
			String imgName = (String)img_table.get("SAVE_NAME");
			String img = imgPath + "/" + imgName;
			System.out.println("img : "+img);
			img = img.substring(img.indexOf("upfile"));
			System.out.println(img);
			String goods_name = (String)goodsTable.get("GOODS_NAME");
			
			String amountKo = "";
			String country = (String)goodsTable.get("COUNTRY");
			String comment = (String)goodsTable.get("GOODS_COMMENT");

			int totalPrice = Integer.parseInt(input_amount) * Integer.parseInt(parPrice);
			wholPrice = wholPrice + totalPrice;
			if (amount.equals("0"))
			{
				amountKo = "품절";
			}
			else
			{
				amountKo = "재고있음";
			}

      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<INPUT type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print(code);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<INPUT type=\"hidden\" name=\"input_amount\" value=\"");
      out.print(input_amount);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<INPUT type=\"hidden\" name=\"img\" value=\"");
      out.print(img);
      out.write("\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- <TR>\r\n");
      out.write("\t\t\t\t\t<TD align=\"center\"><INPUT class=\"checkboxSelect\" type=\"checkbox\" name=\"checkItem\" value=\"");
      out.print(i);
      out.write("\" checked></TD>\r\n");
      out.write("\t\t\t\t\t<TD><img src=");
      out.print(img);
      out.write(" width=\"100\" height=\"100\" onclick=\"viewAction('");
      out.print(code);
      out.write("')\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD><a href=\"javascript:viewAction('");
      out.print(code);
      out.write("')\">");
      out.print(goods_name);
      out.write("</a></TD>\r\n");
      out.write("\t\t\t\t\t<TD><INPUT type=\"text\" name=\"amount");
      out.print(i);
      out.write("\" value = ");
      out.print(input_amount);
      out.write(" size=\"1\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD><SPAN id=\"parPrice");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(parPrice);
      out.write("</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t<TD><SPAN id=\"totalPrice");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(totalPrice);
      out.write("</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=\"center\"><a href=\"JavaScript:deleteAction('");
      out.print(code);
      out.write("');\"><img src=\"/images/cart_wish/cart_bt_seldel.gif\" border=\"0\"></a></TD>\r\n");
      out.write("\t\t\t\t</TR> -->\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD><INPUT type=\"checkbox\" name=\"checkItem\" value=\"");
      out.print(code);
      out.write("\" onclick=\"resumePrice(amount");
      out.print(i);
      out.write(", parPrice");
      out.print(i);
      out.write(", totalPrice");
      out.print(i);
      out.write(");\" checked></TD>\r\n");
      out.write("\t\t\t\t\t<TD><img src=");
      out.print(img);
      out.write(" width=\"100\" height=\"100\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD>");
      out.print(goods_name);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t<TD><INPUT type=\"text\" name=\"amount\" id=\"amount");
      out.print(i);
      out.write("\" value = ");
      out.print(input_amount);
      out.write(" size=\"1\" onkeyup=\"resumePrice(amount");
      out.print(i);
      out.write(", parPrice");
      out.print(i);
      out.write(", totalPrice");
      out.print(i);
      out.write(");\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD><SPAN id=\"parPrice");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(parPrice);
      out.write("</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t<TD><SPAN id=\"totalPrice");
      out.print(i);
      out.write("\" name=\"totalPrice");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(totalPrice);
      out.write("</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t<TD><INPUT type=\"button\" value=\"delete\" onclick=\"deleteAction('");
      out.print(code);
      out.write("');\"></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<TR bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t\t\t<TD colspan=\"7\" height=\"5\"></TD>\r\n");
      out.write("\t\t\t</TR>\r\n");

		}

      out.write("\r\n");
      out.write("\t\t\t\t<TR bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t\t\t\t<TD width=\"100\"></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"700\" colspan=\"6\" height=\"50\" valign=\"middle\" align=\"right\"><img src=\"/images/cart_wish/total.png\" height=\"50\" width=\"200\" ><SPAN id=\"wholPrice\" name=\"wholPrice\">");
      out.print(wholPrice);
      out.write("</SPAN>&nbsp;</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD colspan=\"7\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/commonServlet.mo\"><img src=\"/images/cart_wish/cart_bt_goshopping.gif\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"JavaScript:buyAction();\"><img src=\"/images/cart_wish/cart_bt_order.gif\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t<TR bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t\t\t\t<TD colspan=\"7\" height=\"10\"></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");

	}

      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</FORM>\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
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
