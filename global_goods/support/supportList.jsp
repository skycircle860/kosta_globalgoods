<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java"%>
<%@ page import="support.*" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<jsp:useBean id="inputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
	
<%
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

%>
<script>
		// 글쓰기 페이지 가기
	function goWrite()
	{
		document.location.href="/supportServlet.mo?func=support_003&code=<%= code%>";
	}
	// 해당 글 보기(title 클릭시 글보기)
	function viewAction(seq, hit)
	{
		var f = document.bbsForm;
		f.func.value = "support_005";
		f.seq.value = seq;
		f.hit.value= hit;
		f.submit();
	}
	// 검색
	function searchAction()
	{
		var f1 = document.wordSearchForm;
		var f2 = document.bbsForm;
		if(trim(f1.word.value) == "")
		{
			window.alert("검색어를 입력하세요.");
			f1.word.select();
			return false;
		}

		f2.func.value = "support_002";
		f2.pageNum.value = "1";
		f2.section.value = f1.section.value;
		f2.word.value = trim(f1.word.value);

		
		f2.submit();
	}


	//페이지당 글 수변경
	function ChangePerPage()
	{
		var f1 = document.wordSearchForm;
		var f2 = document.bbsForm;
		

		f2.func.value = "support_002";
		f2.pageNum.value = "1";
		f2.perPage.value = f1.perPage.value;

		//alert(f2.perPage.value);
		
		f2.submit();
	}

	// 전체보기
	function allSearchAction()
	{
		var f = document.bbsForm;

		f.func.value = "support_002";
		f.section.value = "TC";
		f.word.value = "";
		f.pageNum.value = "1";
		f.submit();
	}

	// 파일 다운로드
	function fileDownloadAction(svPath, svName, ogName)
	{
		var f = document.fileDownloadForm;
		f.savePath.value = svPath;
		f.saveName.value = svName;
		f.orgName.value = ogName;
		f.submit();
		//Filedownload.jsp로 직접 연결되는 값
		//FileDownload.jsp에선 어떤 파일이던 다운로드 하도록 Content-Type이 설정되어 있다.
		//넘겨받은 주소및 이름으로 파일 전송
	}


</script>

<div><!-- 리스트 화면 상단 바 -->
	<img src="/images/support/t_support.png">
</div>
<span style="margin-left:30px;">현제 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>>고객센터


<FORM name="bbsForm" action="/supportServlet.mo" method="post">
	<INPUT type="hidden" name="func">
	<INPUT type="hidden" name="seq">
	<INPUT type="hidden" name="hit">
	<INPUT type="hidden" name="perPage">
	<INPUT type="hidden" name="code" value="<%= code%>">
	<INPUT type="hidden" name="section" value="<%= section%>">
	<INPUT type="hidden" name="word" value="<%= word%>">
	<INPUT type="hidden" name="pageNum" value="<%= pageNum%>">

</FORM>

<FORM name="fileDownloadForm" action="/common/FileDownload.jsp" method="post">
	<INPUT type="hidden" name="savePath">
	<INPUT type="hidden" name="saveName">
	<INPUT type="hidden" name="orgName">
</FORM>

<!-- 게시판 제목 -->
<table border="0" cellspacing="0" cellpadding="0">
	<tr><td colspan="2" height="8"></td></tr>
	<tr> 
		<td width="10"><img src="/images/common/bul_02_01.gif"></td>
		<td class="font16_title"><font color="#666666"><B><%= bbsName%></B></font></td>
	</tr>
</table>
<hr color="#eeeeee" noshade>

<TABLE cellspacing="0" cellpadding="0">
	<TR><TD height="15"></TD></TR>
</TABLE>
<!-- 게시판 목록 출력 -->
<CENTER>

	<TABLE cellspacing="0" cellpadding="0" border="0" width="750">
		<TR valign="bottom">
			<TD align="right" width="500">
				<FONT color="#888888"><B><%= articleTotalNum%></B>
				개 글 중 <B><%= startNum%></B>
				~ <B><%= endNum%></B> 
				(<B><%= pageTotalNum%></B> page 중
				<B><%= pageNum%></B> page)</FONT>
			</TD>
		</TR>
		<TR><TD height="3"></TD></TR>
	</TABLE>

	<!--글목록 시작-->
	<TABLE cellspacing="0" cellpadding="4" bgcolor="#ffffff">
		<TR bgcolor="#74c900" align="center">
		<td bgcolor="#74c900" width = "80"><p class="tableTag"> No. </p></td>		
<%
	if(si.getFileYn())	//개시판이 파일업로드를 사용할 경우
	{
%>
		<td bgcolor="#74c900" width = "350"><p class="tableTag">  제목</p></td>
		<td bgcolor="#74c900" width = "100"><p class="tableTag">  첨부파일</p></td>
<%
	}
	else
	{
%>
		<td bgcolor="#74c900" width = "450"><p class="tableTag">  제목</p></td>
<%
	}
%>
		<td bgcolor="#74c900" width = "80"><p class="tableTag">  작성자 </p></td>
			<td bgcolor="#74c900" width = "100"><p class="tableTag">  등록일 </p></td>
			<td bgcolor="#74c900" width = "80"><p class="tableTag">  조회수 </p></td>
		</TR>
<%
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
%>
		<TR bgcolor="#FFFFFF">
			<TD align="center"><%= dispNum%></TD>
			<TD>
<%
		if(width > 0)
		{
			for(int j=0; j<width-1; j++)
			{
%>
				&nbsp;&nbsp;
<%
			}
%>
				<IMG src="/images/button/reply.gif" border="0" align="absmiddle">
<%
		}
%>
				<A href="javascript:viewAction('<%= seq%>', '<%= hit%>')"><%= title%><%if(si.getAddYn()){%> (<%= addCnt%>)<%}%></A>
			</TD>
<%
		if(si.getFileYn())
		{
%>
			<TD align="center">
<%
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
%>
				<A href="javascript:fileDownloadAction('<%= path%>', '<%= saveName%>', '<%= orgName%>');"><IMG src="/images/file/<%= imgName%>.gif" title="<%= orgName%>" border="0"></A>
<%
			}
%>
			</TD>
<%
		}
%>
			<TD align="center"><%= name%></TD>
			<TD align="center"><%= regDate%></TD>
			<TD align="center"><%= hitCnt%></TD>
		</TR>
<%
		}
		else
		{
			System.out.println("NNNN : "+disp_yn);
%>
		<TR bgcolor="#FFFFFF">
			<TD align="center"><%= dispNum%></TD>
			<TD>---- 삭제된 글입니다. ----</TD>
			<TD></TD>
			<TD></TD>
			<TD></TD>
			<TD></TD>
		</TR>
<%
		}
%>
	<!-- 줄구분선 -->
	<TR>
		<TD align="center" bgcolor="#eeeeee" height="5" colspan="<%if(!si.getFileYn()){%>5<%}else{%>6<%}%>"></TD>
	</TR>
<%
	}

	if(supportViewList.size()==0)
	{
%>
		<TR><TD align="center" bgcolor="#FFFFFF" colspan="<%if(!si.getFileYn()){%>5<%}else{%>6<%}%>"><B>등록된 글이 없습니다.</B></TD></TR>
<%
	}
%>
	</TABLE>

<!-- 컨트롤 및 검색부분 -->
	<TABLE cellspacing="0" cellpadding="0" border="0" bgcolor="#eeeeee" width="838">
		<FORM name="wordSearchForm" onSubmit="return false;">
			<TR>
				<td width="100" align="center">
<%
	if(loginYn && (si.getUpdateYn() || adminYn))
	{
%>
		<IMG src="/images/support/but_write.gif" border="0" onclick="goWrite();" style="cursor:hand" align="absmiddle">
		
<%
	}
%>
				</td>
				<td width="10"><td>
				<TD align="left" width="300" bgcolor="#eeeeee">
					<SELECT name="perPage" onChange="ChangePerPage();" class="search_input">
						<OPTION value="10" <%if(perPage.equals("10")){%>selected<%}%>>10줄 보기</OPTION>
						<OPTION value="15" <%if(perPage.equals("15")){%>selected<%}%>>15줄 보기</OPTION>
						<OPTION value="20" <%if(perPage.equals("20")){%>selected<%}%>>20줄 보기</OPTION>
						<OPTION value="25" <%if(perPage.equals("25")){%>selected<%}%>>25줄 보기</OPTION>
						<OPTION value="30" <%if(perPage.equals("30")){%>selected<%}%>>30줄 보기</OPTION>
						<OPTION value="50" <%if(perPage.equals("50")){%>selected<%}%>>50줄 보기</OPTION>
					</SELECT>
				</TD>
<%
	if(si.getSearchYn())
	{
%>			
				<TD align="right" width="450" bgcolor="#eeeeee">
					<A href="javascript:allSearchAction();"><B><FONT color="#A80054">[전체 검색]</FONT></B></A>
					&nbsp;
					<SELECT name="section" class="search_input">
						<OPTION value="TC"<%if(section.equals("TC")){%> selected<%}%>>제목+본문</OPTION>
						<OPTION value="TT"<%if(section.equals("TT")){%> selected<%}%>>제목</OPTION>
						<OPTION value="CT"<%if(section.equals("CT")){%> selected<%}%>>본문</OPTION>
						<OPTION value="WT"<%if(section.equals("WT")){%> selected<%}%>>작성자 ID</OPTION>
						<OPTION value="WN"<%if(section.equals("WN")){%> selected<%}%>>작성자 이름</OPTION>
					</SELECT>
					<INPUT type="text" name="word" value="<%= word%>" onkeydown="if(event.keyCode == 13){searchAction();}" class="search_input">
					<IMG src="/images/button/button_search.gif" border="0" align="absmiddle" style="cursor:hand" onClick="searchAction();">
				</TD>
				<td width="10" bgcolor="#eeeeee"><td>
			</TR>
			<TR><TD colspan="3" height="5"></TD></TR>
		</FORM>
	</TABLE>
<%
	}
%>

	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="10"></TD></TR>
		<TR>
			<TD width="750">
				<jsp:include page="/support/supportPageNumber.jsp" flush="true" />
			</TD>
		</TR>
		<TR><TD height="30"></TD></TR>
	</TABLE>
</CENTER>

