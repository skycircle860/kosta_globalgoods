<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />

<%
	ArrayList hobbyInfoList = (ArrayList)outputTable.get("hobbyInfoList");
	Hashtable hobbyInfoTable = (Hashtable)hobbyInfoList.get(0);

	String code = (String)hobbyInfoTable.get("CODE");

	String useYn = (String)hobbyInfoTable.get("USEYN");
	String useKor = "�����";
	if(useYn.equals("N"))
	{
		useKor = "�̻��";
	}
%>

<SCRIPT language="JavaScript">
	// ��� ��� ������ ����
	function goList()
	{
		document.location.href="/managerHobbyServlet.mo?func=managerHobby_001";
	}

	// ��� ���� ������ ����
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
				<FONT color="blue" size="3"><B>��� �� ����</B></FONT>
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
			<TD bgcolor="#CFDDFA" align="center"><B>��� ����</B></TD>
			<TD bgcolor="#FFFFFF"><%= useKor%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>�ۼ��� (IP)</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("REG_ID")%> (<%= hobbyInfoTable.get("REG_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>�ۼ���</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("REG_DATE")%></TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>���� ������ (IP)</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("UPD_ID")%> (<%= hobbyInfoTable.get("UPD_IP")%>)</TD>
		</TR>
		<TR>
			<TD bgcolor="#CFDDFA" align="center"><B>���� ������</B></TD>
			<TD bgcolor="#FFFFFF"><%= hobbyInfoTable.get("UPD_DATE")%></TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="5"></TD></TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR>
			<TD align="center">
				<IMG src="/images/button/but_update.gif" border="0" align="absmiddle" alt="����" style="cursor:hand" onClick="goUpdate();">
				&nbsp;&nbsp;
				<IMG src="/images/button/but_ok.gif" border="0" align="absmiddle" alt="���" style="cursor:hand" onClick="goList();">
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="20"></TD></TR>
	</TABLE>
</CENTER>