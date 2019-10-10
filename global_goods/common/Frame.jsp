<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page language="java"%>

<%
	String mainUrl = "/common/Main.jsp";
	if(request.getAttribute("mainUrl") != null && ((String)request.getAttribute("mainUrl")).length() > 0)
	{
		mainUrl = (String)request.getAttribute("mainUrl");
	}

	System.out.println("Frame.jsp mainUrl : "+mainUrl);

	String message = "";
	if(request.getAttribute("message")!=null && ((String)request.getAttribute("message")).length()>0)
	{
		message = (String)request.getAttribute("message");
	}
	if(session.getAttribute("message")!=null && ((String)session.getAttribute("message")).length()>0)
	{
		message = (String)session.getAttribute("message");
		session.setAttribute("message", null);
	}

	if(message.length()>0)
	{
%>
<SCRIPT language="JavaScript">window.alert("<%= message%>");</SCRIPT>
<%
	}
%>

<HTML>
	<HEAD>
		<TITLE>Global Goods</TITLE>
		<link href="/css/common.css" rel="stylesheet" type="text/css">
		<link href="/css/button.css" rel="stylesheet" type="text/css">
		<SCRIPT src="/js/jquery-1.9.1.min.js"></SCRIPT>
		<SCRIPT src="/js/common.js"></SCRIPT>
		<SCRIPT src="/js/text-utils.js"></SCRIPT>
		<SCRIPT src="/js/rollover_a.js"></SCRIPT>
	</HEAD>

	<BODY bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">

		<DIV id="FrameWrap">
			<DIV id="FrameContents">
				<DIV id="header">
						<!-- 상단 화면 관련 시작 ------------------->
						<jsp:include page="/common/Top.jsp" flush="true" />
						<!-- 상단 화면 관련 끝 --------------------->
				</DIV>
				<DIV id="content">
					<TABLE>
						<TR>
							<TD width="200" valign="top">
								<TABLE width="200" cellspacing="0" cellpadding="0" border="0">
									<TR>
										<TD width="200" height="50"></TD>
									</TR>
									<TR>
										<TD width="200" height="800" valign="top">
											<!-- 좌측 메뉴 화면 관련 시작 ------------------->
											<jsp:include page="/common/LeftMenu.jsp" flush="true" />
											<!-- 좌측 메뉴 화면 관련 끝 --------------------->
										</TD>
									</TR>
								</TABLE>
							</TD>
							<TD width="10"></TD>
							<TD width="900" valign="top">
								<table>
									<tr>
										<td height="30"></td>
									</tr>
								</table>
								<!-- Main 화면 관련 시작 ------------------->
								<jsp:include page="<%= mainUrl%>" flush="true" />
								<!-- Main 화면 관련 끝 --------------------->
							</TD>
						</TR>
						<TR>
							<TD colspan="3" width="900" align="center">
								<!-- 밑 관련 시작 ------------------->
								<jsp:include page="/common/Bottom.jsp" flush="true" />
								<!-- 밑 관련 끝 --------------------->
							</TD>
						</TR>
						
					</TABLE>
				</DIV>
			</DIV>
		</DIV>
	</BODY>
</HTML>
