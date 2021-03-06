<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />

<%
	ArrayList MiddleInfoList = (ArrayList)outputTable.get("MiddleInfoList");
	Hashtable categoryTable = (Hashtable)MiddleInfoList.get(0);

	//String from = (String)inputTable.get("from");

	String code = (String)categoryTable.get("CODE");
	String useYn = (String)categoryTable.get("USEYN");
	String maincategory = (String)categoryTable.get("MAIN_CATEGORY");
	String name = (String)categoryTable.get("NAME");

	String useMainText = "";
	if(maincategory.equals("F"))
	{
		useMainText ="식품";
	}
	else
	{
		useMainText="잡화";
	}

	
	
	String useKor = "사용중";
	if(useYn.equals("N"))
	{
		useKor = "미사용";
	}
%>
<style type="text/css">
  td
  {
	 height:25px;
  }

 </style>

<SCRIPT language="JavaScript">
	// 직업 목록 페이지 가기
	function goList()
	{
		document.location.href="/managerOrderServlet.mo?func=managerOrder_005";
	}

	// 직업 수정 취소 버튼
	function cancelAction()
	{
		document.location.href="/managerOrderServlet.mo?func=managerOrder_005";
	}

	// 직업 수정
	function updateAction()
	{
		alert("adsf");
		var f = document.infoForm;
		

		f.submit();
	}
</SCRIPT>

<div><!-- 리스트 화면 상단 바 -->
	<img src="/images/common/t_admin.png">
</div>
<font color="#000000"><span style="margin-left:30px;">현제 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>>관리자페이지</font>



<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="25"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="5" bgcolor="#74c900" width="250">
		<TR>
			<TD align="center" bgcolor="#74c900" width="250">
				<FONT color="white" size="3"><B><FONT color="#183265">품목 상세정보</B></FONT>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="600">
		<TR>
			<TD align="right">
				<IMG src="/images/button/button_all_list.gif" border="0" onclick="goList();" style="cursor:hand" align="absmiddle" onClick="goList();">
			</TD>
		</TR>
		<TR><TD height="3"></TD></TR>
	</TABLE>
	<TABLE cellspacing="1" cellpadding="4" bgcolor="#74c900" width="600">
		<FORM name="infoForm" method="post" action="/managerOrderServlet.mo" onSubmit="updateAction(); return false;">
			<INPUT type="hidden" name="func" value="managerOrder_012">
			<INPUT type="hidden" name="code" value="<%= code%>">
			<INPUT type="hidden" name="yn" value="<%= useYn%>">
			<INPUT type="hidden" name="name" value="<%= name%>">


			
			<TR>
				<TD width="150" bgcolor="#74c900" align="center"><B><FONT color="#183265">CODE</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= code%></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">상품 분류</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= useMainText%></TD>
			</TR>
		
			<TR>

				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">NAME</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= name%></TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">사용 여부</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= useKor%></TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">작성자 (IP)</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= categoryTable.get("REG_ID")%> (<%= categoryTable.get("REG_IP")%>)</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">작성일</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= categoryTable.get("REG_DATE")%></TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">최종 수정자 (IP)</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= categoryTable.get("UPD_ID")%> (<%= categoryTable.get("UPD_IP")%>)</TD>
			</TR>
			<TR>
				<TD bgcolor="#74c900" align="center"><B><FONT color="#183265">최종 수정일</FONT></B></TD>
				<TD bgcolor="#FFFFFF">&nbsp;&nbsp;<%= categoryTable.get("UPD_DATE")%></TD>
			</TR>
		</FORM>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="5"></TD></TR>
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