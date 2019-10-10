<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<jsp:useBean id="inputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />


<%
	ArrayList supportInfoViewList = (ArrayList)outputTable.get("supportInfoViewList");
	Hashtable supportInfoTable = (Hashtable)supportInfoViewList.get(0);

	String code = (String)supportInfoTable.get("CODE");
	String useYn = (String)supportInfoTable.get("USE_YN");
	String perPage = (String)supportInfoTable.get("PER_PAGE");
	String searchYn = (String)supportInfoTable.get("SEARCH_YN");
	String replyYn = (String)supportInfoTable.get("REPLY_YN");
	String replySort = (String)supportInfoTable.get("REPLY_SORT");
	String addYn = (String)supportInfoTable.get("ADD_YN");
	String addSort = (String)supportInfoTable.get("ADD_SORT");
	String updateYn = (String)supportInfoTable.get("UPDATE_YN");
	String numberType = (String)supportInfoTable.get("NUMBER_TYPE");
	String fileYn = (String)supportInfoTable.get("FILE_YN");
	String regId = (String)supportInfoTable.get("REG_ID");
	String regDate = (String)supportInfoTable.get("REG_DATE");
	String regIp = (String)supportInfoTable.get("REG_IP");
	String updId = (String)supportInfoTable.get("UPD_ID");
	String updDate = (String)supportInfoTable.get("UPD_DATE");
	String updIp = (String)supportInfoTable.get("UPD_IP");

	String from = (String)inputTable.get("from");
%>

<SCRIPT language="JavaScript">
	// 게시판 목록 페이지 가기
	function goList()
	{
		document.location.href="/managerSupportServlet.mo?func=managerSupport_001";
	}

	// 취소 버튼
	function cancelAction()
	{
<%
	if(from.equals("list"))
	{
%>
		document.location.href="/managerSupportServlet.mo?func=managerSupport_001";
<%
	}
	else if(from.equals("info"))
	{
%>
		document.location.href="/managerSupportServlet.mo?func=managerSupport_002&code=<%= code%>";
<%
	}
%>
	}

	// 게시판 정보 수정
	function updateAction()
	{
		var f = document.updateForm;
		if(trim(f.name.value)=="")
		{
			window.alert("게시판의 이름을 입력하세요.");
			f.name.select();
			return false;
		}
		f.name.value = trim(f.name.value);

		f.submit();
	}
</SCRIPT>
<style>
td
{
	height:25px;
}

</style>


<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="25"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="5" bgcolor="#74c900" width="700">
		<TR>
			<TD align="center" bgcolor="#74c900" width="700">
				<FONT color="white" size="3"><B>게시판 정보 수정</B></FONT>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="600">
		<TR><TD height="20"></TD></TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="600">
		<TR>
			<TD align="right">
				<IMG src="/images/button/button_all_list.gif" border="0" onclick="goList();" style="cursor:hand" align="absmiddle" onClick="goList();">
			</TD>
		</TR>
		<TR><TD height="3"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="4" bgcolor="#74c900" width="700">
		<FORM name="updateForm" action="/managerSupportServlet.mo" method="post" onSubmit="return false;">
			<INPUT type="hidden" name="func" value="managerSupport_006">
			<INPUT type="hidden" name="from" value="<%= from%>">
			<INPUT type="hidden" name="code" value="<%= code%>">
			<TR>
				<TD width="150" bgcolor="#74c900" align="center"><font color="white"><B>게시판 이름</B></TD>
				<TD width="550" bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="name" size="78" value="<%= supportInfoTable.get("NAME")%>">
				</TD>
			</TR>
			<TR>
				<TD width="150" bgcolor="#74c900" align="center"><font color="white"><B>CODE</B></TD>
				<TD width="120" bgcolor="#FFFFFF"><FONT color="#A2A2A2"><%= code%></FONT></TD>
				<TD width="130" bgcolor="#74c900" align="center"><font color="white"><B>사용 여부</B></TD>
				<TD width="300" bgcolor="#FFFFFF">
					<INPUT type="radio" name="useYn" value="Y"<%if(useYn.equals("Y")){%> checked<%}%>>사용&nbsp;&nbsp;
					<INPUT type="radio" name="useYn" value="N"<%if(useYn.equals("N")){%> checked<%}%>>미사용
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>출력 개수</B></TD>
				<TD bgcolor="#FFFFFF">
					<SELECT name="perPage">
						<OPTION value="5"<%if(perPage.equals("5")){%> selected<%}%>>5</OPTION>
						<OPTION value="10"<%if(perPage.equals("10")){%> selected<%}%>>10</OPTION>
						<OPTION value="15"<%if(perPage.equals("15")){%> selected<%}%>>15</OPTION>
						<OPTION value="20"<%if(perPage.equals("20")){%> selected<%}%>>20</OPTION>
						<OPTION value="25"<%if(perPage.equals("25")){%> selected<%}%>>25</OPTION>
						<OPTION value="30"<%if(perPage.equals("30")){%> selected<%}%>>30</OPTION>
						<OPTION value="50"<%if(perPage.equals("50")){%> selected<%}%>>50</OPTION>
						<OPTION value="75"<%if(perPage.equals("75")){%> selected<%}%>>75</OPTION>
						<OPTION value="100"<%if(perPage.equals("100")){%> selected<%}%>>100</OPTION>
					</SELECT> 개씩 출력
				</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>쓰기 권한</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="updateYn" value="Y"<%if(updateYn.equals("Y")){%> checked<%}%>>글 작성 및 수정 가능&nbsp;&nbsp;
					<INPUT type="radio" name="updateYn" value="N"<%if(updateYn.equals("N")){%> checked<%}%>>글 보기만 가능
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>검색 기능</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="searchYn" value="Y"<%if(searchYn.equals("Y")){%> checked<%}%>>사용&nbsp;&nbsp;
					<INPUT type="radio" name="searchYn" value="N"<%if(searchYn.equals("N")){%> checked<%}%>>미사용
				</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>Page Number Type</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="numberType" value="T"<%if(numberType.equals("T")){%> checked<%}%>>10페이지 단위표시&nbsp;&nbsp;
					<INPUT type="radio" name="numberType" value="C"<%if(numberType.equals("C")){%> checked<%}%>>현재 페이지 가운데 표시
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>답글 기능</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="replyYn" value="Y"<%if(replyYn.equals("Y")){%> checked<%}%>>사용&nbsp;&nbsp;
					<INPUT type="radio" name="replyYn" value="N"<%if(replyYn.equals("N")){%> checked<%}%>>미사용
				</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>답글 정렬</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="replySort" value="DEPTH"<%if(replySort.equals("DEPTH")){%> checked<%}%>>최근글 우선 정렬&nbsp;&nbsp;
					<INPUT type="radio" name="replySort" value="STEP"<%if(replySort.equals("STEP")){%> checked<%}%>>작성 순서로 정렬
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>댓글 기능</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="addYn" value="Y"<%if(addYn.equals("Y")){%> checked<%}%>>사용&nbsp;&nbsp;
					<INPUT type="radio" name="addYn" value="N"<%if(addYn.equals("N")){%> checked<%}%>>미사용
				</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>댓글 정렬</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="addSort" value="DESC"<%if(addSort.equals("ASC")){%> checked<%}%>>최근글 우선 정렬&nbsp;&nbsp;
					<INPUT type="radio" name="addSort" value="ASC"<%if(addSort.equals("DESC")){%> checked<%}%>>작성 순서로 정렬
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>첨부 파일 기능</B></TD>
				<TD bgcolor="#FFFFFF">
					<INPUT type="radio" name="fileYn" value="Y"<%if(fileYn.equals("Y")){%> checked<%}%>>사용&nbsp;&nbsp;
					<INPUT type="radio" name="fileYn" value="N"<%if(fileYn.equals("N")){%> checked<%}%>>미사용
				</TD>
				<TD bgcolor="#74c900" align="center"><B></B></TD>
				<TD bgcolor="#FFFFFF">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>작성자 (IP)</B></TD>
				<TD bgcolor="#FFFFFF"><%= regId%> (<%= regIp%>)</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>작성일시</B></TD>
				<TD bgcolor="#FFFFFF"><%= regDate%></TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>최종 수정자 (IP)</B></TD>
				<TD bgcolor="#FFFFFF"><%= updId%> (<%= updIp%>)</TD>
				<TD bgcolor="#74c900" align="center"><font color="white"><B>최종 수정일시</B></TD>
				<TD bgcolor="#FFFFFF"><%= updDate%></TD></FONT>
			</TR>
		</FORM>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="10"></TD></TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR>
			<TD align="center">
				<IMG src="/images/button/but_update.gif" border="0" align="absmiddle" alt="수정" style="cursor:hand" onClick="updateAction();">
				&nbsp;&nbsp;
				<IMG src="/images/button/but_cancel1.gif" border="0" align="absmiddle" alt="취소" style="cursor:hand" onClick="cancelAction();">
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="20"></TD></TR>
	</TABLE>
</CENTER>