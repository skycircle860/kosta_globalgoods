<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page session="false"%>

<%
	HttpSession session = request.getSession(false);
	if(session != null && session.getAttribute("loginYn")!=null && ((String)session.getAttribute("loginYn")).equals("Y"))
	{
%>
<SCRIPT language="JavaScript">
	$(document).ready(function(){
		alert("�̹� �α��εǾ��ֽ��ϴ�");
		document.location.href="/commonServlet.mo";
		

		
	});
</SCRIPT>

<%
	}
	else
	{
%>
<SCRIPT>
	function loginAction()
	{
		var loginF = document.loginForm;
		if(loginF.id.value == "")
		{
			window.alert("ID�� �ݵ�� �Է��ؾ� �մϴ�.");
			loginF.id.focus();
			return false;
		}
		if(loginF.id.value.length < 4 || loginF.id.value.length > 20)
		{
			window.alert("ID�� 4�� �̻� 20�� ���� �Դϴ�.");
			loginF.id.select();
			return false;
		}

		if(loginF.pw.value == "")
		{
			window.alert("��й�ȣ�� �ݵ�� �Է��ؾ� �մϴ�.");
			loginF.pw.focus();
			return false;
		}
		if(loginF.pw.value.length < 4 || loginF.pw.value.length > 20)
		{
			window.alert("��й�ȣ�� 4�� �̻� 20�� ���� �Դϴ�.");
			loginF.pw.select();
			return false;
		}
		
		loginF.func.value="member_005";

		loginF.submit();
	}
	
	function search_IdAction()
	{
		window.location.href = "/memberServlet.mo?func=member_011_1";
	}
	function search_PwAction()
	{
		window.location.href = "/memberServlet.mo?func=member_011_2";
	}

	function ruleAction()
	{
		window.location.href = "/memberServlet.mo?func=member_001";
	}
	$(document).ready(function(){document.getElementById("id_input").focus();});
</SCRIPT>

<table border="0" cellspacing="0" cellpadding="0" width="100%">
	<tr>
		<td>
			<!-- �α��� ȭ�� ��� �� -->
			<img src="/images/member/t_login.png">
		</td>
	</tr>
	<tr><td height="50"></td></tr>
	<tr bgcolor="#FFFFFF">
		<td background="http://img0001.echosting.cafe24.com/front/type_b/image/title/top_t_bg02.gif"><img src="http://img0001.echosting.cafe24.com/front/type_b/image/title/tle_login.gif"></td>
	</tr>
	<!-- UNIT u1t ���� -->	
	<tr bgcolor="#FFFFFF"> 
		<td height="20"></td>
	</tr>

	<tr bgcolor="#FFFFFF"> 
		<td height="10"> 
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr> 
					<td width="10"><img src="http://img0001.echosting.cafe24.com/front/type_b/image/common/bul_04_01.gif"></td>
					<td class="font14_title">ȸ���α���</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr bgcolor="#FFFFFF"> 
		<td> 
		<table border="0" cellpadding="7" cellspacing="3" width="100%" bgcolor="#e9e9e9">
			<tr> 
			<td bgcolor="#ffffff"> 
			<table cellpadding="0" cellspacing="0" width="100%" height="150">
				<tr> 
				<td align="center" width="350"><img src="/images/member/login_img.jpg" width="350" height="310" border="0"></td>
				<td width="20" align="left"><img src="/images/member/20.gif" border="0"></td>
				<td align="center" width="350">
				<table cellpadding="0" cellspacing="0" width="350">
					<tr>
					<td width="340">
					<table cellpadding="0" cellspacing="0" width="100%">
						<tr>
							<td><img src="/images/member/login_title.gif" border="0"></td>
						</tr>
						<tr>
						<td height="100" align="center">
						<table border="0" cellpadding="0" cellspacing="0" width="100%" style="color:#555555;font-size:12;font-family:����;">
							<tr>
								<td colspan="2"></td>
							</tr>
							<FORM name="loginForm" method="post" action="/memberServlet.mo">
							<input type="hidden" name="func" value="member_005">
								<tr>
									<td width="230" align="right">
										<font style="color:#555555;font-size:8pt;font-family:����;">���̵�</font> 
										<input type="text" name="id" id="id_input" size="15" class="input01" tabindex="1">
									</td>
									<td rowspan="2" height="63" align="center"><input type="image" src="/images/member/bt_login.gif" border="0" onclick="loginAction();"></td>
								</tr>
								<tr>
									<td width="230" align="right"><font style="color:#555555;font-size:8pt;font-family:����;">��й�ȣ</font> <input type="password" name="pw" size="15" class="input01" tabindex="2"></td>
								</tr>
							</FORM>
							<tr>
								<td colspan="2"></td>
							</tr>
							</table>
							</td>
							</tr>
							<tr>
							<td height="80" align="center">
							<table border="0" height="80" bgcolor="#EFEFEF" width="320" cellpadding="0" cellspacing="3">
								<tr>
								<td bgcolor="#ffffff">
								<table align="right" border="0" width="96%" cellpadding="0" cellspacing="0">
									<tr>
									<td>
									<font style="color:#555555;font-size:8pt;font-family:����;">���� ȸ���� �ƴϽʴϱ�?<br>ȯ���մϴ�.</font></td>
									<td width="100"><a href="/memberServlet.mo?func=member_001"><img src="/images/member/bt_join.gif" border="0"></a>
									</td>
									</tr>
								</table>
								</td>
								</tr>
							</table>
							</td>
							</tr>
							<tr>
							<td height="90" align="center">
							<table border="0" width="100%" cellpadding="0" cellspacing="0">
								<tr>
								<td width="109" height="30"><img src="/images/member/login_line.gif" border="0"></td>
								<td width="140"><font style="color:#555555;font-size:8pt;font-family:����;">&nbsp;���̵� �����̽��ϱ�?</font></td>
								<td><a href="JavaScript:search_IdAction();"><img src="/images/member/bt_idfind.gif" border="0"></a></td>
								</tr>
								<tr>
								<td width="109" height="30"><img src="/images/member/login_line.gif" border="0"></td>
								<td width="140"><font style="color:#555555;font-size:8pt;font-family:����;">&nbsp;��й�ȣ�� �����̽��ϱ�?</font></td>
								<td><a href="JavaScript:search_PwAction();"><img src="/images/member/bt_pwfind.gif" border="0"></a></td>
								</tr>
							</table></td>
							</tr>
						</table>
						</td>
						<td width="10">&nbsp;</td>
						</tr>
					</table>
					</td>
					</tr>
				</table>
				</td>
				</tr>
			</table>
			</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
<%
	}
%>





