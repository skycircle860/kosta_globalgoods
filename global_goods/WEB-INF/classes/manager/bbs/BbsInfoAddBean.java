package manager.bbs;

import common.db.*;
import common.main.*;
import common.util.*;

import java.util.*;

public class BbsInfoAddBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String name = (String)inputTable.get("name");
		String useYn = (String)inputTable.get("useYn");
		String perPage = (String)inputTable.get("perPage");
		String updateYn = (String)inputTable.get("updateYn");
		String searchYn = (String)inputTable.get("searchYn");
		String numberType = (String)inputTable.get("numberType");
		String replyYn = (String)inputTable.get("replyYn");
		String replySort = (String)inputTable.get("replySort");
		String addYn = (String)inputTable.get("addYn");
		String addSort = (String)inputTable.get("addSort");
		String fileYn = (String)inputTable.get("fileYn");

		String id = (String)inputTable.get("id");
		String client = (String)inputTable.get("client");

		String code = "BBS_" + TotalDate.getToday("yyyyMMddHHmmss");

		queryBuffer = new StringBuffer("");
		queryBuffer.append("INSERT INTO BBS_INFO (");
		queryBuffer.append("CODE, NAME, PER_PAGE, SEARCH_YN, REPLY_YN, REPLY_SORT, ");
		queryBuffer.append("ADD_YN, ADD_SORT, UPDATE_YN, NUMBER_TYPE, USE_YN, FILE_YN, ");
		queryBuffer.append("REG_ID, REG_DATE, REG_IP, UPD_ID, UPD_DATE, UPD_IP) VALUES (");
		queryBuffer.append("'"+code+"', '"+name+"', '"+perPage+"', '"+searchYn+"', '"+replyYn+"', '"+replySort+"', ");
		queryBuffer.append("'"+addYn+"', '"+addSort+"', '"+updateYn+"', '"+numberType+"', '"+useYn+"', '"+fileYn+"', ");
		queryBuffer.append("'"+id+"', SYSDATE, '"+client+"', '"+id+"', SYSDATE, '"+client+"')");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();
	}
}