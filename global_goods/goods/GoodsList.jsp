<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<jsp:useBean id="inputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<%
	ArrayList goodsList = (ArrayList)outputTable.get("goodsList");
	String middleCategory = (String)inputTable.get("middleCategory");
	String alignSelect = (String)inputTable.get("alignSelect");
	String section = (String)inputTable.get("section");
	String goodsWord = (String)inputTable.get("goodsWord");

	System.out.println("*********GoodsListBean**********");
	System.out.println("goodsWord :\t\t"+goodsWord);
	System.out.println("section :\t\t"+section);
	System.out.println("middleCategory :\t"+middleCategory);
	System.out.println("alignSelect :\t\t"+alignSelect);
	System.out.println("*********GoodsListBean**********");

	String id = (String)session.getAttribute("id");
	String loginYn = "N";
	if(session.getAttribute("loginYn")!=null && ((String)session.getAttribute("loginYn")).equals("Y"))
	{
		loginYn = "Y";
	}
%>

<SCRIPT>
	function goodsInterestAction(code)
	{
		if ('<%=loginYn%>' == 'N')
		{
			if (confirm("�α����� �ʿ��� �޴��Դϴ�. \n�α����Ͻðڽ��ϱ�?"))
			{
				document.location.href="/memberServlet.mo?func=member_004";
			}
			return false;
		}

		if(window.confirm("���ɻ�ǰ�� �߰��Ͻðڽ��ϱ�?"))
		{
			document.location.href="/goodsServlet.mo?func=goods_CDH001&code="+code;
		}
		return false;
	}

	function searchAction()
	{
		var f = document.sortSearchForm;
		var goodsWord =  f.goodsWord.value;
		
		var alignRadio = document.getElementsByName('alignRadio');
		for(var i=0;i<alignRadio.length;i++){
			if(alignRadio[i].checked == true){
				f.alignSelect.value = alignRadio[i].value;
			}
		}
		f.submit();

	}
	//��ٱ��Ͽ� ��ǰ���
	function goodsCartAction(code)
	{
		if ('<%=loginYn%>' == 'N')
		{
			if (confirm("�α����� �ʿ��� �޴��Դϴ�. \n�α����Ͻðڽ��ϱ�?"))
			{
				document.location.href="/memberServlet.mo?func=member_004";
			}
			return false;
		}
		var amount = window.prompt("���� ������ �Է��ϼ���~!",1);
		
		if (amount==null)
		{
			return false;
		}
		if (amount*0 != 0)
		{
			alert("������ ���ڷ� �Է����ּ���~!");
			return false;
		}
		document.location.href="/goodsServlet.mo?func=goods_004&amount="+amount+"&code="+code;
	}

	//��ǰ �󼼺���
	function viewAction(code)
	{
		var f = document.goodsListForm;
		f.func.value = "goods_002";
		f.code.value = code;
		f.submit();
	}
	

</SCRIPT>
<div><!-- ����Ʈ ȭ�� ��� �� -->
	<img src="/images/goodsList/t_goods_list.png">
</div>

<%
//������ġ ǥ�ø� ����..
	ArrayList superMiddlecategoryList = null;
	if(outputTable.get("superMiddlecategoryList")!=null)
	{
		superMiddlecategoryList = (ArrayList)outputTable.get("superMiddlecategoryList");
	}
	//System.out.println(superMiddlecategoryList);
	if(((String)session.getAttribute("category")).equals("middle_category") && superMiddlecategoryList!= null && superMiddlecategoryList.size() != 0)
	{
		Hashtable middleCategoryTable = (Hashtable)superMiddlecategoryList.get(0);
		String middleCategory_name = (String)middleCategoryTable.get("MIDDLE_CATEGORY_NAME");
		System.out.println("���� �����ִ� ������ : Ȩ>"+middleCategory_name);

%>
	<span style="margin-left:30px;">���� ������ : <A href="/goodsServlet.mo?func=goods_001">Ȩ</A>><%=middleCategory_name%></span>	
	<div class="top_radius">&nbsp;&nbsp;<img src="/images/common/bul_02_01.gif" align="absmiddle">&nbsp;&nbsp;<B><%=middleCategory_name%></B></div>
<%
	}
	else
	{
%>
	<span style="margin-left:30px;">���� ������ : Ȩ</span>
	<div class="top_radius">&nbsp;&nbsp;<img src="/images/common/bul_02_01.gif" align="absmiddle">&nbsp;&nbsp;<B>��ü����</B></div>
<%
	}
%>





<div id="listWrap" class="text">
	<TABLE cellspacing="0" cellpadding="0" width="850" border="0" style="margin-left:40px;">
	<!--������� ���α׷� ����-->
		<FORM name="sortSearchForm" method="GET" action="/goodsServlet.mo">
			<INPUT type="hidden" name="func" value="goods_001">
			<INPUT type="hidden" name="middleCategory" value=<%=middleCategory%>>
			<INPUT type="hidden" name="alignSelect">
			<INPUT type="hidden" name="from" value="goods_list">
			<TR>
			<!-- �˻� -->
				<TD height="35" align="left" valign="middle" bgcolor="#eeeeee">
					<img src="/images/goodsList/search_logo.jpg" align="absmiddle" height="25">
					<SELECT name="section" class="search_input">
					<%
						if(section.length() == 0)
						{
					%>
						<OPTION value="">��ü�˻�</OPTION>
						<OPTION value="GN" selected>��ǰ�̸�</OPTION>
						<OPTION value="GC" >����ȸ��</OPTION>
						<OPTION value="OC" >������</OPTION>
					<%
						}
						else
						{
					%>
						<OPTION value="">��ü�˻�</OPTION>
						<OPTION value="GN" <%if(section.equals("GN")){%>selected<%}%>>��ǰ�̸�</OPTION>
						<OPTION value="GC" <%if(section.equals("GC")){%>selected<%}%>>����ȸ��</OPTION>
						<OPTION value="OC" <%if(section.equals("OC")){%>selected<%}%>>������</OPTION>
					<%
						}
					%>
					</SELECT>
					<INPUT type="text" class="search_input" name="goodsWord" onkeydown="if(event.keyCode == 13){searchAction();}">
					<IMG src="/images/goodsList/top_search02.gif" align="absmiddle" height="25" width="25" onclick="JavaScript:searchAction();">
					
				</TD>
				<!-- �˻� -->
			</TR>
			<TR>
				<!-- ���� -->
				<TD align="left">
					<%
						if(alignSelect.length() == 0)
						{
					%>
						<INPUT type="radio" name="alignRadio" value="NAME" checked onclick="alignChange('NAME')">&nbsp;�̸��� ����&nbsp;&nbsp;
					
						<INPUT type="radio" name="alignRadio" value="GOODS_HIT"  onclick="alignChange('GOODS_HIT')">&nbsp;�α�� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="COUNTRY" onclick="alignChange('COUNTRY')">&nbsp;�������� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_LOW" onclick="alignChange('PAR_PRICE_LOW')">&nbsp;�ְ��� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_HIGH" onclick="alignChange('PAR_PRICE_HIGH')">&nbsp;�ּҰ� ����&nbsp;&nbsp;
					<%
						}
						else
						{
					%>
						<INPUT type="radio" name="alignRadio" value="NAME" <%if(alignSelect.equals("NAME")){%>checked<%}%> onclick="alignChange('NAME')">&nbsp;�̸��� ����&nbsp;&nbsp;
					
						<INPUT type="radio" name="alignRadio" value="GOODS_HIT" <%if(alignSelect.equals("GOODS_HIT")){%>checked<%}%> onclick="alignChange('GOODS_HIT')">&nbsp;�α�� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="COUNTRY" <%if(alignSelect.equals("COUNTRY")){%>checked<%}%> onclick="alignChange('COUNTRY')">&nbsp;�������� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_LOW" <%if(alignSelect.equals("PAR_PRICE_LOW")){%>checked<%}%> onclick="alignChange('PAR_PRICE_LOW')">&nbsp;�ּҰ� ����&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_HIGH" <%if(alignSelect.equals("PAR_PRICE_HIGH")){%>checked<%}%> onclick="alignChange('PAR_PRICE_HIGH')">&nbsp;�ְ��� ����&nbsp;&nbsp;
					<%
						}
					%>
					
				</TD>
				<!-- ���� -->
			</TR>
		</FORM>
	</TABLE>
	<TABLE>
		<TR>
			<TD height="30"></TD>
		</TR>
	</TABLE>

<center>
	<TABLE cellspacing="0" cellpadding="0" width="" border="0">
	<FORM name="goodsListForm" method="GET" action="/goodsServlet.mo">
		<INPUT type="hidden" name="func" value="goods_002">
		<INPUT type="hidden" name="code">
		<INPUT type="hidden" name="goodsHit" value="Y">
<%
	int count = goodsList.size();
	if (count == 0)
	{
%>
		<TR><td align="center">��ϵ� ��ǰ�� �����ϴ�.</td></TR>
<%
	}
	else
	{
		int loopNum1 = count/4;
		if(count%4 != 0)
		{
			loopNum1 = loopNum1 + 1;
		}

		for(int i=0; i<loopNum1; i++)
		{
%>
		<tr>
<%
			for(int j=0; j<4; j++)
			{
				int getNum = (i * 4) + j;

				if(getNum < count)
				{
				Hashtable goodsTable = (Hashtable)goodsList.get(getNum);

				String name = (String)goodsTable.get("NAME");
				String parPrice = (String)goodsTable.get("PAR_PRICE");
				String quantity = (String)goodsTable.get("QUANTITY");
				String code = (String)goodsTable.get("CODE");

				ArrayList goodsImgList = (ArrayList)goodsTable.get("FILE_LIST");
				Hashtable goodsImgTable = (Hashtable)goodsImgList.get(0);
				String path = (String)goodsImgTable.get("PATH");
				String saveName = (String)goodsImgTable.get("SAVE_NAME");
				
				path = "/"+path.substring(path.indexOf("upfile"));
			/*	
				System.out.println("���ϰ�� : "+path+"/"+saveName);
			
				for(int imsi = 0; imsi<goodsImgList.size() ; imsi++)
				{
					System.out.println("�̹�������Ʈ"+imsi+" : "+goodsImgList.get(imsi)+"\n\n");
				}
			*/

%>
				<TD align="left">
					<div class="goodsDiv">
						<TABLE class="goodsList" width="190" height="270" cellspacing="0" cellpadding="0">
							<TR>
								<TD height="10"></TD>
							</TR>
							<TR>
								<TD align="center" valign="top">
									<IMG src="<%=path+"/"+saveName%>" width="150" height="150" onclick="javascript:viewAction('<%=code%>')" style="cursor:hand;">
								</TD>
							</TR>
							<TR>
								<TD align="center">
									<FONT size=2 color="#0066ff"><B><%=name%></B></FONT>
								</TD>
							</TR>
							<TR>
								<TD align="center">
									<FONT size=2><%=quantity%></FONT>
								</TD>
							</TR>
							<TR>
								<TD align="center">
									<FONT size=2 color="#666666"><B><%=parPrice%> ��</B></FONT>
								</TD>
							</TR>
							<TR>
								<TD height="10"></TD>
							</TR>
						</TABLE>
					</div>
					
					<div class="addcart_bt" onclick="goodsCartAction('<%=code%>');">
						��ٱ��� ���
					</div>
					<div class="addcart_bt" onclick="goodsInterestAction('<%=code%>');">
						���ɻ�ǰ �߰�
					</div>
							
				</TD>
				
	<%
				}
			}
		}
	}
	%>
	</TR>
	</FORM>
	<!--���α׷� ����-->
  </TABLE>
 </center>
</div>