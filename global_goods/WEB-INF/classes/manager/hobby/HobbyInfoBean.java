package manager.hobby;

import common.db.*;
import common.main.*;

public class HobbyInfoBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String code = (String)inputTable.get("code");

		queryBuffer = new StringBuffer("");
		queryBuffer.append("SELECT CODE, NAME, USEYN, REG_ID, TO_CHAR(REG_DATE, 'YYYY-MM-DD AM HH:MI:SS') REG_DATE, REG_IP, UPD_ID, TO_CHAR(UPD_DATE, 'YYYY-MM-DD AM HH:MI:SS') UPD_DATE, UPD_IP FROM HOBBY WHERE CODE='" + code + "'");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();
	}
}