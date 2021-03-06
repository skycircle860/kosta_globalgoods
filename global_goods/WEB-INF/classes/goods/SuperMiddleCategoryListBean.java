package goods;

import common.db.*;
import common.main.*;
import java.util.*;

public class SuperMiddleCategoryListBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String middleCategory = (String)inputTable.get("middleCategory");
	
		queryBuffer = new StringBuffer("");
		queryBuffer.append("SELECT a.CODE, a.MAIN_CATEGORY, a.MIDDLE_CATEGORY, a.NAME, a.USEYN, a.REG_ID, a.REG_DATE, a.REG_IP, a.UPD_ID, a.UPD_DATE, a.UPD_IP, b.NAME MIDDLE_CATEGORY_NAME, b.CODE MIDDLE_CATEGORY_CODE FROM SUB_CATEGORY a, MIDDLE_CATEGORY b WHERE a.MIDDLE_CATEGORY='"+middleCategory+"' AND a.MIDDLE_CATEGORY = b.CODE ");

		DBExecute dbe = new DBExecute(queryBuffer.toString());		
		outputList = dbe.getDataList();
		
	}
}