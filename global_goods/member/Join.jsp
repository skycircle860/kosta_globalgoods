<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable"/>

<%
	ArrayList interestList = (ArrayList)outputTable.get("interestList");
%>

<style type="text/css">
  .RB{
 
   border-top: 1px solid #e4e4e4;
   border-bottom:1px solid #e4e4e4;
  }

 </style>

<SCRIPT language="JavaScript">
	// 회원가입
	function joinAction()
	{
		var f = document.joinForm;

		// id값 체크
		if(f.id.value=="")
		{
			window.alert("ID를 입력하세요.");
			f.id.select();
			return false;
		}
		if(f.id.value.length<4 || f.id.value.length>21)
		{
			window.alert("ID는 4자 이상 20자 이하로 입력하세요.");
			f.id.select();
			return false;
		}
		if(isEngNum(f.id.value))
		{
			window.alert("ID는 숫자 또는 영문 소문자만 가능합니다.");
			f.id.select();
			return false;
		}
		if(isNum((f.id.value).charAt(0)))
		{
			window.alert("ID는 숫자로 시작할 수 없습니다.");
			f.id.select();
			return false;
		}
		f.id.value = trim(f.id.value);

		// ID 중복검사 했는지 여부
		if(f.idCheckYn.value == "N")
		{
			window.alert("반드시 ID 중복 검사를 해야 합니다..");
			f.id.select();
			return false;
		}

		// ID 중복검사 후 ID를 수정했는지 여부
		if(f.id.value != f.checkId.value)
		{
			window.alert("새롭게 수정한 ID값을 중복검사 하십시오.");
			f.id.select();
			return false;
		}

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

		// 비밀번호 질문 체크
		if (f.passQ.value == "000")
		{
			window.alert("질문을 선택해 주십시오.");
			f.passQ.select();
			return false;
		}

		// 비밀번호 답변 체크
		if (f.passA.value == "")
		{
			window.alert("답변을 입력해 주십시오.");
			f.passA.select();
			return false;
		}

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

		f.func.value = "member_003";
		f.target = "_self";
		f.submit();
	}
	// 회원가입 취소
	function cancelAction()
	{
		document.location.href="/memberServlet.mo?func=member_004";
	}

	// ID 중복 검사
	function idCheckAction()
	{
		var f = document.joinForm;

		// id값 체크
		if(f.id.value=="")
		{
			window.alert("ID를 입력하세요.");
			f.id.select();
			return false;
		}
		if(f.id.value.length<4 || f.id.value.length>21)
		{
			window.alert("ID는 4자 이상 20자 이하로 입력하세요.");
			f.id.select();
			return false;
		}
		if(isEngNum(f.id.value))
		{
			window.alert("ID는 숫자 또는 영문 소문자만 가능합니다.");
			f.id.select();
			return false;
		}
		if(isNum((f.id.value).charAt(0)))
		{
			window.alert("ID는 숫자로 시작할 수 없습니다.");
			f.id.select();
			return false;
		}
		f.id.value = trim(f.id.value);

		ajaxIdCheck();
	}

	function ajaxIdCheck()
	{
		$.ajax({
			type: "POST", 
			url: "/memberServlet.mo",
			dataType: "text",
			data: "func=member_002&id=" + $('#id').val(), 
			success: function(text){
				var resultText = trim(text);
				var resultArr = resultText.split("^");
				var resultCode = resultArr[0];
				var resultId = resultArr[1];
				var resultMessage = "'<FONT color='red'>"+resultId + "</FONT>' 는 " + resultArr[2];
				if(resultCode=="1")
				{
					$('#idCheckYn').attr('value', 'Y');
					$('#checkId').attr('value', resultId);
				}
				else
				{
					$('#idCheckYn').attr('value', 'N');
					$('#checkId').attr('value', '');
				}
				$('#idCheckMessage').html(resultMessage);
			}
		});
	}

	// 우편번호 검색
	function searchZipCodeAction()
	{
		window.open("/commonServlet.mo?func=common_001", "zipSearchOpen", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=no, width=420, height=500");
	}
</SCRIPT>
<div><!-- 회원가입 화면 상단 바 -->
	<img src="/images/member/t_join.png">
</div>
<span style="margin-left:30px;">현재 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>>회원가입
<table border="0" cellspacing="0" cellpadding="0">
	<tr><td colspan="2" height="20"></td></tr>
	<tr> 
		<td width="10"><img src="/images/common/bul_02_01.gif"></td>
		<td class="font16_title"><font color="333333">회원가입</font></td>
	</TR>
		

</table>
<hr color="#f9f9f9" noshade>

<CENTER>
	<TABLE cellspacing="0" cellpadding="0" width="900">
		<TR><TD align="left" bgcolor="#FFFFFF" height="20"></TD></TR>
		<TR>
			<TD  align="left" bgcolor="#FFFFFF" >
				<img src="/images/common/5.gif" align="left">필수정보 입력
			</TD>
			</TR>
	</TABLE>


	<TABLE cellspacing="3" cellpadding="5" bgcolor="#f9f9f9" width="900" >
		<FORM name="joinForm" action="/memberServlet.mo" method="post" onSubmit="return false;">
			<INPUT type="hidden" name="func" value="006">

			<INPUT type="hidden" name="idCheckYn" id="idCheckYn" value="N">
			<INPUT type="hidden" name="checkId" id="checkId" value="">
			
			<TR >
				<TD width="150" bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;아이디</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
					<INPUT type="text" name="id" maxlength="20" id="id">
					<IMG src="/images/button/idCheck.png" border="0" style="cursor:hand" onclick="idCheckAction();" align="absmiddle">
					&nbsp;&nbsp;
					<SPAN id="idCheckMessage"></SPAN>
				</TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀 번호</font></TD>
				<TD width="900" bgcolor="#FFFFFF" style="padding-left:30px;"><INPUT type="password" name="pass1" maxlength="20"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호확인</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;"><INPUT type="password" name="pass2" maxlength="20"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인시 질문</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
					<SELECT name="passQ">
						<OPTION value="000">-----------------선  택------------------</OPTION>
						<%
							ArrayList passQList = (ArrayList)outputTable.get("passQList");
							System.out.println(passQList.size()+"   : asdfasdfasdfasdfaF");
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
				</TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인시 답변</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;" ><INPUT type="text" name="passA" maxlength="40" size="48"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left"  height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;이 름</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;"><INPUT type="text" name="name" maxlength="20"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;주민등록번호</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;"><INPUT type="text" name="jumin1" maxlength="6"> - <INPUT type="text" name="jumin2" maxlength="7"></TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" colspan="2" height="40"><img src="/images/common/5.gif">&nbsp;집/직장/휴대폰 3중 하나만 입력하셔도 됩니다.</TD>
			</TR>
			
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;집 전화</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
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
				<TD bgcolor="#f9f9f9" align="left"  height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;직장 전화</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
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
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;휴대 전화</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
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
				<TD bgcolor="#f9f9f9" align="left" height="40" ><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;주 소</font></TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
					<INPUT type="text" name="zipCode1" size="5" onclick="searchZipCodeAction();" readonly>
					- <INPUT type="text" name="zipCode2" size="5" onclick="searchZipCodeAction();" readonly>&nbsp;&nbsp;&nbsp;
					<IMG src="/images/button/PostCheck.png" border="0" style="cursor:hand" align="absmiddle" onclick="searchZipCodeAction();">
					<BR>
					<INPUT type="text" name="addr1" size="60" onclick="searchZipCodeAction();" readonly> <font color="gray">(행정구역)
					<INPUT type="text" name="addr2" size="60"> (번지 및 상세주소)</font>
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left" class="RB" height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;이메일</TD>
				<TD bgcolor="#FFFFFF" style="padding-left:30px;">
					<INPUT type="text" name="email" size="60">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#f9f9f9" align="left"  height="40"><font color="gray">&nbsp;&nbsp;&nbsp;&nbsp;관심상품</TD>
				<TD bgcolor="#FFFFFF"  align="center">
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
							<TD width="115"><INPUT type="checkbox" name="interest" value="<%= code%>"> <%= interestName%></TD>
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
				<IMG src="/images/member/mem_bt_join.gif" border="0" onclick="joinAction();" style="cursor:hand" align="absmiddle">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<IMG src="/images/common/mem_bt_cancel.gif" border="0" onclick="cancelAction();" style="cursor:hand" align="absmiddle">
			</TD>
		</TR>
	</TABLE>

	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD align="center" bgcolor="#FFFFFF" height="20"></TD></TR>
	</TABLE>
</CENTER>