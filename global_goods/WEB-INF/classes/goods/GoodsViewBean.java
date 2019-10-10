package goods;

import java.io.*;
import common.db.*;
import common.main.*;
import java.util.*;

public class GoodsViewBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String code = (String)inputTable.get("code");

		queryBuffer = new StringBuffer("");
//		queryBuffer.append("SELECT CODE,SUB_CATEGORY,NAME,QUANTITY,GOODS_AMOUNT,ORG_PRICE,PAR_PRICE, COUNTRY,COMPANY,GOODS_COMMENT,");
//		queryBuffer.append("REG_ID, UPD_DATE FROM GOODS WHERE CODE='"+code+"'");




		queryBuffer.append("SELECT b.*, a.*, c.*, d.* FROM (SELECT GOODS_CODE, ORG_NAME, SAVE_NAME, ");
		queryBuffer.append("PATH FROM GOODS_IMG WHERE DISPYN='Y') a,(SELECT CODE SC_CODE ,NAME SC_NAME FROM SUB_CATEGORY) c, (SELECT CODE MC_CODE, NAME MC_NAME FROM MIDDLE_CATEGORY) d, (");
//���ϲ����� ��

		queryBuffer.append("SELECT ROWNUM DATA_NUM, CODE,SUB_CATEGORY, MIDDLE_CATEGORY,NAME,QUANTITY,GOODS_AMOUNT ,ORG_PRICE,PAR_PRICE, COUNTRY,COMPANY,GOODS_COMMENT,");
		queryBuffer.append("REG_ID, UPD_DATE FROM GOODS WHERE CODE = '"+code+"' ");

//���ϲ����� ��
		queryBuffer.append(") b WHERE b.CODE=a.GOODS_CODE(+) AND b.MIDDLE_CATEGORY = d.MC_CODE AND b.SUB_CATEGORY = c.SC_CODE");

		DBExecute dbe = new DBExecute(queryBuffer.toString());



		//���� ������
		//���� ������
		ArrayList tempList = dbe.getDataList();

		System.out.println("**************����� ViewBean***********");
		System.out.println("*****************************************");
		//System.out.println("tempList : "+tempList);
		System.out.println("****************************************");

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
			
			System.out.println("tempSaveName : "+tempSaveName);
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
		}
		for (int i = 0;i<fileList.size() ;i++ )
		{
			System.out.println("fileList : "+fileList.get(i)+"\n\n");
		}
	}
}