/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-06-05 06:08:35 UTC
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

public final class supportList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");

	boolean loginYn = false;
	boolean adminYn = false;
	if(session != null && session.getAttribute("loginYn")!=null && ((String)session.getAttribute("loginYn")).equals("Y"))
	{
		loginYn = true;
	}
	if(loginYn && ((String)session.getAttribute("adminYn")).equals("Y"))
	{
		adminYn = true;
	}

	String code = (String)inputTable.get("code");
////////////////////////////////////////////////////
	SupportInfomation si = new SupportInfomation(code);
	String bbsName = si.getName();

	Integer pageNum = (Integer)inputTable.get("pageNum");

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

	ArrayList supportViewList = (ArrayList)outputTable.get("supportViewList");

	Integer pageTotalNum = (Integer)inputTable.get("pageTotalNum");
	Integer articleTotalNum = (Integer)inputTable.get("articleTotalNum");
	String startNum = "";
	String endNum = "";
	if(supportViewList.size()>0)
	{
		startNum = (String)((Hashtable)supportViewList.get(0)).get("DISP_NUM");
		endNum = (String)((Hashtable)supportViewList.get(supportViewList.size()-1)).get("DISP_NUM");
	}
////////////////////////////////////////

	String perPage = (String)outputTable.get("perPage");


      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\t// 글쓰기 페이지 가기\r\n");
      out.write("\tfunction goWrite()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.location.href=\"/supportServlet.mo?func=support_003&code=");
      out.print( code);
      out.write("\";\r\n");
      out.write("\t}\r\n");
      out.write("\t// 해당 글 보기(title 클릭시 글보기)\r\n");
      out.write("\tfunction viewAction(seq, hit)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.bbsForm;\r\n");
      out.write("\t\tf.func.value = \"support_005\";\r\n");
      out.write("\t\tf.seq.value = seq;\r\n");
      out.write("\t\tf.hit.value= hit;\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t// 검색\r\n");
      out.write("\tfunction searchAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f1 = document.wordSearchForm;\r\n");
      out.write("\t\tvar f2 = document.bbsForm;\r\n");
      out.write("\t\tif(trim(f1.word.value) == \"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twindow.alert(\"검색어를 입력하세요.\");\r\n");
      out.write("\t\t\tf1.word.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tf2.func.value = \"support_002\";\r\n");
      out.write("\t\tf2.pageNum.value = \"1\";\r\n");
      out.write("\t\tf2.section.value = f1.section.value;\r\n");
      out.write("\t\tf2.word.value = trim(f1.word.value);\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tf2.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t//페이지당 글 수변경\r\n");
      out.write("\tfunction ChangePerPage()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f1 = document.wordSearchForm;\r\n");
      out.write("\t\tvar f2 = document.bbsForm;\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\tf2.func.value = \"support_002\";\r\n");
      out.write("\t\tf2.pageNum.value = \"1\";\r\n");
      out.write("\t\tf2.perPage.value = f1.perPage.value;\r\n");
      out.write("\r\n");
      out.write("\t\t//alert(f2.perPage.value);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tf2.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 전체보기\r\n");
      out.write("\tfunction allSearchAction()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.bbsForm;\r\n");
      out.write("\r\n");
      out.write("\t\tf.func.value = \"support_002\";\r\n");
      out.write("\t\tf.section.value = \"TC\";\r\n");
      out.write("\t\tf.word.value = \"\";\r\n");
      out.write("\t\tf.pageNum.value = \"1\";\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 파일 다운로드\r\n");
      out.write("\tfunction fileDownloadAction(svPath, svName, ogName)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar f = document.fileDownloadForm;\r\n");
      out.write("\t\tf.savePath.value = svPath;\r\n");
      out.write("\t\tf.saveName.value = svName;\r\n");
      out.write("\t\tf.orgName.value = ogName;\r\n");
      out.write("\t\tf.submit();\r\n");
      out.write("\t\t//Filedownload.jsp로 직접 연결되는 값\r\n");
      out.write("\t\t//FileDownload.jsp에선 어떤 파일이던 다운로드 하도록 Content-Type이 설정되어 있다.\r\n");
      out.write("\t\t//넘겨받은 주소및 이름으로 파일 전송\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div><!-- 리스트 화면 상단 바 -->\r\n");
      out.write("\t<img src=\"/images/support/t_support.png\">\r\n");
      out.write("</div>\r\n");
      out.write("<span style=\"margin-left:30px;\">현제 페이지 : <A href=\"/goodsServlet.mo?func=goods_001\">홈</A>>고객센터\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FORM name=\"bbsForm\" action=\"/supportServlet.mo\" method=\"post\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"func\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"seq\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"hit\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"perPage\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"code\" value=\"");
      out.print( code);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"section\" value=\"");
      out.print( section);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"word\" value=\"");
      out.print( word);
      out.write("\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"pageNum\" value=\"");
      out.print( pageNum);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("<FORM name=\"fileDownloadForm\" action=\"/common/FileDownload.jsp\" method=\"post\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"savePath\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"saveName\">\r\n");
      out.write("\t<INPUT type=\"hidden\" name=\"orgName\">\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("<!-- 게시판 제목 -->\r\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr><td colspan=\"2\" height=\"8\"></td></tr>\r\n");
      out.write("\t<tr> \r\n");
      out.write("\t\t<td width=\"10\"><img src=\"/images/common/bul_02_01.gif\"></td>\r\n");
      out.write("\t\t<td class=\"font16_title\"><font color=\"#666666\"><B>");
      out.print( bbsName);
      out.write("</B></font></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr color=\"#eeeeee\" noshade>\r\n");
      out.write("\r\n");
      out.write("<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<TR><TD height=\"15\"></TD></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<!-- 게시판 목록 출력 -->\r\n");
      out.write("<CENTER>\r\n");
      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"750\">\r\n");
      out.write("\t\t<TR valign=\"bottom\">\r\n");
      out.write("\t\t\t<TD align=\"right\" width=\"500\">\r\n");
      out.write("\t\t\t\t<FONT color=\"#888888\"><B>");
      out.print( articleTotalNum);
      out.write("</B>\r\n");
      out.write("\t\t\t\t개 글 중 <B>");
      out.print( startNum);
      out.write("</B>\r\n");
      out.write("\t\t\t\t~ <B>");
      out.print( endNum);
      out.write("</B> \r\n");
      out.write("\t\t\t\t(<B>");
      out.print( pageTotalNum);
      out.write("</B> page 중\r\n");
      out.write("\t\t\t\t<B>");
      out.print( pageNum);
      out.write("</B> page)</FONT>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR><TD height=\"3\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t<!--글목록 시작-->\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"4\" bgcolor=\"#ffffff\">\r\n");
      out.write("\t\t<TR bgcolor=\"#74c900\" align=\"center\">\r\n");
      out.write("\t\t<td bgcolor=\"#74c900\" width = \"80\"><p class=\"tableTag\"> No. </p></td>\t\t\r\n");

	if(si.getFileYn())	//개시판이 파일업로드를 사용할 경우
	{

      out.write("\r\n");
      out.write("\t\t<td bgcolor=\"#74c900\" width = \"350\"><p class=\"tableTag\">  제목</p></td>\r\n");
      out.write("\t\t<td bgcolor=\"#74c900\" width = \"100\"><p class=\"tableTag\">  첨부파일</p></td>\r\n");

	}
	else
	{

      out.write("\r\n");
      out.write("\t\t<td bgcolor=\"#74c900\" width = \"450\"><p class=\"tableTag\">  제목</p></td>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t<td bgcolor=\"#74c900\" width = \"80\"><p class=\"tableTag\">  작성자 </p></td>\r\n");
      out.write("\t\t\t<td bgcolor=\"#74c900\" width = \"100\"><p class=\"tableTag\">  등록일 </p></td>\r\n");
      out.write("\t\t\t<td bgcolor=\"#74c900\" width = \"80\"><p class=\"tableTag\">  조회수 </p></td>\r\n");
      out.write("\t\t</TR>\r\n");

	for(int i=0; i<supportViewList.size(); i++)
	{
		Hashtable supportTable = (Hashtable)supportViewList.get(i);
		String dispNum = (String)supportTable.get("DISP_NUM");
		String seq = (String)supportTable.get("SEQ");
		String groupNum = (String)supportTable.get("GROUP_NUM");
		int width = Integer.parseInt((String)supportTable.get("WIDTH"));
		String depth = (String)supportTable.get("DEPTH");
		String step = (String)supportTable.get("STEP");
		String addCnt = (String)supportTable.get("ADD_CNT");
		String hitCnt = (String)supportTable.get("HIT_CNT");
		String regDate = (String)supportTable.get("REG_DATE");
		String regId = (String)supportTable.get("REG_ID");
		String name = (String)supportTable.get("NAME");
		String title = (String)supportTable.get("TITLE");
		String disp_yn = (String)supportTable.get("DISP_YN");
		System.out.println("disp_yn : "+disp_yn);

		
		if(title.length()>22)
		{
			title = title.substring(0, 19) + "...";
		}

		String hit = "Y";
		if((loginYn && regId.equals((String)session.getAttribute("id"))) || adminYn)
		{
			hit = "N";
		}

		if(disp_yn.equals("Y"))
		{
			System.out.println("YYYY : "+disp_yn);

      out.write("\r\n");
      out.write("\t\t<TR bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t<TD align=\"center\">");
      out.print( dispNum);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD>\r\n");

		if(width > 0)
		{
			for(int j=0; j<width-1; j++)
			{

      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");

			}

      out.write("\r\n");
      out.write("\t\t\t\t<IMG src=\"/images/button/reply.gif\" border=\"0\" align=\"absmiddle\">\r\n");

		}

      out.write("\r\n");
      out.write("\t\t\t\t<A href=\"javascript:viewAction('");
      out.print( seq);
      out.write("', '");
      out.print( hit);
      out.write("')\">");
      out.print( title);
if(si.getAddYn()){
      out.write(' ');
      out.write('(');
      out.print( addCnt);
      out.write(')');
}
      out.write("</A>\r\n");
      out.write("\t\t\t</TD>\r\n");

		if(si.getFileYn())
		{

      out.write("\r\n");
      out.write("\t\t\t<TD align=\"center\">\r\n");

			ArrayList supportFileList = (ArrayList)supportTable.get("FILE_LIST");	// 담아둔 파일 리스트 꺼냄
			for(int j=0; j<supportFileList.size(); j++)
			{
				Hashtable fileTable = (Hashtable)supportFileList.get(j);
				String path = (String)fileTable.get("PATH");
				String orgName = (String)fileTable.get("ORG_NAME");
				String saveName = (String)fileTable.get("SAVE_NAME");
				String imgName = "etc";

				if(orgName==null || orgName.length()==0)
				{
					break;
				}

				if(orgName.lastIndexOf(".") != -1)
				{	//파일의 확장자를 검사해 아이콘을 바꿔줌
					imgName = (orgName.substring(orgName.lastIndexOf(".")+1)).toLowerCase();
					if(!imgName.equals("bmp") && !imgName.equals("doc") && !imgName.equals("gif") && !imgName.equals("html") && !imgName.equals("hwp") && !imgName.equals("jpg") && !imgName.equals("pdf") && !imgName.equals("ppt") && !imgName.equals("txt") && !imgName.equals("xls") && !imgName.equals("zip"))
					{
						imgName = "etc";
					}
				}									//이미지를 눌렀을때 파일 경로, 저장이름(중복수정된거), 원래 이름값을 fileDownloadAction함수로 넘기고, 마우스 오버시 원래 이름이 보이도록 title속성에 orgName을 지정해준다. 

      out.write("\r\n");
      out.write("\t\t\t\t<A href=\"javascript:fileDownloadAction('");
      out.print( path);
      out.write("', '");
      out.print( saveName);
      out.write("', '");
      out.print( orgName);
      out.write("');\"><IMG src=\"/images/file/");
      out.print( imgName);
      out.write(".gif\" title=\"");
      out.print( orgName);
      out.write("\" border=\"0\"></A>\r\n");

			}

      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");

		}

      out.write("\r\n");
      out.write("\t\t\t<TD align=\"center\">");
      out.print( name);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD align=\"center\">");
      out.print( regDate);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD align=\"center\">");
      out.print( hitCnt);
      out.write("</TD>\r\n");
      out.write("\t\t</TR>\r\n");

		}
		else
		{
			System.out.println("NNNN : "+disp_yn);

      out.write("\r\n");
      out.write("\t\t<TR bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t<TD align=\"center\">");
      out.print( dispNum);
      out.write("</TD>\r\n");
      out.write("\t\t\t<TD>---- 삭제된 글입니다. ----</TD>\r\n");
      out.write("\t\t\t<TD></TD>\r\n");
      out.write("\t\t\t<TD></TD>\r\n");
      out.write("\t\t\t<TD></TD>\r\n");
      out.write("\t\t\t<TD></TD>\r\n");
      out.write("\t\t</TR>\r\n");

		}

      out.write("\r\n");
      out.write("\t<!-- 줄구분선 -->\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"center\" bgcolor=\"#eeeeee\" height=\"5\" colspan=\"");
if(!si.getFileYn()){
      out.write('5');
}else{
      out.write('6');
}
      out.write("\"></TD>\r\n");
      out.write("\t</TR>\r\n");

	}

	if(supportViewList.size()==0)
	{

      out.write("\r\n");
      out.write("\t\t<TR><TD align=\"center\" bgcolor=\"#FFFFFF\" colspan=\"");
if(!si.getFileYn()){
      out.write('5');
}else{
      out.write('6');
}
      out.write("\"><B>등록된 글이 없습니다.</B></TD></TR>\r\n");

	}

      out.write("\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("<!-- 컨트롤 및 검색부분 -->\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\" border=\"0\" bgcolor=\"#eeeeee\" width=\"838\">\r\n");
      out.write("\t\t<FORM name=\"wordSearchForm\" onSubmit=\"return false;\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<td width=\"100\" align=\"center\">\r\n");

	if(loginYn && (si.getUpdateYn() || adminYn))
	{

      out.write("\r\n");
      out.write("\t\t<IMG src=\"/images/support/but_write.gif\" border=\"0\" onclick=\"goWrite();\" style=\"cursor:hand\" align=\"absmiddle\">\r\n");
      out.write("\t\t\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"10\"><td>\r\n");
      out.write("\t\t\t\t<TD align=\"left\" width=\"300\" bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t\t\t\t<SELECT name=\"perPage\" onChange=\"ChangePerPage();\" class=\"search_input\">\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"10\" ");
if(perPage.equals("10")){
      out.write("selected");
}
      out.write(">10줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"15\" ");
if(perPage.equals("15")){
      out.write("selected");
}
      out.write(">15줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"20\" ");
if(perPage.equals("20")){
      out.write("selected");
}
      out.write(">20줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"25\" ");
if(perPage.equals("25")){
      out.write("selected");
}
      out.write(">25줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"30\" ");
if(perPage.equals("30")){
      out.write("selected");
}
      out.write(">30줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"50\" ");
if(perPage.equals("50")){
      out.write("selected");
}
      out.write(">50줄 보기</OPTION>\r\n");
      out.write("\t\t\t\t\t</SELECT>\r\n");
      out.write("\t\t\t\t</TD>\r\n");

	if(si.getSearchYn())
	{

      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<TD align=\"right\" width=\"450\" bgcolor=\"#eeeeee\">\r\n");
      out.write("\t\t\t\t\t<A href=\"javascript:allSearchAction();\"><B><FONT color=\"#A80054\">[전체 검색]</FONT></B></A>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t<SELECT name=\"section\" class=\"search_input\">\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"TC\"");
if(section.equals("TC")){
      out.write(" selected");
}
      out.write(">제목+본문</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"TT\"");
if(section.equals("TT")){
      out.write(" selected");
}
      out.write(">제목</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"CT\"");
if(section.equals("CT")){
      out.write(" selected");
}
      out.write(">본문</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"WT\"");
if(section.equals("WT")){
      out.write(" selected");
}
      out.write(">작성자 ID</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value=\"WN\"");
if(section.equals("WN")){
      out.write(" selected");
}
      out.write(">작성자 이름</OPTION>\r\n");
      out.write("\t\t\t\t\t</SELECT>\r\n");
      out.write("\t\t\t\t\t<INPUT type=\"text\" name=\"word\" value=\"");
      out.print( word);
      out.write("\" onkeydown=\"if(event.keyCode == 13){searchAction();}\" class=\"search_input\">\r\n");
      out.write("\t\t\t\t\t<IMG src=\"/images/button/button_search.gif\" border=\"0\" align=\"absmiddle\" style=\"cursor:hand\" onClick=\"searchAction();\">\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t<td width=\"10\" bgcolor=\"#eeeeee\"><td>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR><TD colspan=\"3\" height=\"5\"></TD></TR>\r\n");
      out.write("\t\t</FORM>\r\n");
      out.write("\t</TABLE>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<TABLE cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<TR><TD height=\"10\"></TD></TR>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD width=\"750\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/support/supportPageNumber.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<TR><TD height=\"30\"></TD></TR>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</CENTER>\r\n");
      out.write("\r\n");
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
