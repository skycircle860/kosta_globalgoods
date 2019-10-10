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

		// conf_list.conf �б�
		String fileName = confRoot+"conf/conf_list.conf";
		ReadFile rf = new ReadFile(fileName);
		rf.readData();
		ArrayList confList = rf.getReadDataList();

		// conf_list.conf ���� Setting
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

		// conf_list ����� conf ���� �б�
		Enumeration enu = confListTable.keys();
		while(enu.hasMoreElements())
		{
			String confKey = (String)enu.nextElement();
			fileName = confRoot + (String)confListTable.get(confKey);
			rf = new ReadFile(fileName);
			rf.readData();
			ArrayList tempConfList = rf.getReadDataList();

			// ���� conf ���� ���� Setting.
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

		// contextRoot confTable�� �־��ֱ�
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
		confTable.put("bbsInfoList", bbsInfoList);	//�Խ����� �������� ��� ����Ʈ�� �������̺��� �־���
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