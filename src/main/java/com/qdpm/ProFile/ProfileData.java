package com.qdpm.ProFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qdpm.GenericLib.IConstant;

public class ProfileData {
	static Properties pro;


	public static String getDataByKey(String key) {
		FileInputStream fis=null;
		pro=new Properties();
		try {
			fis=new FileInputStream(IConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(key);
	}

}
