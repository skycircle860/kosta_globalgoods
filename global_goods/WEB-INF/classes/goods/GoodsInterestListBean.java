package goods;

import java.io.*;
import common.db.*;
import common.main.*;
import java.util.*;

public class GoodsInterestListBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String id = (String)inputTable.get("id");
		String alignSelect = (String)inputTable.get("alignSelect");

		queryBuffer = new StringBuffer("");
//���ϲ����� ��
		queryBuffer.append("SELECT b.*, a.*, c.* FROM (SELECT GOODS_CODE, ORG_NAME, SAVE_NAME, ");
		queryBuffer.append("PATH FROM GOODS_IMG WHERE DISPYN='Y') a, (");
//���ϲ����� ��

		queryBuffer.append("SELECT ROWNUM DATA_NUM, MEMBER_ID, GOODS_CODE, ");
		queryBuffer.append("REG_ID, UPD_DATE FROM INTEREST_GOODS_LIST "); 
//���ϲ����� ��
		queryBuffer.append(") b, (SELECT CODE, QUANTITY, PAR_PRICE, NAME FROM GOODS) c ");
		queryBuffer.append("WHERE b.GOODS_CODE=a.GOODS_CODE(+) AND MEMBER_ID = '"+id+"' AND b.GOODS_CODE = c.CODE ");
		queryBuffer.append("ORDER BY c.NAME");
		
//���ϲ����� ��

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		




		//���� ������
		ArrayList tempList = dbe.getDataList();

		String dataNum = "";
		ArrayList fileList = new ArrayList();
		Hashtable goodsTable;
		for(int i=0; i<tempList.size(); i++)
		{
			Hashtable tempTable = (Hashtable)tempList.get(i);
			String tempDataNum = (String)tempTable.get("DATA_NUM");
			String tempOrgName = (String)tempTable.get("ORG_NAME");
			String tempSaveName = (String)tempTable.get("SAVE_NAME");
			String tempPath = (String)tempTable.get("PATH");
			
			
			if(!dataNum.equals(tempDataNum))
			{
				tempTable.remove("ORG_NAME");
				tempTable.remove("SAVE_NAME");
				tempTable.remove("PATH");

				goodsTable = tempTable;

				fileList = new ArrayList();
				dataNum = tempDataNum;

				goodsTable.put("FILE_LIST", fileList);
				outputList.add(goodsTable);
			}

			Hashtable fileTable = new Hashtable();
			fileTable.put("ORG_NAME", tempOrgName);
			fileTable.put("SAVE_NAME", tempSaveName);
			fileTable.put("PATH", tempPath);
			
			fileList.add(fileTable);

			System.out.println("INTEREST_IMG : "+tempSaveName);
		}
	}
}