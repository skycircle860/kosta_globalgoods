package common.util;

import java.io.*;
import java.util.*;
import common.db.*;

public class ItemFileManager
{
	public ArrayList getGoodsImgList(Hashtable goodsTable) throws Exception
	{
		String middleCategory = (String)goodsTable.get("middleCategory");

		StringBuffer queryBuffer = new StringBuffer("");
		queryBuffer.append("SELECT SEQ, GOODS_CODE, ORG_NAME, SAVE_NAME, PATH, FILE_SIZE ");
		queryBuffer.append("FROM GOODS_IMG WHERE MIDDLE_CATEGORY="+middleCategory+" AND DISPYN='Y' ORDER BY ORG_NAME DESC");
		DBExecute dbe = new DBExecute(queryBuffer.toString());

		return dbe.getDataList();
	}

	public ArrayList getGoodsSimleImgList(Hashtable goodsTable) throws Exception
	{
		String code = (String)goodsTable.get("code");

		StringBuffer queryBuffer = new StringBuffer("");
		queryBuffer.append("SELECT SEQ, GOODS_CODE, ORG_NAME, SAVE_NAME, PATH, FILE_SIZE ");
		queryBuffer.append("FROM GOODS_IMG WHERE GOODS_CODE='"+code+"' AND DISPYN='Y' ORDER BY ORG_NAME DESC");
		DBExecute dbe = new DBExecute(queryBuffer.toString());

		return dbe.getDataList();
	}

	public int deleteFile(Hashtable inputTable) throws Exception
	{
		String id = (String)inputTable.get("id");
		String client = (String)inputTable.get("client");
		String[] deleteFileArray = (String[])inputTable.get("deleteFile");
		if(deleteFileArray.length==0)
		{
			return 0;
		}

		StringBuffer queryBuffer = new StringBuffer("");
		queryBuffer.append("UPDATE GOODS_IMG SET DISPYN='N', UPD_ID='"+id+"', UPD_DATE=SYSDATE, UPD_IP='"+client+"' WHERE ");

		//파일 저장 및 DB 등록
		for(int i=0; i<deleteFileArray.length; i++)
		{
			if(i!=0)
			{
				queryBuffer.append(" OR ");
			}
			String fileSeq = deleteFileArray[i];
			queryBuffer.append("SEQ="+fileSeq);
		}

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		dbe.getDataList();

		return deleteFileArray.length;
	}

	public int uploadFile(Hashtable inputTable) throws Exception
	{
		int uploadCount = 0;
		String code = (String)inputTable.get("code");
		String id = (String)inputTable.get("id");
		String client = (String)inputTable.get("client");
		String maincategory= (String)inputTable.get("maincategory");
		String middlecategory= (String)inputTable.get("middlecategory");
		String subcategory= (String)inputTable.get("subcategory");
		ArrayList uploadFileList = (ArrayList)inputTable.get("uploadFile");

		for(int i=0; i<uploadFileList.size(); i++)
		{
			Hashtable uploadFileTable = (Hashtable)uploadFileList.get(i);
			String savePath = (String)uploadFileTable.get("savePath");
			savePath = savePath.replace('\\', '/');

			String orgFileName = (String)uploadFileTable.get("orgFileName");
			String saveFileName = (String)uploadFileTable.get("saveFileName");

			orgFileName = orgFileName.replaceAll("'", "''");
			saveFileName = saveFileName.replaceAll("'", "''");

			File file = new File(savePath, saveFileName);
			long fileSize = file.length();
			
			System.out.println("이거 불러오긴하니??");
			//DB에 등록
			StringBuffer queryBuffer = new StringBuffer("");
			queryBuffer.append("INSERT INTO GOODS_IMG (SEQ, GOODS_CODE,MAIN_CATEGORY, MIDDLE_CATEGORY, SUB_CATEGORY, PATH, ORG_NAME, SAVE_NAME, FILE_SIZE, REG_ID, REG_IP, UPD_ID, UPD_IP) ");
			queryBuffer.append("VALUES (GOODS_IMG_SEQ.NEXTVAL, '"+code+"' , '"+maincategory+"', '"+middlecategory+"', '"+subcategory+"', '"+savePath+"', '"+orgFileName+"', '"+saveFileName+"', "+fileSize+", '"+id+"', '"+client+"', '"+id+"', '"+client+"')");
System.out.println(queryBuffer.toString());
			DBExecute dbe = new DBExecute(queryBuffer.toString());
			if(Integer.parseInt((String)((Hashtable)(dbe.getDataList()).get(0)).get("COUNT")) > 0)
			{
				uploadCount++;
			}
		}

		return uploadCount;
	}
}