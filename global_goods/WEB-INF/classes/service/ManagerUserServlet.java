package service;

import common.main.*;
import common.util.*;
import manager.user.*;
import member.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ManagerUserServlet extends MainServlet
{
	public void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception
	{
		// 회원 목록
		if(func.equals("managerUser_001"))
		{
			String sort = request.getParameter("sort");
			if(sort == null || sort.length()==0)
			{
				sort = "SEQ";
			}
			
			inputTable.put("sort", sort);

			UserListBean ulb = new UserListBean();
			ulb.setDataTable(inputTable);
			ulb.funcExecute();
			ArrayList userList = ulb.getDataList();

			outputTable.put("userList", userList);

			moveType = "FW";
			mode = "S";
			mainUrl = "/manager/user/UserList.jsp";
		}
		// 상세 보기
		if(func.equals("managerUser_002"))
		{
			String id = request.getParameter("id");

			inputTable.put("id", id);

			manager.user.UserInfoBean uib = new manager.user.UserInfoBean();
			uib.setDataTable(inputTable);
			uib.funcExecute();
			ArrayList userInfoList = uib.getDataList();
			outputTable.put("userInfoList", userInfoList);

			// 관심 목록 가져오기
			InterestListBean ilb = new InterestListBean();
			ilb.funcExecute();
			ArrayList interestList = ilb.getDataList();
			outputTable.put("interestList", interestList);

			//passQ가져오기 
			PassQBean pqb = new PassQBean();
			pqb.funcExecute();
			ArrayList passQList = pqb.getDataList();
			outputTable.put("passQList", passQList);

			moveType = "FW";
			mode = "S";
			mainUrl = "/manager/user/UserInfo.jsp";
		}
		// 유져업데이트
		if(func.equals("managerUser_003"))
		{
			String id = request.getParameter("id");

			inputTable.put("id", id);

			manager.user.UserInfoBean uib = new manager.user.UserInfoBean();
			uib.setDataTable(inputTable);
			uib.funcExecute();
			ArrayList userInfoList = uib.getDataList();
			outputTable.put("userInfoList", userInfoList);

			// 관심 목록 가져오기
			InterestListBean ilb = new InterestListBean();
			ilb.funcExecute();
			ArrayList interestList = ilb.getDataList();
			outputTable.put("interestList", interestList);

			//passQ가져오기 
			PassQBean pqb = new PassQBean();
			pqb.funcExecute();
			ArrayList passQList = pqb.getDataList();
			outputTable.put("passQList", passQList);


			moveType = "FW";
			mode = "S";
			mainUrl = "/manager/user/UserUpdate.jsp";
		}
		/** 회원 정보 수정 처리*/
		else if(func.equals("managerUser_004"))
		{
			String id = request.getParameter("id");
			String pass = request.getParameter("pass1");
			String passQ = request.getParameter("passQ");
			String passA = request.getParameter("passA");
			String home1 = request.getParameter("home1");
			String office1 = request.getParameter("office1");
			String mobile1 = request.getParameter("mobile1");
			String zipCode1 = request.getParameter("zipCode1");
			String zipCode2 = request.getParameter("zipCode2");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
            String[] interestArray = request.getParameterValues("interest");
            String interest = "";
			if(interestArray == null)
			{
				interestArray = new String[1];
				interestArray[0] = "empty";
			}
            for(int i=0; i<interestArray.length; i++)
            {
                if(i>0)
                {
                    interest = interest + "^";
                }
                interest = interest + interestArray[i];
            }
			String client = request.getRemoteAddr();

			String home2 = request.getParameter("home2");
			if(home2 == null || home2.length()==0)
			{
				home2 = "0000";
			}

			String home3 = request.getParameter("home3");
			if(home3 == null || home3.length()==0)
			{
				home3 = "0000";
			}

			String office2 = request.getParameter("office2");
			if(office2 == null || office2.length()==0)
			{
				office2 = "0000";
			}

			String office3 = request.getParameter("office3");
			if(office3 == null || office3.length()==0)
			{
				office3 = "0000";
			}

			String mobile2 = request.getParameter("mobile2");
			if(mobile2 == null || mobile2.length()==0)
			{
				mobile2 = "0000";
			}

			String mobile3 = request.getParameter("mobile3");
			if(mobile3 == null || mobile3.length()==0)
			{
				mobile3 = "0000";
			}

			String email = request.getParameter("email");
			if(email == null || email.length()==0)
			{
				email = "empty";
			}
			inputTable.put("id", id);
			inputTable.put("pass", pass);
			inputTable.put("passQ", passQ);
			inputTable.put("passA", entoKo(passA));
			inputTable.put("home1", home1);
			inputTable.put("home2", home2);
			inputTable.put("home3", home3);
			inputTable.put("office1", office1);
			inputTable.put("office2", office2);
			inputTable.put("office3", office3);
			inputTable.put("mobile1", mobile1);
			inputTable.put("mobile2", mobile2);
			inputTable.put("mobile3", mobile3);
			inputTable.put("zipCode1", zipCode1);
			inputTable.put("zipCode2", zipCode2);
			inputTable.put("addr1", entoKo(addr1));
			inputTable.put("addr2", entoKo(addr2));
			inputTable.put("email", email);
			inputTable.put("interest", interest);
			inputTable.put("client", client);

			UpdateBean ub = new UpdateBean();
			ub.setDataTable(inputTable);
			ub.funcExecute();
			ArrayList resultList = ub.getDataList();

			int resultCount = Integer.parseInt((String)((Hashtable)resultList.get(0)).get("COUNT"));
			if(resultCount>0)
			{
				message = "정상적으로 수정 되었습니다. 고맙습니다.";
			}
			else
			{
				message = "정보수정 도중 오류가 발행하였습니다. 다시 시도하시거나 관리자에게 문의 바랍니다.";
			}

			moveType = "FW";
			mode = "T";
            stepUrl = "/managerUserServlet.mo?func=managerUser_001";
		}
		// 회원 탈퇴 YN
		else if(func.equals("managerUser_005"))
		{
			String id = request.getParameter("id");
			String yn = request.getParameter("yn");
			String client = request.getRemoteAddr();

			inputTable.put("id", id);
			inputTable.put("client", client);
			inputTable.put("yn", yn);

			UserUseYnBean uuyb = new UserUseYnBean();
			uuyb.setDataTable(inputTable);
			uuyb.funcExecute();
			ArrayList resultList = uuyb.getDataList();

			int resultCount = Integer.parseInt((String)((Hashtable)resultList.get(0)).get("COUNT"));

			if(resultCount>0)
			{
				message = "작업이 성공적으로 수행되었습니다.";
			}
			else
			{
				message = "작업 진행중 Error가 발생하였습니다.";
			}

			moveType = "FW";
			mode = "T";
			stepUrl = "/managerUserServlet.mo?func=managerUser_001";
		}
		// 관리자 지정 YN
		else if(func.equals("managerUser_006"))
		{
			String id = request.getParameter("id");
			String yn = request.getParameter("yn");
			String client = request.getRemoteAddr();

			inputTable.put("id", id);
			inputTable.put("client", client);
			inputTable.put("yn", yn);

			UserAdminYnBean uayb = new UserAdminYnBean();
			uayb.setDataTable(inputTable);
			uayb.funcExecute();
			ArrayList resultList = uayb.getDataList();

			int resultCount = Integer.parseInt((String)((Hashtable)resultList.get(0)).get("COUNT"));
			stepUrl = "/managerUserServlet.mo?func=managerUser_002&id="+id;

			if(resultCount>0)
			{
				message = "관리자 및 일반회원 설정 작업이 성공적으로 수행되었습니다.";

				if(id.equals((String)session.getAttribute("id")) && yn.equals("N"))
				{
					session.setAttribute("adminYn", "N");
					stepUrl = "/managerUserServlet.mo?func=member_014";
					message = "관리자에서 일반회원으로 변경되었습니다. 이제 관리자 메뉴는 사용할 수 없습니다.";
				}
			}
			else
			{
				message = "관리자 및 일반회원 설정 작업 진행중 Error가 발생하였습니다.";
			}

			moveType = "FW";
			mode = "T";
			stepUrl = "/managerUserServlet.mo?func=managerUser_001";
		}
		// 회원가입 페이지 가기
		else if(func.equals("managerUser_007"))
		{
			// 관심 목록 가져오기
			InterestListBean ilb = new InterestListBean();
			ilb.funcExecute();
			ArrayList interestList = ilb.getDataList();
			outputTable.put("interestList", interestList);

			//passQ가져오기 
			PassQBean pqb = new PassQBean();
			pqb.funcExecute();
			ArrayList passQList = pqb.getDataList();
			outputTable.put("passQList", passQList);
			

			moveType = "FW";
			mode = "S";
			mainUrl = "/manager/user/UserAdd.jsp";
		}
		// 회원가입
		else if(func.equals("managerUser_008"))
		{
			String id = request.getParameter("id");
			String pass = request.getParameter("pass1");
			String passQ = request.getParameter("passQ");
			String passA = request.getParameter("passA");
			String name = request.getParameter("name");
			String jumin1 = request.getParameter("jumin1");
			String jumin2 = request.getParameter("jumin2");
			String home1 = request.getParameter("home1");
			String office1 = request.getParameter("office1");
			String mobile1 = request.getParameter("mobile1");
			String zipCode1 = request.getParameter("zipCode1");
			String zipCode2 = request.getParameter("zipCode2");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String client = request.getRemoteAddr();

			String home2 = request.getParameter("home2");
			if(home2 == null || home2.length()==0)
			{
				home2 = "0000";
			}

			String home3 = request.getParameter("home3");
			if(home3 == null || home3.length()==0)
			{
				home3 = "0000";
			}

			String office2 = request.getParameter("office2");
			if(office2 == null || office2.length()==0)
			{
				office2 = "0000";
			}

			String office3 = request.getParameter("office3");
			if(office3 == null || office3.length()==0)
			{
				office3 = "0000";
			}

			String mobile2 = request.getParameter("mobile2");
			if(mobile2 == null || mobile2.length()==0)
			{
				mobile2 = "0000";
			}

			String mobile3 = request.getParameter("mobile3");
			if(mobile3 == null || mobile3.length()==0)
			{
				mobile3 = "0000";
			}

			String email = request.getParameter("email");
			if(email == null || email.length()==0)
			{
				email = "empty";
			}

			String [] interestArray = request.getParameterValues("interest");
            String interest="";
			if(interestArray == null)
			{
				interestArray = new String[1];
				interestArray[0] = "empty";
			}
            for(int i=0; i<interestArray.length; i++)
            {
                if(i>0)
                {
                    interest = interest + "^";
                }
                interest = interest + interestArray[i];
            }

			inputTable.put("id", id);
			inputTable.put("pass", pass);
			inputTable.put("passQ", passQ);
			inputTable.put("passA", entoKo(passA));
			inputTable.put("name", entoKo(name));
			inputTable.put("jumin1", jumin1);
			inputTable.put("jumin2", jumin2);
			inputTable.put("home1", home1);
			inputTable.put("home2", home2);
			inputTable.put("home3", home3);
			inputTable.put("office1", office1);
			inputTable.put("office2", office2);
			inputTable.put("office3", office3);
			inputTable.put("mobile1", mobile1);
			inputTable.put("mobile2", mobile2);
			inputTable.put("mobile3", mobile3);
			inputTable.put("zipCode1", zipCode1);
			inputTable.put("zipCode2", zipCode2);
			inputTable.put("addr1", entoKo(addr1));
			inputTable.put("addr2", entoKo(addr2));
			inputTable.put("email", email);
			inputTable.put("interest", interest);
			inputTable.put("client", client);

			JoinBean jb = new JoinBean();
			jb.setDataTable(inputTable);
			jb.funcExecute();
			ArrayList resultList = jb.getDataList();

			//passQ가져오기 
			PassQBean pqb = new PassQBean();
			pqb.funcExecute();
			ArrayList passQList = pqb.getDataList();
			outputTable.put("passQList", passQList);

			int resultCount = Integer.parseInt((String)((Hashtable)resultList.get(0)).get("COUNT"));
			if(resultCount>0)
			{
				message = "회원 추가가 정상적으로 이루어졌습니다! 로그인하시면 서비스가 진행됩니다.";
			}
			else
			{
				message = "회원 추가가 되지 않았습니다. 다시 시도하거나, 관리자에게 문의하세요!";
			}

			moveType = "FW";
			mode = "T";
			mainUrl = "/manager/user/UserList.jsp";
		}
	}
}