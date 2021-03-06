<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="outputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<jsp:useBean id="inputTable" scope="request" class="java.util.Hashtable" type="java.util.Hashtable" />
<%
	ArrayList subcategorygoodsList = (ArrayList)outputTable.get("subcategorygoodsList");
	String middleCategory = (String)inputTable.get("middleCategory");
	String subCategory = (String)inputTable.get("subCategory");
	String alignSelect = (String)inputTable.get("alignSelect");
	String section = (String)inputTable.get("section");
	String goodsWord = (String)inputTable.get("goodsWord");

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
			if (confirm("로그인이 필요한 메뉴입니다. \n로그인하시겠습니까?"))
			{
				document.location.href="/memberServlet.mo?func=member_004";
			}
			return false;
		}
		document.location.href="/goodsServlet.mo?func=goods_CDH001&code="+code;
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
		var f = document.goodsListForm;
		f.func.value = "goods_002";
		f.code.value = code;
		f.submit();
	}


	
</SCRIPT>
<div><!-- 리스트 화면 상단 바 -->
	<img src="/images/goodsList/t_goods_list.png">
</div>

<%
//현제위치 표시를 위해..
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
		String middleCategory_code = (String)middleCategoryTable.get("MIDDLE_CATEGORY_CODE");

		String subname = (String)inputTable.get("subname");
		System.out.println("현제 보고있는 페이지 : 홈>"+middleCategory_name+">"+subname);
%>
	<span style="margin-left:30px;">현제 페이지 : <A href="/goodsServlet.mo?func=goods_001">홈</A>><A href="JavaScript:menuAction('<%=middleCategory_code%>')"><%=middleCategory_name%></A>><%=subname%></span>

	<div class="top_radius">&nbsp;&nbsp;<img src="/images/common/bul_02_01.gif" align="absmiddle">&nbsp;&nbsp;<B><%=subname%></B></div>
<%
	}
	else
	{
%>
	<span style="margin-left:30px;">현제 페이지 : 홈</span>
<%
	}
%>


<div id="listWrap" class="text">
	<TABLE cellspacing="0" cellpadding="0" width="800" border="0" valign="top" style="margin-left:40px;">
	<!--여기부터 프로그램 시작-->
		<FORM name="sortSearchForm" method="GET" action="/goodsServlet.mo">
			<INPUT type="hidden" name="func" value="goods_001">
			<INPUT type="hidden" name="middleCategory" value=<%=middleCategory%>>
			<INPUT type="hidden" name="subCategory" value=<%=subCategory%>>
			<INPUT type="hidden" name="alignSelect">
			<INPUT type="hidden" name="from" value="sub_list">
			<TR>
				<!-- 검색 -->
				<TD height="35" align="left" valign="middle" bgcolor="#eeeeee">
					<img src="/images/goodsList/search_logo.jpg" align="absmiddle" height="25">
					<SELECT name="section" class="search_input">
					<%
						if(section.length() == 0)
						{
					%>
						<OPTION value="">전체검색</OPTION>
						<OPTION value="GN" selected>상품이름</OPTION>
						<OPTION value="GC" >제조회사</OPTION>
						<OPTION value="OC" >원산지</OPTION>
					<%
						}
						else
						{
					%>
						<OPTION value="">전체검색</OPTION>
						<OPTION value="GN" <%if(section.equals("GN")){%>selected<%}%>>상품이름</OPTION>
						<OPTION value="GC" <%if(section.equals("GC")){%>selected<%}%>>제조회사</OPTION>
						<OPTION value="OC" <%if(section.equals("OC")){%>selected<%}%>>원산지</OPTION>
					<%
						}
					%>
					</SELECT>
					<INPUT type="text" class="search_input" name="goodsWord" onkeydown="if(event.keyCode == 13){searchAction();}">
					<IMG src="/images/goodsList/top_search02.gif" align="absmiddle" height="25" width="25" onclick="JavaScript:searchAction();">
					
				</TD>
				<!-- 검색 -->
			</TR>
			<TR>
				<!-- 정렬 -->
				<TD align="left">
					<%
						if(alignSelect.length() == 0)
						{
					%>
						<INPUT type="radio" name="alignRadio" value="NAME" checked onclick="alignChange('NAME')">&nbsp;이름순 정렬&nbsp;&nbsp;
					
						<INPUT type="radio" name="alignRadio" value="GOODS_HIT"  onclick="alignChange('GOODS_HIT')">&nbsp;인기순 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="COUNTRY" onclick="alignChange('COUNTRY')">&nbsp;원산지순 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_LOW" onclick="alignChange('PAR_PRICE_LOW')">&nbsp;최고가 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_HIGH" onclick="alignChange('PAR_PRICE_HIGH')">&nbsp;최소가 정렬&nbsp;&nbsp;
					<%
						}
						else
						{
					%>
						<INPUT type="radio" name="alignRadio" value="NAME" <%if(alignSelect.equals("NAME")){%>checked<%}%> onclick="alignChange('NAME')">&nbsp;이름순 정렬&nbsp;&nbsp;
					
						<INPUT type="radio" name="alignRadio" value="GOODS_HIT" <%if(alignSelect.equals("GOODS_HIT")){%>checked<%}%> onclick="alignChange('GOODS_HIT')">&nbsp;인기순 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="COUNTRY" <%if(alignSelect.equals("COUNTRY")){%>checked<%}%> onclick="alignChange('COUNTRY')">&nbsp;원산지순 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_LOW" <%if(alignSelect.equals("PAR_PRICE_LOW")){%>checked<%}%> onclick="alignChange('PAR_PRICE_LOW')">&nbsp;최소가 정렬&nbsp;&nbsp;
						
						<INPUT type="radio" name="alignRadio" value="PAR_PRICE_HIGH" <%if(alignSelect.equals("PAR_PRICE_HIGH")){%>checked<%}%> onclick="alignChange('PAR_PRICE_HIGH')">&nbsp;최고가 정렬&nbsp;&nbsp;
					<%
						}
					%>
					
				</TD>
				<!-- 정렬 -->
			</TR>
		</FORM>
	</TABLE>
	<TABLE>
		<TR>
			<TD height="30"></TD>
		</TR>
	</TABLE>

<center>
	<TABLE cellspacing="0" cellpadding="0" border="0">
	<FORM name="goodsListForm" method="GET" action="/goodsServlet.mo">
		<INPUT type="hidden" name="func" value="goods_002">
		<INPUT type="hidden" name="code">
		<INPUT type="hidden" name="goodsHit" value="Y">
<%
	int count = subcategorygoodsList.size();
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
				Hashtable subcategorygoodsTable = (Hashtable)subcategorygoodsList.get(getNum);

				String name = (String)subcategorygoodsTable.get("NAME");
				String parPrice = (String)subcategorygoodsTable.get("PAR_PRICE");
				String quantity = (String)subcategorygoodsTable.get("QUANTITY");
				String code = (String)subcategorygoodsTable.get("CODE");

				ArrayList goodsImgList = (ArrayList)subcategorygoodsTable.get("FILE_LIST");
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
				<TD align="left">
					<div class="goodsDiv">
						<TABLE class="goodsList" width="190" height="270" cellspacing="0" cellpadding="0">
							<TR>
								<TD height="10"></TD>
							</TR>
							<TR>
								<TD align="center" valign="top">
									<IMG src="<%=path+"/"+saveName%>" width="150" height="150" onclick="javascript:viewAction('<%=code%>')" style="cursor:hand">
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
							<TR>
							</TR>
							<TR>
								<TD height="10"></TD>
							</TR>
						</TABLE>
					</div>
					<div class="addcart_bt" onclick="goodsCartAction('<%=code%>');">
						장바구니 담기
					</div>
					<div class="addcart_bt" onclick="goodsInterestAction('<%=code%>');">
						관심상품 추가
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
	<!--프로그램 종료-->
  </TABLE>
 </center>
</div>