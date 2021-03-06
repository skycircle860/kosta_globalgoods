<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />

<%
	ArrayList interestList = (ArrayList)outputTable.get("interestList");

	ArrayList userInfoList = (ArrayList)outputTable.get("userInfoList");
	Hashtable userInfoTable = (Hashtable)userInfoList.get(0);
	String id = (String)userInfoTable.get("ID");
	String name = (String)userInfoTable.get("NAME");
	String pass = (String)userInfoTable.get("PASS");
	String passQ_code = (String)userInfoTable.get("PASS_Q");
	String passA = (String)userInfoTable.get("PASS_A");
	String jumin1 = (String)userInfoTable.get("JUMIN1");
	String home1 = (String)userInfoTable.get("HOME1");
	String home2 = (String)userInfoTable.get("HOME2");
	String home3 = (String)userInfoTable.get("HOME3");
	String office1 = (String)userInfoTable.get("OFFICE1");
	String office2 = (String)userInfoTable.get("OFFICE2");
	String office3 = (String)userInfoTable.get("OFFICE3");
	String mobile1 = (String)userInfoTable.get("MOBILE1");
	String mobile2 = (String)userInfoTable.get("MOBILE2");
	String mobile3 = (String)userInfoTable.get("MOBILE3");
	String zipCode1 = (String)userInfoTable.get("ZIPCODE1");
	String zipCode2 = (String)userInfoTable.get("ZIPCODE2");
	String addr1 = (String)userInfoTable.get("ADDR1");
	String addr2 = (String)userInfoTable.get("ADDR2");
	String email = (String)userInfoTable.get("EMAIL");
	String interest = (String)userInfoTable.get("INTEREST");
%>
<style type="text/css">
  .RB{
 
   border-top: 1px solid #e4e4e4;
   border-bottom:1px solid #e4e4e4;
  }

 </style>

<SCRIPT language="JavaScript">
	// 회원정보 수정
	function updateAction()
	{
		var f = document.joinForm;

		// 비밀번호 값 체크
		if(f.pass1.value=="")
		{
			window.alert("비밀번호를 입력하세요.");
			f.pass1.select();
			return false;
		}
		if(f.pass1.value.length<4 || f.pass1.value.length>21)
		{
			window.alert("비밀번호는 4자 이상 20자 이하로 입력하세요.");
			f.pass1.select();
			return false;
		}
		if(isEngNum(f.pass1.value))
		{
			window.alert("비밀번호는 숫자 또는 영문 소문자만 가능합니다.");
			f.pass1.select();
			return false;
		}
		if(f.pass1.value != f.pass2.value)
		{
			window.alert("비밀번호를 확인하여 주십시오.");
			f.pass2.select();
			return false;
		}
		f.pass1.value = trim(f.pass1.value);

		// 전화번호 체크
		var telCheck = 3;
		if(f.home1.value=="000" && trim(f.home2.value)=="" && trim(f.home3.value)=="" )
		{
			telCheck--;
		}
		else
		{
			if(f.home1.value=="000")
			{
				window.alert("집 전화 지역번호를 선택하여 주십시오.");
				f.home1.focus();
				return false;
			}
			if(trim(f.home2.value)=="")
			{
				window.alert("집 전화 국번을 입력하여 주십시오.");
				f.home2.select();
				return false;
			}
			if(f.home2.value.length<3)
			{
				window.alert("집 전화 국번을 바르게 입력하여 주십시오.");
				f.home2.select();
				return false;
			}
			if(!isNum(f.home2.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.home2.select();
				return false;
			}
			if(trim(f.home3.value)=="")
			{
				window.alert("집 전화 끝자리 번호를 입력하여 주십시오.");
				f.home3.select();
				return false;
			}
			if(f.home3.value.length<4)
			{
				window.alert("집 전화 끝자리 번호를 바르게 입력하여 주십시오.");
				f.home3.select();
				return false;
			}
			if(!isNum(f.home3.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.home3.select();
				return false;
			}
		}
		if(f.office1.value=="000" && trim(f.office2.value)=="" && trim(f.office3.value)=="" )
		{
			telCheck--;
		}
		else
		{
			if(f.office1.value=="000")
			{
				window.alert("직장 전화 지역번호를 선택하여 주십시오.");
				f.office1.focus();
				return false;
			}
			if(trim(f.office2.value)=="")
			{
				window.alert("직장 전화 국번을 입력하여 주십시오.");
				f.office2.select();
				return false;
			}
			if(f.office2.value.length<3)
			{
				window.alert("직장 전화 국번을 바르게 입력하여 주십시오.");
				f.office2.select();
				return false;
			}
			if(!isNum(f.office2.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.office2.select();
				return false;
			}
			if(trim(f.office3.value)=="")
			{
				window.alert("직장 전화 끝자리 번호를 입력하여 주십시오.");
				f.office3.select();
				return false;
			}
			if(f.office3.value.length<4)
			{
				window.alert("직장 전화 끝자리 번호를 바르게 입력하여 주십시오.");
				f.office3.select();
				return false;
			}
			if(!isNum(f.office3.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.office3.select();
				return false;
			}
		}
		if(f.mobile1.value=="000" && trim(f.mobile2.value)=="" && trim(f.mobile3.value)=="" )
		{
			telCheck--;
		}
		else
		{
			if(f.mobile1.value=="000")
			{
				window.alert("휴대 전화 첫째자리를 선택하여 주십시오.");
				f.mobile1.focus();
				return false;
			}
			if(trim(f.mobile2.value)=="")
			{
				window.alert("휴대 전화 두째자리를 입력하여 주십시오.");
				f.mobile2.select();
				return false;
			}
			if(f.mobile2.value.length<3)
			{
				window.alert("휴대 전화 두째자리를 바르게 입력하여 주십시오.");
				f.mobile2.select();
				return false;
			}
			if(!isNum(f.mobile2.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.mobile2.select();
				return false;
			}
			if(trim(f.mobile3.value)=="")
			{
				window.alert("휴대 전화 끝자리 번호를 입력하여 주십시오.");
				f.mobile3.select();
				return false;
			}
			if(f.mobile3.value.length<4)
			{
				window.alert("휴대 전화 끝자리 번호를 바르게 입력하여 주십시오.");
				f.mobile3.select();
				return false;
			}
			if(!isNum(f.mobile3.value))
			{
				window.alert("전화 번호는 숫자로 입력바랍니다.");
				f.mobile3.select();
				return false;
			}
		}
		if(telCheck==0)
		{
			window.alert("집, 직장, 휴대 전화 중 최소 하나이상은 입력해야 합니다.");
			f.home1.focus();
			return false;
		}

		// 우편번호 체크
		if(f.zipCode1.value=="")
		{
			window.alert("우편번호를 검색하여 입력하세요.");
			return false;
		}

		// 주소 체크
		if(trim(f.addr2.value)=="")
		{
			window.alert("상세주소를 입력하세요.");
			f.addr2.select();
			return false;
		}
		f.addr2.value = trim(f.addr2.value);

		// 이메일 체크
		if(trim(f.email.value)!="")
		{
			if(isEmailChar(f.email.value))
			{
				window.alert("이메일 주소에는 영문 소문자와 숫자, '@', '.' 만이 입력가능합니다.");
				f.email.select();
				return false;
			}
			if((f.email.value).indexOf("@") == -1 || (f.email.value).indexOf(".") == -1 || (f.email.value).indexOf(".")<(f.email.value).indexOf("@") || isNum((f.email.value).charAt(0)))
			{
				window.alert("이메일 주소를 확인 하세요.");
				f.email.select();
				return false;
			}
		}

		f.submit();
	}

	// 정보수정 취소
	function cancelAction()
	{
		document.location.href="/memberServlet.mo?func=member_007";
	}

	// 우편번호 검색
	function searchZipCodeAction()
	{
		window.open("/commonServlet.mo?func=common_001", "zipSearchOpen", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=no, width=420, height=500");
	}


	$(document).ready(function(){
<%
	if(!home1.equals("000"))
	{
%>
	document.joinForm.home1.value = "<%= home1%>";
	document.joinForm.home2.value = "<%= home2%>";
	document.joinForm.home3.value = "<%= home3%>";
<%
	}

	if(!office1.equals("000"))
	{
%>
	document.joinForm.office1.value = "<%= office1%>";
	document.joinForm.office2.value = "<%= office2%>";
	document.joinForm.office3.value = "<%= office3%>";
<%
	}

	if(!mobile1.equals("000"))
	{
%>
	document.joinForm.mobile1.value = "<%= mobile1%>";
	document.joinForm.mobile2.value = "<%= mobile2%>";
	document.joinForm.mobile3.value = "<%= mobile3%>";
<%
	}
%>
	document.joinForm.zipCode1.value = "<%= zipCode1%>";
	document.joinForm.zipCode2.value = "<%= zipCode2%>";
	document.joinForm.addr1.value = "<%= addr1%>";
	document.joinForm.addr2.value = "<%= addr2%>";
<%
	if(!email.equals("empty"))
	{
%>
	document.joinForm.email.value = "<%= email%>";
<%
	}
%>
});
</SCRIPT>

<div><!-- 정보수정 화면 상단 바 -->
	<img src="/images/member/t_info_modify.png">
</div>
<span style="margin-left:30px;">현재 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>>마이페이지
<table border="0" cellspacing="0" cellpadding="0">
	<tr><td colspan="2" height="20"></td></tr>
	<tr> 
		<td width="10"><img src="/images/common/bul_02_01.gif"></td>
		<td class="font16_title"><font color="333333"><B>My Page</B></font></td>
	</tr>
</table>
<hr color="#f9f9f9" noshade>

<CENTER>
	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD height="25"></TD></TR>
	</TABLE>

	<BR>
	<TABLE cellspacing="0" cellpadding="0" width="800">
		<TR>
			<TD align="left" bgcolor="#FFFFFF" height="10">
				<img src="/images/common/5.gif">&nbsp;<B>회원 정보 수정</B>
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="3" cellpadding="5" bgcolor="#f9f9f9" width="900">
		<FORM name="joinForm" action="/memberServlet.mo" method="post" onSubmit="return false;" class="joinForm">
			<INPUT type="hidden" name="func" value="member_009">

			<INPUT type="hidden" name="id" value="<%= id%>">
			<TR >
				<TD width="170" bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;아이디</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="id" maxlength="20" id="id" value="<%=id%>">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀 번호</font></TD>
				<TD bgcolor="#FFFFFF" width="170"><INPUT type="password" name="pass1" maxlength="20" value="<%=pass%>"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" width="110" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호확인</font></TD>
				<TD bgcolor="#FFFFFF"><INPUT type="password" name="pass2" maxlength="20" value="<%=pass%>"></TD>
			</TR>
			
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인시 질문</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="passQ">
						<OPTION value="000">-----------------선  택------------------</OPTION>
						<%
							ArrayList passQList = (ArrayList)outputTable.get("passQList");
							for(int i = 0 ; i<passQList.size(); i++)
							{
								Hashtable passQTable = (Hashtable)passQList.get(i);
								String code = (String)passQTable.get("CODE");
								String passQ = (String)passQTable.get("PASS_Q");
								
								if(code.equals(passQ_code))
								{
						%>
							<OPTION value="<%=code%>" selected><%=passQ%></OPTION>
						<%
								}
								else
								{
						%>
							<OPTION value="<%=code%>"><%=passQ%></OPTION>
						<%
								}
							}
						%>
					</SELECT>
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인시 답변</font></TD>
				<TD bgcolor="#FFFFFF" width="300" colspan="3"><INPUT type="text" name="passA" maxlength="40" size="48" value="<%=passA%>" ></TD>
			</TR>

			<TR>
				<TD bgcolor="#f9f9f9" align="left"  height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;이 름</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3"><%= name%></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;주민등록번호</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3"><%= jumin1%> - *******</TD>
			</TR>
			<TR>

					<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;집 전화</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="home1">
						<OPTION value="000">--선택--</OPTION>
						<OPTION value="02">02</OPTION>
						<OPTION value="031">031</OPTION>
						<OPTION value="032">032</OPTION>
						<OPTION value="033">033</OPTION>
						<OPTION value="041">041</OPTION>
						<OPTION value="042">042</OPTION>
						<OPTION value="043">043</OPTION>
						<OPTION value="051">051</OPTION>
						<OPTION value="052">052</OPTION>
						<OPTION value="053">053</OPTION>
						<OPTION value="054">054</OPTION>
						<OPTION value="055">055</OPTION>
						<OPTION value="061">061</OPTION>
						<OPTION value="062">062</OPTION>
						<OPTION value="063">063</OPTION>
						<OPTION value="064">064</OPTION>
					</SELECT>
					- <INPUT type="text" name="home2" maxlength="4" size="5">
					- <INPUT type="text" name="home3" maxlength="4" size="5">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left"  height="40" class="RB"><font color="gray" >&nbsp;&nbsp;&nbsp;&nbsp;직장 전화</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="office1">
						<OPTION value="000">--선택--</OPTION>
						<OPTION value="02">02</OPTION>
						<OPTION value="031">031</OPTION>
						<OPTION value="032">032</OPTION>
						<OPTION value="033">033</OPTION>
						<OPTION value="041">041</OPTION>
						<OPTION value="042">042</OPTION>
						<OPTION value="043">043</OPTION>
						<OPTION value="051">051</OPTION>
						<OPTION value="052">052</OPTION>
						<OPTION value="053">053</OPTION>
						<OPTION value="054">054</OPTION>
						<OPTION value="055">055</OPTION>
						<OPTION value="061">061</OPTION>
						<OPTION value="062">062</OPTION>
						<OPTION value="063">063</OPTION>
						<OPTION value="064">064</OPTION>
					</SELECT>
					- <INPUT type="text" name="office2" maxlength="4" size="5">
					- <INPUT type="text" name="office3" maxlength="4" size="5">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;휴대 전화</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="mobile1">
						<OPTION value="000">--선택--</OPTION>
						<OPTION value="010">010</OPTION>
						<OPTION value="011">011</OPTION>
						<OPTION value="016">016</OPTION>
						<OPTION value="017">017</OPTION>
						<OPTION value="018">018</OPTION>
						<OPTION value="019">019</OPTION>
					</SELECT>
					- <INPUT type="text" name="mobile2" maxlength="4" size="5">
					- <INPUT type="text" name="mobile3" maxlength="4" size="5">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40" class="RB"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;주 소</font></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="zipCode1" size="5" onclick="searchZipCodeAction();" readonly value="<%=zipCode1%>";>
					- <INPUT type="text" name="zipCode2" size="5" onclick="searchZipCodeAction();" readonly value="<%=zipCode2%>";>
					<IMG src="/images/button/PostCheck.png" border="0" style="cursor:hand" align="absmiddle" onclick="searchZipCodeAction();">
					<BR>
					<INPUT type="text" name="addr1" size="60" onclick="searchZipCodeAction();" readonly value="<%=addr1%>";> <font color="gray">(행정구역)
					<INPUT type="text" name="addr2" size="60" value="<%=addr2%>";> (번지 및 상세주소)</font>
				
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;이메일</TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="email" size="60">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left"  height="40" class="RB"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;관심상품</TD>
				<TD bgcolor="#FFFFFF" colspan="3" align="center">
					<TABLE width="580">
<%
	int loopNum2 = interestList.size()/5;
	if(interestList.size()%5 != 0)
	{
		loopNum2 = loopNum2 + 1;
	}

	for(int i=0; i<loopNum2; i++)
	{
%>
						<TR>
<%
		for(int j=0; j<5; j++)
		{
			int getNum = (i * 5) + j;
			if(getNum < interestList.size())
			{
				Hashtable interestTable = (Hashtable)interestList.get(getNum);
				String code = (String)interestTable.get("CODE");
				String interestName = (String)interestTable.get("NAME");
%>
							<TD width="115"><INPUT type="checkbox" name="interest" value="<%= code%>" <%if (interest.indexOf(code) != -1){%>checked<%}%>> <%= interestName%></TD>
<%
			}
			else
			{
%>
							<TD width="115"></TD>
<%
			}
		}
%>
						</TR>
<%
	}
%>
					</TABLE>
				</TD>
			</TR>
		</FORM>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="10"></TD></TR>
		<TR>
			<TD align="center">
				<img src="/images/member/mem_bt_edit.gif" onclick="updateAction();" style="cursor:hand">&nbsp;&nbsp;&nbsp;
				<img src="/images/common/mem_bt_cancel.gif" onclick="cancelAction();" style="cursor:hand">
			</TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0" width="700">
		<TR><TD height="20"></TD></TR>
		<TR>
	</TABLE>
</CENTER>

