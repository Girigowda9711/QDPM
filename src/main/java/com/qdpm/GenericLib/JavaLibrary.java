package com.qdpm.GenericLib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaLibrary {
	
	public String getDateTime() {
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateformat = format.format(date);
		return dateformat;
	}

}
