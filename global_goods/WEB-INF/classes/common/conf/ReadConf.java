package common.conf;

import java.util.*;
import java.io.*;

import common.conf.*;
import manager.bbs.*;

public class ReadConf
{
	private static ReadConf rc = new ReadConf();

	private static Hashtable confTable;

	private ReadConf(){}

	public void setReadData(String confRoot) throws IOException
	{
		int endIndex = confRoot.length()-1;
		if('/' != confRoot.charAt(endIndex))
		{
			confRoot = confRoot + "/";
		}

		Hashtable confListTable = new Hashtable();
		confTable = new Hashtable();

		System.out.println("\n### CONF FILES LOADING START ##################################################");
		System.out.println(".......... Confile Path Root = " + confRoot);

		// conf_list.conf 읽기
		String fileName = confRoot+"conf/conf_list.conf";
		ReadFile rf = new ReadFile(fileName);
		rf.readData();
		ArrayList confList = rf.getReadDataList();

		// conf_list.conf 내용 Setting
		for(int i=0; i<confList.size(); i++)
		{
			String confListLine = (String)confList.get(i);
			if(!(confListLine.trim()).startsWith("**"))
			{
				String confListKey = (confListLine.substring(0, confListLine.indexOf("="))).trim();
				String confListValue = (confListLine.substring(confListLine.indexOf("=") + 1)).trim();
				confListTable.put(confListKey, confListValue);
			}
		}

		// conf_list 목록의 conf 파일 읽기
		Enumeration enu = confListTable.keys();
		while(enu.hasMoreElements())
		{
			String confKey = (String)enu.nextElement();
			fileName = confRoot + (String)confListTable.get(confKey);
			rf = new ReadFile(fileName);
			rf.readData();
			ArrayList tempConfList = rf.getReadDataList();

			// 읽은 conf 파일 내용 Setting.
			Hashtable tempConfTable = new Hashtable();
			for(int i=0; i<tempConfList.size(); i++)
			{
				String tempConfLine = (String)tempConfList.get(i);
				if(!(tempConfLine.trim()).startsWith("**"))
				{
					String tempConfKey = (tempConfLine.substring(0, tempConfLine.indexOf("="))).trim();
					String tempConfValue = (tempConfLine.substring(tempConfLine.indexOf("=") + 1)).trim();
					tempConfTable.put(tempConfKey, tempConfValue);
				}
			}

			confTable.put(confKey, tempConfTable);
		}

		// contextRoot confTable에 넣어주기
		Hashtable rootTable = new Hashtable();
		rootTable.put("ContextRoot", confRoot);
		confTable.put("Root", rootTable);

		System.out.println("###############################################################################\n");
	}

	public void setReadDBData() throws Exception
	{
		System.out.println("\n### CONF DATABASE LOADING START #############################################");
		BbsInfoListBean bilb = new BbsInfoListBean();
		bilb.funcExecute();
		ArrayList bbsInfoList = bilb.getDataList();
		confTable.put("bbsInfoList", bbsInfoList);	//게시판의 정보들이 담긴 리스트를 컨프테이블에 넣어줌
		System.out.println("###############################################################################\n");
	}

	public static ReadConf getReadConf()
	{
		return rc;
	}

	public Hashtable getConfTable()
	{
		return confTable;
	}
}