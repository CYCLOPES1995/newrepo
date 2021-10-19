package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileUtility {
	/*
	 * author @GAURAV
	 */
	/**
	 * 
	 * @param jsonkey
	 * @return
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public String getJsonKeyValue(String jsonkey) throws IOException, ParseException {
		FileReader reader = new FileReader(IPathConstant.JSON_FILEPATH);
		JSONParser parser = new JSONParser();
       	Object object = parser.parse(reader);
       	@SuppressWarnings("rawtypes")
	    JSONObject jsonObject = (JSONObject)object;
       	String value = jsonObject.get(jsonkey).toString();
		
        return value;
		
	}
	/**
	 * author @GAURAV
	 */
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties p =new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
