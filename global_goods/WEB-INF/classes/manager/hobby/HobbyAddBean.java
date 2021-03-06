package manager.hobby;

import common.db.*;
import common.main.*;

import java.util.*;

public class HobbyAddBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String name = (String)inputTable.get("name");
		String id = (String)inputTable.get("id");
		String client = (String)inputTable.get("client");

		queryBuffer = new StringBuffer("");
		queryBuffer.append("INSERT INTO HOBBY (CODE, NAME, REG_ID, REG_DATE, REG_IP, UPD_ID, UPD_DATE, UPD_IP, USEYN) ");
		queryBuffer.append("VALUES ");
		queryBuffer.append("(LPAD(HOBBY_SEQ.NEXTVAL, 3, '0'), '"+name+"', '"+id+"', SYSDATE, '"+client+"', '"+id+"', SYSDATE, '"+client+"', 'Y')");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();
	}
}