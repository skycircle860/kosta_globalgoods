/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-04 05:49:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manager.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class UserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ArrayList interestList = (ArrayList)outputTable.get("interestList");

	ArrayList userInfoList = (ArrayList)outputTable.get("userInfoList");
	Hashtable userInfoTable = (Hashtable)userInfoList.get(0);
	String id = (String)userInfoTable.get("ID");
	String pass = (String)userInfoTable.get("PASS");
	String name = (String)userInfoTable.get("NAME");
	String passQ_code = (String)userInfoTable.get("PASS_Q");
	String passA = (String)userInfoTable.get("PASS_A");
	String jumin1 = (String)userInfoTable.get("JUMIN1");
	String home1 = (String)userInfoTable.get("HOME1");
	String home2 = (String)userInfoTable.get("HOME2");
	String home3 = (String)userInfoTable.get("HOME3");
	String office1 = (String)userInfoTable.get("OFFICE1");
	String office2 = (String)userInfoTable.get("OFFICE2");
	String office3 = (String)userInfoTable.get("OFFICE3");
	String mobile1 = (String)userInfoTable.get("MOBILE1");
	String mobile2 = (String)userInfoTable.get("MOBILE2");
	String mobile3 = (String)userInfoTable.get("MOBILE3");
	String zipCode1 = (String)userInfoTable.get("ZIPCODE1");
	String zipCode2 = (String)userInfoTable.get("ZIPCODE2");
	String addr1 = (String)userInfoTable.get("ADDR1");
	String addr2 = (String)userInfoTable.get("ADDR2");
	String email = (String)userInfoTable.get("EMAIL");
	String interest = (String)userInfoTable.get("INTEREST");
	String useYn = (String)userInfoTable.get("USEYN");
	String adminYn = (String)userInfoTable.get("ADMINYN");
	String regId = (String)userInfoTable.get("REG_ID");
	String regDate = (String)userInfoTable.get("REG_DATE");
	String regIp = (String)userInfoTable.get("REG_IP");
	String updId = (String)userInfoTable.get("UPD_ID");
	String updDate = (String)userInfoTable.get("UPD_DATE");
	String updIp = (String)userInfoTable.get("UPD_IP");
	/*
	if (passQ.equals("001"))
	{
		passQ = "기억에 남는 추억의 장소는?";
	}
	else if (passQ.equals("002"))
	{
		passQ = "자신의 인생 좌우명은?";
	}
	else if (passQ.equals("003"))
	{
		passQ = "자신의 보물 제 1호는?";
	}
	else if (passQ.equals("004"))
	{
		passQ = "가장 기억에 남는 선생님 성함은?";
	}
	else if (passQ.equals("005"))
	{
		passQ = "타인이 모르는 자신만의 신체 비밀이 있다면?";
	}
	else if (passQ.equals("006"))
	{
		passQ = "추억하고 싶은 날짜가 있다면?";
	}
	else if (passQ.equals("007"))
	{
		passQ = "받았던 선물 중 기억에 남는 독특한 선물은?";
	}
	else if (passQ.equals("008"))
	{
		passQ = "가장 친한 친구의 이름은?";
	}
	else if (passQ.equals("009"))
	{
		passQ = "인상 깊게 읽은 책 이름은?";
	}
	else if (passQ.equals("010"))
	{
		passQ = "읽은 책 중에서 좋아하는 구절이 있다면?";
	}
	else if (passQ.equals("011"))
	{
		passQ = "자신이 두번째로 존경하는 인물은?";
	}
	else if (passQ.equals("012"))
	{
		passQ = "친구들에게 공개하지 않은 어릴 적 별명이 있다면?";
	}
	else if (passQ.equals("013"))
	{
		passQ = "초등학교 때 기억에 남는 짝꿍 이름은?";
	}
	else if (passQ.equals("014"))
	{
		passQ = "다시 태어나면 되고 싶은 것은?";
	}
	else if (passQ.equals("015"))
	{
		passQ = "내가 좋아하는 캐릭터는?";
	}
*/


	String userType = "일반회원";
	String adminLink = "<A href='/managerUserServlet.mo?func=managerUser_006&id="+id+"&yn=Y'>관리자로 지정</A>";
	if(adminYn.equals("Y"))
	{
		userType = "관리자";
		adminLink = "<A href='/managerUserServlet.mo?func=managerUser_006&id="+id+"&yn=N'>일반회원으로 지정</A>";
	}

	String useState = "사용중";
	if(useYn.equals("N"))
	{
		useState = "미사용";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("\t// 목록페이지 가기\r\n");
      out.write("\tfunction goList()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/managerUserServlet.mo?func=managerUser_001\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 사용자 탈퇴 YN\r\n");
      out.write("\tfunction goUseYn(yn)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href='/managerUserServlet.mo?func=managerUser_005&from=info&id=");
      out.print( id);
      out.write("&yn='+yn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 정보수정 페이지 가기\r\n");
      out.write("\tfunction goUpdate()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href='/managerUserServlet.mo?func=managerUser_003&id=");
      out.print( id);
      out.write("&from=info';\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"25\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#74c900\" width=\"700\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\" bgcolor=\"#74c900\" width=\"700\">\r\n");
      out.write("\t\t\t\t<FONT color=\"white\" size=\"3\"><B>회원 상세 정보</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<TABLE cellspacing=\"1\" cellpadding=\"5\" bgcolor=\"#74c900\" width=\"700\">\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD width=\"100\" bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>I D</B></TD>\r\n");
      out.write("\t\t\t<TD width=\"250\" bgcolor=\"#FFFFFF\">");
      out.print( id);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD width=\"100\" bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>이 름</B></TD>\r\n");
      out.write("\t\t\t<TD width=\"250\" bgcolor=\"#FFFFFF\">");
      out.print( name);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>비밀번호<BR>확인시 질문</B>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t");

						ArrayList passQList = (ArrayList)outputTable.get("passQList");
						for(int i = 0 ; i<passQList.size(); i++)
						{
							Hashtable passQTable = (Hashtable)passQList.get(i);
							String code = (String)passQTable.get("CODE");
							String passQ = (String)passQTable.get("PASS_Q");
							if(code.equals(passQ_code))
							{
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(passQ);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
						}
					
      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>비밀번호<BR>확인시 답변</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" width=\"300\" colspan=\"3\">");
      out.print(passA);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD width=\"100\" bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>사용여부</B></TD>\r\n");
      out.write("\t\t\t<TD width=\"250\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t");
      out.print( useState);
      out.write("&nbsp;&nbsp;&nbsp;\r\n");

		if(useYn.equals("Y"))
		{

      out.write("\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/sbut_delete.gif\" align=\"absmiddle\" border=\"0\" style=\"cursor:hand\" onClick=\"goUseYn('N');\">\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/sbut_use.gif\" align=\"absmiddle\" border=\"0\" style=\"cursor:hand\" onClick=\"goUseYn('Y');\">\r\n");

		}

      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD width=\"100\" bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>회원유형</B></TD>\r\n");
      out.write("\t\t\t<TD width=\"250\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t");
      out.print( userType);
      out.write("&nbsp;&nbsp;<FONT color=\"blue\"><B>");
      out.print( adminLink);
      out.write("</B></FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>PASS</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( pass);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>주민등록번호</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( jumin1);
      out.write(" - *******</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>휴대 전화</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">\r\n");

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
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>이메일</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">\r\n");

	if(!email.equals("empty"))
	{

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( email);
      out.write('\r');
      out.write('\n');

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t\t\t<FONT color='red'>미입력</FONT>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>집 전화</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">\r\n");

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
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>직장 전화</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">\r\n");

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
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>주 소</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t(");
      out.print( zipCode1);
      out.write('-');
      out.print( zipCode2);
      out.write(')');
      out.write(' ');
      out.print( addr1);
      out.write(' ');
      out.print( addr2);
      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>관심 상품</B></TD>\r\n");
      out.write("\t\t\t\t<TD bgcolor=\"#FFFFFF\" colspan=\"3\">\r\n");

	int interestCount = 0;
	String interestName = "";
	if(!interest.equals("empty"))
	{
		for(int i=0; i<interestList.size(); i++)
		{
			Hashtable interestTable = (Hashtable)interestList.get(i);
			String code = (String)interestTable.get("CODE");
			if(interest.indexOf(code) != -1)
			{
				interestCount++;
				if(interestCount > 1)
				{
					interestName = interestName + ", ";
				}

				interestName = interestName + interestTable.get("NAME");
			}
		}
	}
	else
	{
		interestName = "<FONT color='red'>미입력</FONT>";
	}

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( interestName);
      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>가입자</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( regId);
      out.write('(');
      out.print( regIp);
      out.write(")</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>가입일시</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( regDate);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>최종수정자</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( updId);
      out.write('(');
      out.print( updIp);
      out.write(")</TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#74c900\" align=\"center\"><font color=\"white\"><B>수정일시</B></TD>\r\n");
      out.write("\t\t\t<TD bgcolor=\"#FFFFFF\">");
      out.print( updDate);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"700\">\r\n");
      out.write("\t\t<TR><TD height=\"10\"></TD></TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_list.gif\" border=\"0\" onclick=\"goList();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/but_update.gif\" border=\"0\" onclick=\"goUpdate();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
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