<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />




<SCRIPT language="JavaScript">
	function searchIdAction()
	{
		var f = document.idSearch;
		if (f.name.value =="")
		{
			window.alert("�̸��� �Է����ּ���.");
			f.name.focus();
			return false;
		}
		if (f.jumin1.value =="" || f.jumin1.value.length < 6)
		{
			window.alert("�ֹε�Ϲ�ȣ ���ڸ��� 6�ڸ��� �Ǿ�� �մϴ�.");
			f.jumin1.focus();
			return false;
		}
		if (f.jumin2.value =="" || f.jumin2.value.length < 7)
		{
			window.alert("�ֹε�Ϲ�ȣ ���ڸ��� 7�ڸ��� �Ǿ�� �մϴ�.");
			f.jumin2.focus();
			return false;
		}
		f.name.value = trim(f.name.value);
		f.jumin1.value = trim(f.jumin1.value);
		f.jumin2.value = trim(f.jumin2.value);

		window.open("/common/Progress.jsp", "idSearch", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, width=350, height=150");

		f.func.value = "member_012";
		f.target = "idSearch";
		f.submit();
	}
</SCRIPT>
<div><!-- ��й�ȣã�� ȭ�� ��� �� -->
	<img src="/images/member/t_find_pass.png">
</div>
<span style="margin-left:30px;">���� ������ : <A href="/goodsServlet.mo?func=goods_001">Ȩ</A>><A href="/memberServlet.mo?func=member_004">�α���</A>>IDã��
<table border="0" cellspacing="0" cellpadding="0">
	<tr><td colspan="2" height="20"></td></tr>
	<tr> 
		<td width="10"><img src="/images/common/bul_02_01.gif"></td>
		<td class="font16_title"><font color="333333"><B>ID ã��</B></font></td>
	</tr>
</table>
<hr color="#eeeeee" noshade>

<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD align="center" bgcolor="#FFFFFF" height="20"></TD></TR>
	</TABLE>

<div class="nomal_radius searchIdPwDiv">
<table cellspacing="0" cellpadding="10" border="0">
	<form name="idSearch" method="post" action="/memberServlet.mo">
	<INPUT type="hidden" name="func" value="member_012">
		<tr>
			<td align="left">
				<img src="/images/common/5.gif">&nbsp;<B>���̵� ã�� �ʼ����� �Է�</B>
			</td>
		</tr>
		<tr>
			<td>���̵� ã��</td>
		</tr>
		<tr>
			<td>��&nbsp;&nbsp;&nbsp;�� : 
				&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name">
			</td>
		</tr>
		<tr>
			<td>
				�ֹε�Ϲ�ȣ : <input type="text" name="jumin1" maxlength="6">&nbsp;&nbsp;-&nbsp;&nbsp;<input type="text" name="jumin2" maxlength="7">
			</td>
		</tr>
	</form>
</table>
</div>
<table>
	<tr>
		<td align="right">
			<IMG src="/images/common/mem_bt_cancel.gif" border="0" onclick="document.location.href='memberServlet.mo?func=member_004'" style="cursor:hand" align="absmiddle">
		</td>
		<td width="30"></td>
		<td align="left">
			<IMG src="/images/common/mem_bt_ok.gif" border="0" onclick="searchIdAction();" style="cursor:hand" align="absmiddle">
		</td>
	</tr>
</table>