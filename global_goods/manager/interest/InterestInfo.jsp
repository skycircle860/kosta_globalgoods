<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />

<%
	ArrayList interestInfoList = (ArrayList)outputTable.get("interestInfoList");
	Hashtable interestInfoTable = (Hashtable)interestInfoList.get(0);

	String code = (String)interestInfoTable.get("CODE");

	String useYn = (String)interestInfoTable.get("USEYN");
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
		document.location.href="/managerInterestServlet.mo?func=managerInterest_001";
	}

	// 취미 수정 페이지 가기
	function goUpdate()
	{
		document.location.href='/managerInterestServlet.mo?func=managerInterest_004&from=info&code=<%= code%>';
	}
</SCRIPT>
<style>
td{
	height:25px;
}

</style>

<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="25"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="5" bgcolor="#74c900" width="750">
		<TR>
			<TD align="center" bgcolor="#74c900" width="750">
				<FONT color="white" size="3"><B>관심사 상세 정보</B></FONT>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="750">
		<TR><TD height="10"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="4" bgcolor="#74c900" width="750">
		<TR>
			<TD width="150" bgcolor="#74c900" align="center"><FONT color="white"><B>CODE</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= code%></TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>NAME</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= interestInfoTable.get("NAME")%></TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>사용 여부</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= useKor%></TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>작성자 (IP)</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= interestInfoTable.get("REG_ID")%> (<%= interestInfoTable.get("REG_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>작성일</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= interestInfoTable.get("REG_DATE")%></TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>최종 수정자 (IP)</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= interestInfoTable.get("UPD_ID")%> (<%= interestInfoTable.get("UPD_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#74c900" align="center"><FONT color="white"><B>최종 수정일</B></TD></font>
			<TD bgcolor="#FFFFFF"><%= interestInfoTable.get("UPD_DATE")%></TD>
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