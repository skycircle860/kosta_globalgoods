package member;

import java.sql.*;
import java.io.*;
import java.util.*;

import common.db.*;
import common.main.*;

public class  PassQBean extends MainBean
{
	public void funcExecute() throws Exception
	{
		queryBuffer = new StringBuffer();
		queryBuffer.append("SELECT CODE, PASS_Q FROM PASS_Q WHERE USEYN = 'Y'");
		DBExecute dbe = new DBExecute(queryBuffer.toString());
		outputList = dbe.getDataList();
	}
}
