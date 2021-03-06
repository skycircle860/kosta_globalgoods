<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />

<%
	ArrayList hobbyInfoList = (ArrayList)outputTable.get("hobbyInfoList");
	Hashtable hobbyInfoTable = (Hashtable)hobbyInfoList.get(0);

	String code = (String)hobbyInfoTable.get("CODE");

	String useYn = (String)hobbyInfoTable.get("USEYN");
	String useKor = "사용중";
	if(useYn.equals("N"))
	{
		useKor = "미사용";
	}
%>

<SCRIPT language="JavaScript">
	// 취미 목록 페이지 가기
	function goList()
	{
		document.location.href="/managerHobbyServlet.mo?func=managerHobby_001";
	}

	// 취미 수정 페이지 가기
	function goUpdate()
	{
		document.location.href='/managerHobbyServlet.mo?func=managerHobby_004&from=info&code=<%= code%>';
	}
</SCRIPT>

<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="25"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="5" bgcolor="#7682EB" width="250">
		<TR>
			<TD align="center" bgcolor="#E4F2FC" width="250">
				<FONT color="blue" size="3"><B>취미 상세 정보</B></FONT>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="600">
		<TR><TD height="10"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="4" bgcolor="#7682EB" width="600">
		<TR>
			<TD width="150" bgcolor="#CFDDFA" align="center"><B>CODE</B></TD>
			<TD bgcolor="#FFFFFF"><%= code%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>NAME</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("NAME")%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>사용 여부</B></TD>
			<TD bgcolor="#FFFFFF"><%= useKor%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>작성자 (IP)</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("REG_ID")%> (<%= hobbyInfoTable.get("REG_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>작성일</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("REG_DATE")%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>최종 수정자 (IP)</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("UPD_ID")%> (<%= hobbyInfoTable.get("UPD_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>최종 수정일</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("UPD_DATE")%></TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="5"></TD></TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR>
			<TD align="center">
				<IMG src="/images/button/but_update.gif" border="0" align="absmiddle" alt="수정" style="cursor:hand" onClick="goUpdate();">
				&nbsp;&nbsp;
				<IMG src="/images/button/but_ok.gif" border="0" align="absmiddle" alt="취소" style="cursor:hand" onClick="goList();">
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="20"></TD></TR>
	</TABLE>
</CENTER>