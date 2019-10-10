package bbs;

import common.db.*;
import common.main.*;

import java.util.*;

public class BbsWriteBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		String code = (String)inputTable.get("code");
		BbsInfomation bi = new BbsInfomation(code);

		String id = (String)inputTable.get("id");
		String title = (String)inputTable.get("title");
		String content = (String)inputTable.get("content");
		String client = (String)inputTable.get("client");

		if(title.indexOf("'") != -1)
		{
			title = title.replaceAll("'", "''");
		}

		if(content.indexOf("'") != -1)
		{
			content = content.replaceAll("'", "''");
		}

		String seq = getNextSeq();
		inputTable.put("seq", seq);

		queryBuffer = new StringBuffer("");
		queryBuffer.append("INSERT INTO BBS (");
		queryBuffer.append("SEQ, CODE, GROUP_NUM, TITLE, CONTENT, REG_ID, REG_IP, UPD_ID, UPD_IP");
		queryBuffer.append(") VALUES (");
		queryBuffer.append(seq + ", '"+code+"', "+seq+", '"+title+"', '"+content+"', '"+id+"', '"+client+"', '"+id+"', '"+client+"'");
		queryBuffer.append(")");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();

		if(bi.getFileYn())
		{
			//업로드 파일
			BbsFileManager bfm = new BbsFileManager();
			int uploadCount = bfm.uploadFile(inputTable);

			inputTable.put("uploadFile", uploadCount+"");	//여기서 값의 교체가 일어나는 모양이다. 이게 bbs서블릿의 테이블과 같은곳을 가리키고 있기에 여기서 교체해줘도 적용되는것 같다.
		}
		else
		{
			inputTable.put("uploadFile", "0");	//업로드 된 파일이 없을 경우 0 으로 치환
		}
	}

	private String getNextSeq() throws Exception //시퀀스를 파일 업로드에도 쓰고 글에서도 쓰기때문에 미리 얻어와야함.
	{
		queryBuffer = new StringBuffer("");
		queryBuffer.append("SELECT BBS_SEQ.NEXTVAL NEXT_SEQ FROM DUAL");

		DBExecute dbe = new DBExecute(queryBuffer.toString());
		ArrayList seqList =dbe.getDataList();
		Hashtable seqTable = (Hashtable)seqList.get(0);
		return (String)seqTable.get("NEXT_SEQ");	//미리 증가시킨 시퀀스값의 리턴
	}
}