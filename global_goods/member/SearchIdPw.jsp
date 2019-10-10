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
			window.alert("이름을 입력해주세요.");
			f.name.focus();
			return false;
		}
		if (f.jumin1.value =="" || f.jumin1.value.length < 6)
		{
			window.alert("주민등록번호 앞자리는 6자리가 되어야 합니다.");
			f.jumin1.focus();
			return false;
		}
		if (f.jumin2.value =="" || f.jumin2.value.length < 7)
		{
			window.alert("주민등록번호 뒷자리는 7자리가 되어야 합니다.");
			f.jumin2.focus();
			return false;
		}
		f.name.value = trim(f.name.value);
		f.jumin1.value = trim(f.jumin1.value);
		f.jumin2.value = trim(f.jumin2.value);

		window.open("/common/Progress.jsp", "idSearch", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, width=300, height=200");

		f.func.value = "member_012";
		f.target = "idSearch";
		f.submit();
	}

	function searchPwAction()
	{
		var f = document.pwSearch;
		if (f.id.value =="")
		{
			window.alert("아이디를 입력해주세요.");
			f.id.focus();
			return false;
		}
		if (f.name.value =="")
		{
			window.alert("이름을 입력해주세요.");
			f.name.focus();
			return false;
		}
		if (f.passQ.value =="000")
		{
			window.alert("질문을 선택해주세요.");
			f.passQ.focus();
			return false;
		}
		if (f.passA.value =="")
		{
			window.alert("질문에 대한 답을 입력해주세요.");
			f.passA.focus();
			return false;
		}
		f.id.value = trim(f.id.value);
		f.name.value = trim(f.name.value);

		window.open("/common/Progress.jsp", "pwSearch", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, width=300, height=200");

		f.func.value = "member_013";
		f.target = "pwSearch";
		f.submit();
	}
</SCRIPT>


<table>
	<tr height="100"><td></td><td></td></tr>
	<tr>
		<td>
			<table>
				<form name="idSearch" method="post" action="/memberServlet.mo">
				<INPUT type="hidden" name="func" value="member_012">
					<tr>
						<td>아이디 찾기</td>
					</tr>
					<tr>
						<td>이&nbsp;&nbsp;&nbsp;름 : 
							<input type="text" name="name">
						</td>
					</tr>
					<tr>
						<td>
							주민등록번호 : <br><input type="text" name="jumin1" maxlength="6"> - <input type="text" name="jumin2" maxlength="7">
						</td>
					</tr>
					<tr>
						<td>
							<input type="button" value="확인" onclick="searchIdAction();">
						</td>
					</tr>
				</form>
			</table>
		</td>


		<td>			
			<table>
				<form name="pwSearch" method="post" action="/memberServlet.mo">
				<INPUT type="hidden" name="func" value="member_013">
					<tr>
						<td>비밀번호 찾기</td>
					</tr>
					<tr>
						<td>아이디 : <input type="text" name="id"></td>
					</tr>
					<tr>
						<td>이&nbsp;&nbsp;&nbsp;름 : <input type="text" name="name"></td>
					</tr>
					<tr>
						<td>비밀번호 질문 : 
							<SELECT name="passQ">
								<OPTION value="000">-----------------선  택------------------</OPTION>
							<%
								ArrayList passQList = (ArrayList)outputTable.get("passQList");
								for(int i = 0 ; i<passQList.size(); i++)
								{
									Hashtable passQTable = (Hashtable)passQList.get(i);
									String code = (String)passQTable.get("CODE");
									String passQ = (String)passQTable.get("PASS_Q");
							%>
								<OPTION value="<%=code%>"><%=passQ%></OPTION>
							<%
								}
							%>
							</SELECT>
						</td>
					</tr>
					<tr>
						<td>비밀번호 &nbsp;&nbsp;&nbsp;답 : <INPUT type="text" name="passA" maxlength="40" size="44"></td>
					</tr>
					<tr>
						<td><input type="button" value="확인" onclick="searchPwAction();"></td>
					</tr>
				</form>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<input type="button" value="돌아가기" onclick="document.location.href='memberServlet.mo'">
		</td>
	</tr>
</table>