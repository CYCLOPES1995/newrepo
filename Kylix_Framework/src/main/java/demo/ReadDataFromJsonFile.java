package demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJsonFile {
	@Test
//	public void getDataFromJson() throws Throwable {
//		FileReader reader = new FileReader("./Data/CommonData.json");
//		//FileInputStream reader = new FileInputStream("./Data/CommonData.json");
//		JSONParser parser = new JSONParser();
//		Object object = parser.parse(reader);
//		JSONObject jsonobject = (JSONObject)object;
//		String url = jsonobject.get("url").toString();
//		String browser = jsonobject.get("browser").toString();
//		String username = jsonobject.get("username").toString();
//		String password = jsonobject.get("password").toString();
//		System.out.println(url);
//		System.out.println(browser);
//		System.out.println(username);
//		System.out.println(password);
//	}

	public void  readDataFromJson() throws Throwable
	{
		FileReader reader = new FileReader("./Data/CommonData.json");
		JSONParser parser = new JSONParser();
       	Object object = parser.parse(reader);
       	@SuppressWarnings("rawtypes")
		HashMap map = (HashMap)object;
       	String url = map.get("url").toString();
		String browser = map.get("browser").toString();
		String username = map.get("username").toString();
        String password = map.get("password").toString();
		System.out.println(url);
		System.out.println("BROWSER"+" "+"--->"+" "+browser);
	    System.out.println("USERNAME"+" "+"--->"+" "+username);
		System.out.println("PASSWORD"+" "+"--->"+" "+password);
	}
}
