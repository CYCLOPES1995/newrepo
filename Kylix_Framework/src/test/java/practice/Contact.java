package practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Contact {
	@Test
	public void org(XmlTest xml) {
		System.out.println("executed1");
		String URL = xml.getParameter("url");
		String UN = xml.getParameter("username");
		System.out.println(URL);
		System.out.println(UN);
	}

}
