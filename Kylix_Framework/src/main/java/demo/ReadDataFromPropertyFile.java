package demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void  readDataPromPropertyFile() throws Throwable {
      /*read the data from property file*/
		//Step1: get the java representation object of the physical file*
		FileInputStream fis = new FileInputStream("./Data/CommonData.properties");
		//Step2: create an object of the properties class & load the all keys: value pair
		Properties pobj = new Properties();
		pobj.load(fis);
		//Step3: read the value using getproperty("key")
		String url = pobj.getProperty("URL");
		String un = pobj.getProperty("USERNAME");
		String browser = pobj.getProperty("BROWSER");
		String pwd = pobj.getProperty("PASSWORD");
		System.out.println("url"+" "+url);
		System.out.println("username"+" "+un);
		System.out.println("browser"+" "+browser);
		System.out.println("password"+" "+pwd);
		
	}

}
