package member;

import java.io.*;
import common.db.*;
import common.main.*;

public class JoinBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String id = (String)inputTable.get("id");
		String pass = (String)inputTable.get("pass");
		String name = (String)inputTable.get("name");
		String jumin1 = (String)inputTable.get("jumin1");
		String jumin2 = (String)inputTable.get("jumin2");
		String home1 = (String)inputTable.get("home1");
		String home2 = (String)inputTable.get("home2");
		String home3 = (String)inputTable.get("home3");
		String office1 = (String)inputTable.get("office1");
		String office2 = (String)inputTable.get("office2");
		String office3 = (String)inputTable.get("office3");
		String mobile1 = (String)inputTable.get("mobile1");
		String mobile2 = (String)inputTable.get("mobile2");
		String mobile3 = (String)inputTable.get("mobile3");
		String zipCode1 = (String)inputTable.get("zipCode1");
		String zipCode2 = (String)inputTable.get("zipCode2");
		String addr1 = (String)inputTable.get("addr1");
		String addr2 = (String)inputTable.get("addr2");
		String email = (String)inputTable.get("email");
		String client = (String)inputTable.get("client");
		String passQ = (String)inputTable.get("passQ");
		String passA = (String)inputTable.get("passA");
        String interest = (String)inputTable.get("interest");


		queryBuffer = new StringBuffer("");
		queryBuffer.append("INSERT INTO MEMBER (");
		queryBuffer.append("SEQ, ID, PASS, PASS_Q, PASS_A, NAME, JUMIN1, JUMIN2, HOME1, HOME2, HOME3, OFFICE1, OFFICE2, OFFICE3, MOBILE1, MOBILE2, MOBILE3, ");
		queryBuffer.append("ZIPCODE1, ZIPCODE2, ADDR1, ADDR2, EMAIL, INTEREST, REG_ID, REG_DATE, REG_IP, UPD_ID, UPD_DATE, UPD_IP, USEYN, ADMINYN");
		queryBuffer.append(") VALUES (");
		queryBuffer.append("MEMBER_SEQ.NEXTVAL, '"+id+"', '"+pass+"', '"+passQ+"', '"+passA+"', '"+name+"', '"+jumin1+"', '"+jumin2+"', '"+home1+"', '"+home2+"', '"+home3+"', ");
		queryBuffer.append("'"+office1+"', '"+office2+"', '"+office3+"', '"+mobile1+"', '"+mobile2+"', '"+mobile3+"', '"+zipCode1+"', '"+zipCode2+"', '"+addr1+"', '"+addr2+"', ");
		queryBuffer.append("'"+email+"', '"+interest+"', '"+id+"', SYSDATE, '"+client+"', '"+id+"', SYSDATE, '"+client+"', 'Y', 'N'");
		queryBuffer.append(")");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();
	}
}