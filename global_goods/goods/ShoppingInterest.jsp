<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<%
	ArrayList shoppingInterestList = (ArrayList)outputTable.get("shoppingInterestList");

	String id = (String)session.getAttribute("id");
	String loginYn = "N";
	if(session.getAttribute("loginYn")!=null && ((String)session.getAttribute("loginYn")).equals("Y"))
	{
		loginYn = "Y";
	}
%>

<SCRIPT>
	//장바구니에 상품등록
	function goodsCartAction(code)
	{
		if ('<%=loginYn%>' == 'N')
		{
			if (confirm("로그인이 필요한 메뉴입니다. \n로그인하시겠습니까?"))
			{
				document.location.href="/memberServlet.mo?func=member_004";
			}
			return false;
		}
		var amount = window.prompt("담을 수량을 입력하세요~!");
		
		if (amount==null)
		{
			return false;
		}
		
		document.location.href="/goodsServlet.mo?func=goods_004&amount="+amount+"&code="+code;
	}

	//상품 상세보기
	function viewAction(code)
	{
		var f = document.shoppingInterestListForm;
		f.func.value = "goods_002";
		f.code.value = code;
		f.submit();
	}
	function deleteAction(code)
	{
		document.location.href="/goodsServlet.mo?func=goods_CDH003&code="+code;
	}

	
</SCRIPT>


<div><!-- 관심상품 화면 상단 바 -->
	<img src="/images/cart_wish/t_wish.png">
</div>
<span style="margin-left:30px;">현제 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>>관심상품
<table border="0" cellspacing="0" cellpadding="0">
	<tr><td colspan="2" height="20"></td></tr>
	<tr> 
		<td width="10"><img src="/images/common/bul_02_01.gif"></td>
		<td class="font16_title"><font color="333333"><B>위시리스트</B></font></td>
	</tr>
</table>
<hr color="#eeeeee" noshade>

<div id="interestWrap" class="text">
	<TABLE>
		<TR>
			<TD height="30"></TD>
		</TR>
	</TABLE>
	<TABLE cellspacing="0" cellpadding="0"  border="0">
		<FORM name="shoppingInterestListForm" method="GET" action="/goodsServlet.mo">
			<INPUT type="hidden" name="func" value="goods_002">
			<INPUT type="hidden" name="code">
			<INPUT type="hidden" name="from" value="wish_list">
<%
	int count = shoppingInterestList.size();
	if (count == 0)
	{
%>
		<TR><td align="center">등록된 상품이 없습니다.</td></TR>
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
					Hashtable shoppingInterestTable = (Hashtable)shoppingInterestList.get(getNum);

					String name = (String)shoppingInterestTable.get("NAME");
					String parPrice = (String)shoppingInterestTable.get("PAR_PRICE");
					String code = (String)shoppingInterestTable.get("CODE");
					String quantity = (String)shoppingInterestTable.get("QUANTITY");

					ArrayList goodsImgList = (ArrayList)shoppingInterestTable.get("FILE_LIST");
					Hashtable goodsImgTable = (Hashtable)goodsImgList.get(0);
					String path = (String)goodsImgTable.get("PATH");
					String saveName = (String)goodsImgTable.get("SAVE_NAME");
					
					path = "/"+path.substring(path.indexOf("upfile"));
				/*	
					System.out.println("파일경로 : "+path+"/"+saveName);
				
					for(int imsi = 0; imsi<goodsImgList.size() ; imsi++)
					{
						System.out.println("이미지리스트"+imsi+" : "+goodsImgList.get(imsi)+"\n\n");
					}
				*/

%>
					<TD width="210">
					<div class="goodsDiv">
						<TABLE class="goodsList" width="190" height="270" cellspacing="0" cellpadding="0">
							<TR>
								<TD align="center">
								<IMG src="<%=path+"/"+saveName%>" width="150" height="150" style="cursor:pointer" onclick="javascript:viewAction('<%=code%>')">
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
									<FONT size=2 color="#666666"><B><%=parPrice%> 원</B></FONT>
								</TD>
							</TR>
						</TABLE>
					</div>
					<div class="addcart_bt" onclick="goodsCartAction('<%=code%>');">
						장바구니 담기
					</div>
					<div class="addcart_bt" onclick="deleteAction('<%=code%>');">
						관심상품 제거
					</div>
					</TD>
<%
				}
				else
				{
%>
					<TD width="190"></TD>
<%
				}
			}
		}
	}
%>
		</TR>
	</FORM>
	<!--프로그램 종료-->
	</TABLE>
</div>