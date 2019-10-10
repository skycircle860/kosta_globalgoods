<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable"/>
<jsp:useBean id="inputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable"/>

<%
	ArrayList interestList = (ArrayList)outputTable.get("interestList");
%>

<SCRIPT language="JavaScript">
	// ȸ������
	function joinAction()
	{
		var f = document.joinForm;

		// id�� üũ
		if(f.id.value=="")
		{
			window.alert("ID�� �Է��ϼ���.");
			f.id.select();
			return false;
		}
		if(f.id.value.length<4 || f.id.value.length>21)
		{
			window.alert("ID�� 4�� �̻� 20�� ���Ϸ� �Է��ϼ���.");
			f.id.select();
			return false;
		}
		if(isEngNum(f.id.value))
		{
			window.alert("ID�� ���� �Ǵ� ���� �ҹ��ڸ� �����մϴ�.");
			f.id.select();
			return false;
		}
		if(isNum((f.id.value).charAt(0)))
		{
			window.alert("ID�� ���ڷ� ������ �� �����ϴ�.");
			f.id.select();
			return false;
		}
		f.id.value = trim(f.id.value);

		// ID �ߺ��˻� �ߴ��� ����
		if(f.idCheckYn.value == "N")
		{
			window.alert("�ݵ�� ID �ߺ� �˻縦 �ؾ� �մϴ�..");
			f.id.select();
			return false;
		}

		// ID �ߺ��˻� �� ID�� �����ߴ��� ����
		if(f.id.value != f.checkId.value)
		{
			window.alert("���Ӱ� ������ ID���� �ߺ��˻� �Ͻʽÿ�.");
			f.id.select();
			return false;
		}

		// �̸� �� üũ
		if(trim(f.name.value)=="")
		{
			window.alert("�̸��� �Է��ϼ���.");
			f.name.select();
			return false;
		}
		f.name.value = trim(f.name.value);

		// �ֹι�ȣ �� üũ
		if(trim(f.jumin1.value)=="")
		{
			window.alert("�ֹε�Ϲ�ȣ ���ڸ��� �Է��ϼ���.");
			f.jumin1.select();
			return false;
		}
		if(trim(f.jumin2.value)=="")
		{
			window.alert("�ֹε�Ϲ�ȣ ���ڸ��� �Է��ϼ���.");
			f.jumin2.select();
			return false;
		}
		f.jumin1.value = trim(f.jumin1.value);
		f.jumin2.value = trim(f.jumin2.value);
		if(!isNum(f.jumin1.value))
		{
			window.alert("�ֹ� ��� ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
			f.jumin1.select();
			return false;
		}
		if(!isNum(f.jumin2.value))
		{
			window.alert("�ֹ� ��� ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
			f.jumin2.select();
			return false;
		}

		// ��й�ȣ �� üũ
		if(f.pass1.value=="")
		{
			window.alert("��й�ȣ�� �Է��ϼ���.");
			f.pass1.select();
			return false;
		}
		if(f.pass1.value.length<4 || f.pass1.value.length>21)
		{
			window.alert("��й�ȣ�� 4�� �̻� 20�� ���Ϸ� �Է��ϼ���.");
			f.pass1.select();
			return false;
		}
		if(isEngNum(f.pass1.value))
		{
			window.alert("��й�ȣ�� ���� �Ǵ� ���� �ҹ��ڸ� �����մϴ�.");
			f.pass1.select();
			return false;
		}
		if(f.pass1.value != f.pass2.value)
		{
			window.alert("��й�ȣ�� Ȯ���Ͽ� �ֽʽÿ�.");
			f.pass2.select();
			return false;
		}
		f.pass1.value = trim(f.pass1.value);

		// ��й�ȣ ���� üũ
		if (f.passQ.value == "000")
		{
			window.alert("������ ������ �ֽʽÿ�.");
			f.passQ.select();
			return false;
		}

		// ��й�ȣ �亯 üũ
		if (f.passA.value == "")
		{
			window.alert("�亯�� �Է��� �ֽʽÿ�.");
			f.passA.select();
			return false;
		}

		// ��ȭ��ȣ üũ
		var telCheck = 3;
		if(f.home1.value=="000" && trim(f.home2.value)=="" && trim(f.home3.value)=="" )
		{
			telCheck--;
		}
		else
		{
			if(f.home1.value=="000")
			{
				window.alert("�� ��ȭ ������ȣ�� �����Ͽ� �ֽʽÿ�.");
				f.home1.focus();
				return false;
			}
			if(trim(f.home2.value)=="")
			{
				window.alert("�� ��ȭ ������ �Է��Ͽ� �ֽʽÿ�.");
				f.home2.select();
				return false;
			}
			if(f.home2.value.length<3)
			{
				window.alert("�� ��ȭ ������ �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.home2.select();
				return false;
			}
			if(!isNum(f.home2.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
				f.home2.select();
				return false;
			}
			if(trim(f.home3.value)=="")
			{
				window.alert("�� ��ȭ ���ڸ� ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
				f.home3.select();
				return false;
			}
			if(f.home3.value.length<4)
			{
				window.alert("�� ��ȭ ���ڸ� ��ȣ�� �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.home3.select();
				return false;
			}
			if(!isNum(f.home3.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
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
				window.alert("���� ��ȭ ������ȣ�� �����Ͽ� �ֽʽÿ�.");
				f.office1.focus();
				return false;
			}
			if(trim(f.office2.value)=="")
			{
				window.alert("���� ��ȭ ������ �Է��Ͽ� �ֽʽÿ�.");
				f.office2.select();
				return false;
			}
			if(f.office2.value.length<3)
			{
				window.alert("���� ��ȭ ������ �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.office2.select();
				return false;
			}
			if(!isNum(f.office2.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
				f.office2.select();
				return false;
			}
			if(trim(f.office3.value)=="")
			{
				window.alert("���� ��ȭ ���ڸ� ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
				f.office3.select();
				return false;
			}
			if(f.office3.value.length<4)
			{
				window.alert("���� ��ȭ ���ڸ� ��ȣ�� �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.office3.select();
				return false;
			}
			if(!isNum(f.office3.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
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
				window.alert("�޴� ��ȭ ù°�ڸ��� �����Ͽ� �ֽʽÿ�.");
				f.mobile1.focus();
				return false;
			}
			if(trim(f.mobile2.value)=="")
			{
				window.alert("�޴� ��ȭ ��°�ڸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.mobile2.select();
				return false;
			}
			if(f.mobile2.value.length<3)
			{
				window.alert("�޴� ��ȭ ��°�ڸ��� �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.mobile2.select();
				return false;
			}
			if(!isNum(f.mobile2.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
				f.mobile2.select();
				return false;
			}
			if(trim(f.mobile3.value)=="")
			{
				window.alert("�޴� ��ȭ ���ڸ� ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
				f.mobile3.select();
				return false;
			}
			if(f.mobile3.value.length<4)
			{
				window.alert("�޴� ��ȭ ���ڸ� ��ȣ�� �ٸ��� �Է��Ͽ� �ֽʽÿ�.");
				f.mobile3.select();
				return false;
			}
			if(!isNum(f.mobile3.value))
			{
				window.alert("��ȭ ��ȣ�� ���ڷ� �Է¹ٶ��ϴ�.");
				f.mobile3.select();
				return false;
			}
		}
		if(telCheck==0)
		{
			window.alert("��, ����, �޴� ��ȭ �� �ּ� �ϳ��̻��� �Է��ؾ� �մϴ�.");
			f.home1.focus();
			return false;
		}

		// ������ȣ üũ
		if(f.zipCode1.value=="")
		{
			window.alert("������ȣ�� �˻��Ͽ� �Է��ϼ���.");
			return false;
		}

		// �ּ� üũ
		if(trim(f.addr2.value)=="")
		{
			window.alert("���ּҸ� �Է��ϼ���.");
			f.addr2.select();
			return false;
		}
		f.addr2.value = trim(f.addr2.value);

		// �̸��� üũ
		if(trim(f.email.value)!="")
		{
			if(isEmailChar(f.email.value))
			{
				window.alert("�̸��� �ּҿ��� ���� �ҹ��ڿ� ����, '@', '.' ���� �Է°����մϴ�.");
				f.email.select();
				return false;
			}
			if((f.email.value).indexOf("@") == -1 || (f.email.value).indexOf(".") == -1 || (f.email.value).indexOf(".")<(f.email.value).indexOf("@") || isNum((f.email.value).charAt(0)))
			{
				window.alert("�̸��� �ּҸ� Ȯ�� �ϼ���.");
				f.email.select();
				return false;
			}
		}

		f.action = "/managerUserServlet.mo";
		f.func.value = "managerUser_008";
		f.target = "_self";
		f.submit();
	}
	// ȸ������ ���
	function cancelAction()
	{
		document.location.href="/managerUserServlet.mo?func=managerUser_001";
	}

	// ID �ߺ� �˻�
	function idCheckAction()
	{
		var f = document.joinForm;

		// id�� üũ
		if(f.id.value=="")
		{
			window.alert("ID�� �Է��ϼ���.");
			f.id.select();
			return false;
		}
		if(f.id.value.length<4 || f.id.value.length>21)
		{
			window.alert("ID�� 4�� �̻� 20�� ���Ϸ� �Է��ϼ���.");
			f.id.select();
			return false;
		}
		if(isEngNum(f.id.value))
		{
			window.alert("ID�� ���� �Ǵ� ���� �ҹ��ڸ� �����մϴ�.");
			f.id.select();
			return false;
		}
		if(isNum((f.id.value).charAt(0)))
		{
			window.alert("ID�� ���ڷ� ������ �� �����ϴ�.");
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
				var resultMessage = "'<FONT color='red'>"+resultId + "</FONT>' �� " + resultArr[2];
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

	// ������ȣ �˻�
	function searchZipCodeAction()
	{
		window.open("/commonServlet.mo?func=common_001", "zipSearchOpen", "toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=no, width=420, height=500");
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
		<TR><TD align="center" bgcolor="#FFFFFF" height="20"></TD></TR>
	</TABLE>

	<TABLE cellspacing="1" cellpadding="0" bgcolor="#7682EB">
		<TR>
			<TD align="center" bgcolor="#E4F0FC" width="300" height="30">
				<FONT size="3" color="#000000"><B>ȸ�� �߰�</B></FONT>
			</TD>
		</TR>
	</TABLE>

	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD align="center" bgcolor="#FFFFFF" height="10"></TD></TR>
	</TABLE>

	<TABLE cellspacing="1" cellpadding="5" bgcolor="#7682EB" width="700">
		<FORM name="joinForm" action="/managerUserServlet.mo" method="post" onSubmit="return false;">
			<INPUT type="hidden" name="func" value="managerUser_008">

			<INPUT type="hidden" name="idCheckYn" id="idCheckYn" value="N">
			<INPUT type="hidden" name="checkId" id="checkId" value="">
			<TR>
				<TD width="100" bgcolor="#CFDDFA" align="center"><B>I D</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="id" maxlength="20" id="id">&nbsp;&nbsp;&nbsp;
					<IMG src="/images/button/duplication.gif" border="0" style="cursor:hand" onclick="idCheckAction();" align="absmiddle">
					&nbsp;&nbsp;
					<B><SPAN id="idCheckMessage"></SPAN></B>
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>��� ��ȣ</B></TD>
				<TD bgcolor="#FFFFFF" width="200"><INPUT type="password" name="pass1" maxlength="20"></TD>
				<TD bgcolor="#CFDDFA" align="center" width="110"><B>��й�ȣȮ��</B></TD>
				<TD bgcolor="#FFFFFF"><INPUT type="password" name="pass2" maxlength="20"></TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>��й�ȣ<BR>Ȯ�ν� ����</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="passQ">
						<OPTION value="000">-----------------��  ��------------------</OPTION>
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
				<TD bgcolor="#CFDDFA" align="center"><B>��й�ȣ<BR>Ȯ�ν� �亯</B></TD>
				<TD bgcolor="#FFFFFF" width="300" colspan="3"><INPUT type="text" name="passA" maxlength="40" size="48"></TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>�� ��</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3"><INPUT type="text" name="name"></TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>�ֹε�Ϲ�ȣ</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="jumin1" size="8" maxlength="6"> - <INPUT type="text" name="jumin2" size="9" maxlength="7">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>�� ��ȭ</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="home1">
						<OPTION value="000">--����--</OPTION>
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
				<TD bgcolor="#CFDDFA" align="center"><B>���� ��ȭ</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="office1">
						<OPTION value="000">--����--</OPTION>
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
				<TD bgcolor="#CFDDFA" align="center"><B>�޴� ��ȭ</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<SELECT name="mobile1">
						<OPTION value="000">--����--</OPTION>
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
				<TD bgcolor="#CFDDFA" align="center"><B>�� ��</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="zipCode1" size="5" onclick="searchZipCodeAction();" readonly>
					- <INPUT type="text" name="zipCode2" size="5" onclick="searchZipCodeAction();" readonly>&nbsp;&nbsp;&nbsp;
					<IMG src="/images/button/postcode_search.gif" border="0" style="cursor:hand" align="absmiddle" onclick="searchZipCodeAction();">
					<BR>
					<INPUT type="text" name="addr1" size="60" onclick="searchZipCodeAction();" readonly> (��������)
					<INPUT type="text" name="addr2" size="60"> (���� �� ���ּ�)
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>�̸���</B></TD>
				<TD bgcolor="#FFFFFF" colspan="3">
					<INPUT type="text" name="email" size="60">
				</TD>
			</TR>
			<TR>
				<TD bgcolor="#CFDDFA" align="center"><B>���ɻ�ǰ</B></TD>
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
				<IMG src="/images/button/but_join.gif" border="0" onclick="joinAction();" style="cursor:hand" align="absmiddle">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<IMG src="/images/button/but_cancel1.gif" border="0" onclick="cancelAction();" style="cursor:hand" align="absmiddle">
			</TD>
		</TR>
	</TABLE>

	<TABLE cellspacing="0" cellpadding="0">
		<TR><TD align="center" bgcolor="#FFFFFF" height="20"></TD></TR>
	</TABLE>
</CENTER>